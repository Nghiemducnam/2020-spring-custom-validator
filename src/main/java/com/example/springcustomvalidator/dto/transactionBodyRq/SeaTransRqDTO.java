package com.example.springcustomvalidator.dto.transactionBodyRq;

import com.example.springcustomvalidator.dto.HeaderRequest;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class SeaTransRqDTO<T> {
    @Valid
    private HeaderRequest header;

    @Valid
    private RequestBody<T> body;


}
