package com.consume.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Output {
    private String status;
    private Employee data;
    private String message;


    @Override
    public String toString() {
        return "OuterStatus {status=" + status + ", data=" + data + ", message=" + message + "}";
    }
}
