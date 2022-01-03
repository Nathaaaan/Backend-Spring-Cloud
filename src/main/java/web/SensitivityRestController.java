package web;

import entities.Sensitivity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import services.SensitivityService;

import java.util.List;

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
}
