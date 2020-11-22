package com.example.springcustomvalidator.services.Impl;

import com.example.springcustomvalidator.dto.PersonDTO;
import com.example.springcustomvalidator.mappers.PersonMapper;
import com.example.springcustomvalidator.models.Person;
import com.example.springcustomvalidator.repositories.PersonRepository;
import com.example.springcustomvalidator.services.PersonService;
import com.example.springcustomvalidator.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    public final static String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";
    public final static DateTimeFormatter FORMATTER = DateTimeFormatter
            .ofPattern(DATE_FORMAT)
            .withZone(ZoneId.of("Asia/Ho_Chi_Minh"));
    @Autowired
    private PersonRepository personRepository;

    private final PersonMapper personMapper;

    public PersonServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Transactional
    @Override
    public void createPerson(PersonDTO dto) {
        Person person;
        person = personMapper.toEntity(dto);

        LocalDateTime localDateTime = LocalDateTime.now();
        person.setTimeUpdate(localDateTime);
        personRepository.save(person);
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> getPersonsByDate(PersonDTO dto) {
        LocalDateTime fromDate = Utils.stringToInstant(dto.getFromDate());
        LocalDateTime toDate = Utils.stringToInstant(dto.getToDate());
        return personRepository.getListByTimeUpdate(fromDate, toDate);
    }
}
