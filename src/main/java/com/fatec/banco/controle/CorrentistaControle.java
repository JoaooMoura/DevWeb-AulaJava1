package com.fatec.banco.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.banco.modelo.CorrentistaModelo;
import com.fatec.banco.repositorio.CorrentistaRepo;

@RestController
public class CorrentistaControle {
    
    @Autowired
    private CorrentistaRepo repositorio;

    @PostMapping("/criar")
    public void criar(@RequestBody CorrentistaModelo correntistaModelo){
        repositorio.save(correntistaModelo);
    }

    @DeleteMapping("/apagar")
    public void apagar(@RequestBody CorrentistaModelo correntistaModelo){
        repositorio.deleteById(correntistaModelo.getId());
    }
}
