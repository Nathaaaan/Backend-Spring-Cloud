package com.example.backendsoringcloud.services;

import com.example.backendsoringcloud.entities.Sensitivity;
import com.example.backendsoringcloud.dao.SensitivityRepository;
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
