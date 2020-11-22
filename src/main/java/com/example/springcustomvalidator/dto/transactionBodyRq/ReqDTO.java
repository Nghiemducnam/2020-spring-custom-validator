package com.example.springcustomvalidator.dto.transactionBodyRq;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class ReqDTO<T> {
    @Valid
    private SeaTransRqDTO<T> seaReq;
}


