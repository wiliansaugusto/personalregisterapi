package one.digital.inovation.peopleregistrerapi.repository;

import one.digital.inovation.peopleregistrerapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {

}
