package com.example.backendsoringcloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendsoringcloudApplication implements CommandLineRunner {
    //TODO Les classes et repositories
    //TODO Code here

    //@Autowired
    //    private QuestionnaireRepository questionnaireRepository;
    public static void main(String[] args) {
        SpringApplication.run(BackendsoringcloudApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application is running in console");
        //TODO Code here
    }
}
