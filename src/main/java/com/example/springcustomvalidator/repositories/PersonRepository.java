package com.example.springcustomvalidator.repositories;

import com.example.springcustomvalidator.dto.PersonDTO;
import com.example.springcustomvalidator.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("select p from Person p where p.timeUpdate between :#{#fromDate} and :#{#toDate}")
    List<Person> getListByTimeUpdate(@Param("fromDate") LocalDateTime fromDate, @Param("toDate") LocalDateTime toDate);
}
