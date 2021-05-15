package one.digital.inovation.peopleregistrerapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digital.inovation.peopleregistrerapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;


    private String number;
}
