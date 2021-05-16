package one.digital.inovation.peopleregistrerapi.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {


    private Long id;


    private String firstName;


    private String lastName;


    private String cpf;

    private String birthDate;

    private String rg;

    private List<PhoneDTO> phones;
}