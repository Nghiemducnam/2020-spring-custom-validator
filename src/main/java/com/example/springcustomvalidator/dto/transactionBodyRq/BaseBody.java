package com.example.springcustomvalidator.dto.transactionBodyRq;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class BaseBody implements Serializable {
    @NotEmpty(message = "authenType is not empty")
    private String authenType;

}
