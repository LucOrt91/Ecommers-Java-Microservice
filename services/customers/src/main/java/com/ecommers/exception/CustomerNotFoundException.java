package com.ecommers.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class CustomerNotFoundException extends RuntimeException {

    private final String msg;
}