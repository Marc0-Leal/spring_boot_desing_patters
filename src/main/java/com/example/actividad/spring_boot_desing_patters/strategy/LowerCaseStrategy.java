package com.example.actividad.spring_boot_desing_patters.strategy;

import org.springframework.stereotype.Component;

@Component
public class LowerCaseStrategy implements TextStrategy{

    @Override
    public String apply(String text) {
        return text.toLowerCase();
    }
    
}