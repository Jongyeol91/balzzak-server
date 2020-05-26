package com.balzzak.goodservice.common.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseException {
    private Date timestamp;
    private String message;
    private String details;
}
