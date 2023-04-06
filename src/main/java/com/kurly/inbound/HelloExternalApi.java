package com.kurly.inbound;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HelloExternalApi {

    private final String message ="HELLO IM";

    public String getMessage(String v ){
        return message + v;
    }

}
