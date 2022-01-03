package services;

import dao.SensitivityRepository;
import entities.Sensitivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
