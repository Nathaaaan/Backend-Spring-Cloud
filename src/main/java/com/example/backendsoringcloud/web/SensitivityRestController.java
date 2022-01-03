package com.example.backendsoringcloud.web;

import com.example.backendsoringcloud.entities.Sensitivity;
import org.springframework.web.bind.annotation.*;
import com.example.backendsoringcloud.services.SensitivityService;

import java.util.List;
import java.util.Optional;

@RestController @RequestMapping("sensitivities")
public class SensitivityRestController {

    private final SensitivityService sensitivityService;

    public SensitivityRestController(SensitivityService sensitivityService) {
        this.sensitivityService = sensitivityService;
    }

    /**
     * Methode appelée lorsque l'url est /sensitivities
     * @return toutes les sensitivities
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET)
    public List<Sensitivity> getSensitivities(){
        return sensitivityService.getSensitivities();
    }

    /**
     * Méthode appelée lorsque l'url est /sensitivities/{id}
     * @param id l'id de la sensitivities
     * @return La sensitivities qui porte cet ID
     */
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Sensitivity> getSensitivityById(@PathVariable int id){
        return sensitivityService.getSensitivityById(id);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", params = {"gameName", "sensitivityValue", "resolutionValue"})
    Sensitivity newSensitivity(@RequestParam String gameName, @RequestParam double sensitivityValue, @RequestParam String resolutionValue) {

        return sensitivityService.newSensitivity(gameName, sensitivityValue, resolutionValue);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", params = {"questionId" , "gameName", "sensitivityValue", "resolutionValue"})
    Sensitivity replaceSensitivity(@RequestParam int questionId, @RequestParam String gameName, @RequestParam double sensitivityValue, @RequestParam String resolutionValue) {
        return sensitivityService.replaceSensitivity(questionId, gameName, sensitivityValue, resolutionValue);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteSensitivity(@PathVariable int id) {
        sensitivityService.deleteSensitivity(id);
    }
}
