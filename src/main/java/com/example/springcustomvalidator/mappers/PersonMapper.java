package com.example.springcustomvalidator.mappers;

import com.example.springcustomvalidator.dto.PersonDTO;
import com.example.springcustomvalidator.models.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public Person toEntity(PersonDTO dto) {
        if (dto == null) {
            return null;
        }
        Person temporary = new Person();
        BeanUtils.copyProperties(dto, temporary);
        return temporary;
    }

    public PersonDTO toDto(Person entity) {
        if (entity == null) {
            return null;
        }
        PersonDTO dto = new PersonDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
