package com.example.springcustomvalidator.dto.transactionBodyRq;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class TransSubBody<T> extends BaseBody{
    @Valid
    private T data;
}
