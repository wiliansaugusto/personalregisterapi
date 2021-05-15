package one.digital.inovation.peopleregistrerapi.service;

import one.digital.inovation.peopleregistrerapi.dto.request.PersonDTO;
import one.digital.inovation.peopleregistrerapi.dto.response.MessageResponseDTO;
import one.digital.inovation.peopleregistrerapi.entity.Person;
import one.digital.inovation.peopleregistrerapi.exception.PersonNotFoundException;
import one.digital.inovation.peopleregistrerapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository personRepository;


    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder()
                .message("Created person with ID:"+savedPerson.getId()).build();
    }


}
