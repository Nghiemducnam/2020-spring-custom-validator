package com.example.springcustomvalidator.dto;

import com.example.springcustomvalidator.validators.DateFormatConstraint;
import com.example.springcustomvalidator.validators.IdentityFormatConstraint;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;


@Getter
@Setter
public class PersonDTOTime {

    private Long id;

    @NotEmpty(message = "name is not empty")
    private String name;

    @NotEmpty(message = "address is not empty")
    private String address;

    @DateFormatConstraint
//    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime fromDate;

    @DateFormatConstraint
//    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime toDate;

//    private String timeUpdate;

    @IdentityFormatConstraint(message = "Identity code in valid")
    @NotEmpty(message = "identity is not empty")
    private String identityCode;
}
