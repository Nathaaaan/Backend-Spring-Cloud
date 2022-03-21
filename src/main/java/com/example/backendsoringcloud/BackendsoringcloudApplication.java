package com.example.backendsoringcloud;

import com.example.backendsoringcloud.dao.SensitivityRepository;
//import com.example.backendsoringcloud.entities.Sensitivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendsoringcloudApplication implements CommandLineRunner {

    //TODO Le readme

    @Autowired
    private SensitivityRepository sensitivityRepository;

    public BackendsoringcloudApplication(SensitivityRepository sensitivityRepository) {
        this.sensitivityRepository = sensitivityRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BackendsoringcloudApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application is running in console");
        //sensitivityRepository.save(new Sensitivity("CoD: Vanguard", 6.9, "16/9", "Natix"));
        //sensitivityRepository.save(new Sensitivity("CoD: Vanguard", 7.0, "16/9", "Nekto"));
    }
}
