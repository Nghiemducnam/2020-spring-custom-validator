package com.example.springcustomvalidator.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String identityCode;

//    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Ho_Chi_Minh")
    private LocalDateTime timeUpdate;

    public Person(Long id, String name, String address, String identityCode, LocalDateTime timeUpdate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.identityCode = identityCode;
        this.timeUpdate = timeUpdate;
    }

    public Person() {
    }
}
