package com.example.domain.Base;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data                   // Genera getters, setters, toString, equals, hashCode
@NoArgsConstructor      // Genera constructor vacío
@AllArgsConstructor     // Genera constructor con todos los campos
public class ListResponse {
    private int code;
    private String message;
    private List<Object> items;
}