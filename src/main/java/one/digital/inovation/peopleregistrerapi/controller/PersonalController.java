package one.digital.inovation.peopleregistrerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/people")

public class PersonalController {

    @GetMapping
    public String getBook(){
            return "APi teste executado com sucesso, github e heroku";
    }
}
