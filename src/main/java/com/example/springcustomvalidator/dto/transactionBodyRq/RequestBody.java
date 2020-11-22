package com.example.springcustomvalidator.dto.transactionBodyRq;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestBody<T> {
    @NotEmpty
    private String command;

    @Valid
    private TransSubBody<T> transaction;

    @Valid
    private EnquirySubBody<T> enquiry;

}
