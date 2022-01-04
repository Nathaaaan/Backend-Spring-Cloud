package com.example.backendsoringcloud.services;

import com.example.backendsoringcloud.entities.Sensitivity;
import com.example.backendsoringcloud.dao.SensitivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensitivityService {

    /**
     * The repository
     */
    @Autowired
    private SensitivityRepository sensitivityRepository;

    /**
     * Get all sensitivities
     * @return list of all sensitivities
     */
    public List<Sensitivity> getSensitivities(){
        return sensitivityRepository.findAll();
    }

    /**
     * Get a sensitivity by its id
     * @param id the id of the sensitivity
     * @return the sensitivity with this id
     */
    public Optional<Sensitivity> getSensitivityById(int id){
        return sensitivityRepository.findById(id);
    }

    public Sensitivity newSensitivity(String gameName, double sensitivityValue, String resolutionValue, String playerName) {

        Sensitivity newSensitivity = new Sensitivity(gameName, sensitivityValue, resolutionValue, playerName);
        return sensitivityRepository.save(newSensitivity);
    }

    public Sensitivity replaceSensitivity(int questionId, String gameName, double sensitivityValue, String resolutionValue, String playerName) {

        return sensitivityRepository.findById(questionId)
                .map(sensitivity ->{
                    sensitivity.setGameName(gameName);
                    sensitivity.setSensitivityValue(sensitivityValue);
                    sensitivity.setResolutionValue(resolutionValue);
                    sensitivity.setPlayerName(playerName);
                    return sensitivityRepository.save(sensitivity);
                }).orElseGet(() -> {
                    Sensitivity newSensitivity = new Sensitivity(gameName, sensitivityValue, resolutionValue, playerName);
                    newSensitivity.setQuestionId(questionId);
                    return sensitivityRepository.save(newSensitivity);
                });
    }

    /**
     * Delete a sensitivity by its ID
     * @param id the id of the sensitivity to delete
     */
    public void deleteSensitivity(int id) {
        sensitivityRepository.deleteById(id);
    }
}
