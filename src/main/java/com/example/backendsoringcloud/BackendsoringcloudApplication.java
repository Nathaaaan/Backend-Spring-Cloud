package com.example.backendsoringcloud;

import com.example.backendsoringcloud.dao.SensitivityRepository;
import com.example.backendsoringcloud.entities.Sensitivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendsoringcloudApplication implements CommandLineRunner {
    //TODO Les classes et repositories
    //TODO Code here

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
        //sensitivityRepository.save(new Sensitivity("Warzone", 6.9, "16/9"));
        //TODO Code here
    }
}
