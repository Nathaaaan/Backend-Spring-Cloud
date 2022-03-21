package com.example.backendsoringcloud.web;

import com.example.backendsoringcloud.entities.Sensitivity;
import org.springframework.web.bind.annotation.*;
import com.example.backendsoringcloud.services.SensitivityService;

import java.util.List;
import java.util.Optional;

/**
 * This class represents the REST Controller for the Sensitivity Entity
 */
@RestController @RequestMapping("sensitivities")
public class SensitivityRestController {

    /**
     * The sensitivityService is the variable that will affect the repository and the database
     */
    private final SensitivityService sensitivityService;

    /**
     * This is the constructor of the Sensitivity REST Controller class
     * @param sensitivityService the Sensitivity Service
     */
    public SensitivityRestController(SensitivityService sensitivityService) {
        this.sensitivityService = sensitivityService;
    }

    /**
     * This method is called when the HTTP Request Method is GET and the URL is /sensitivities
     * @return All the sensitivities
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public List<Sensitivity> getSensitivities(){
        return sensitivityService.getSensitivities();
    }

    /**
     * This method is called when the HTTP Request Method is GET and the URL is /sensitivities/{id}
     * @param id The ID of the sensitivity we want to get
     * @return The sensitivity that have this specific ID
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Sensitivity> getSensitivityById(@PathVariable int id){
        return sensitivityService.getSensitivityById(id);
    }

    /**
     * This method is called when the HTTP Request Method is POST and the URL is /sensitivities with params
     * @param gameName the name of the game
     * @param sensitivityValue the value of the sensitivity
     * @param resolutionValue the value of the screen resolution
     * @param playerName the name of the player
     * @return a new Sensitivity
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", params = {"gameName", "sensitivityValue", "resolutionValue", "playerName"})
    Sensitivity newSensitivity(@RequestParam String gameName, @RequestParam double sensitivityValue, @RequestParam String resolutionValue, @RequestParam String playerName) {

        return sensitivityService.newSensitivity(gameName, sensitivityValue, resolutionValue, playerName);
    }

    /**
     * This method is called when the HTTP Request Method is PUT and the URL is /sensitivities with params
     * @param questionId the ID of the sensitivty to change
     * @param gameName the game of the name
     * @param sensitivityValue the value of the sensitivity
     * @param resolutionValue the value of the resolution
     * @param playerName the name of the player
     * @return a new Sensitivity if it does not exists or it change an existing sensitivity
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", params = {"questionId" , "gameName", "sensitivityValue", "resolutionValue", "playerName"})
    Sensitivity replaceSensitivity(@RequestParam int questionId, @RequestParam String gameName, @RequestParam double sensitivityValue, @RequestParam String resolutionValue, @RequestParam String playerName) {
        return sensitivityService.replaceSensitivity(questionId, gameName, sensitivityValue, resolutionValue, playerName);
    }

    /**
     * This method is called when the HTTP Request Method is DELETE and the URL is /sensitivities/{id}
     * @param id the ID of the sensitivity to delete
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteSensitivity(@PathVariable int id) {
        sensitivityService.deleteSensitivity(id);
    }
}
