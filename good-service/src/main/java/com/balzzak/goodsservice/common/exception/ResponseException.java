package com.balzzak.goodsservice.common.exception;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseException {
    private Date timestamp;
    private String message;
    private String details;
}
