package one.digital.inovation.peopleregistrerapi.controller;

import lombok.AllArgsConstructor;
import one.digital.inovation.peopleregistrerapi.dto.request.PersonDTO;
import one.digital.inovation.peopleregistrerapi.dto.response.MessageResponseDTO;
import one.digital.inovation.peopleregistrerapi.entity.Person;
import one.digital.inovation.peopleregistrerapi.exception.PersonNotFoundException;
import one.digital.inovation.peopleregistrerapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

    @RestController
    public class PersonController {

        private PersonService personService;
        @GetMapping("api/v1/people")
        public String getTest(){
            return "<h1>Teste executado com sucesso</h1>";
        }
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public MessageResponseDTO createPerson(@RequestBody Person person) {
            return personService.createPerson(person);
        }

    }

