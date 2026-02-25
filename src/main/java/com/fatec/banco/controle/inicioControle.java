package com.fatec.banco.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class inicioControle {

    @GetMapping("/")
    public String boasVindas(){
        return "Bem-vindo(a)";
    }
}
