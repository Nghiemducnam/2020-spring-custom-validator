package com.example.springcustomvalidator.controllers;

import com.example.springcustomvalidator.dto.PersonDTO;
import com.example.springcustomvalidator.dto.transactionBodyRq.ReqDTO;
import com.example.springcustomvalidator.models.Person;
import com.example.springcustomvalidator.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public ResponseEntity<Void> createPerson(@Valid @RequestBody ReqDTO<PersonDTO> rq){
        this.personService.createPerson(rq);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/getPerson")
    public ResponseEntity<List<Person>> createPerson(){

        return new ResponseEntity<>(this.personService.getAllPerson(), HttpStatus.OK);
    }

    @PostMapping("/get-person-by-date")
    public ResponseEntity<List<Person>> getPersonsByDate(@Valid @RequestBody PersonDTO personDTO){

        return new ResponseEntity<>(this.personService.getPersonsByDate(personDTO),HttpStatus.OK);
    }
}
