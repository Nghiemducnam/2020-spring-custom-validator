package com.example.springcustomvalidator.services;

import com.example.springcustomvalidator.dto.PersonDTO;
import com.example.springcustomvalidator.dto.transactionBodyRq.ReqDTO;
import com.example.springcustomvalidator.models.Person;

import java.util.List;

public interface PersonService {
    public void createPerson(ReqDTO<PersonDTO> rq);

    List<Person> getAllPerson();

    List<Person> getPersonsByDate(PersonDTO dto);
}
