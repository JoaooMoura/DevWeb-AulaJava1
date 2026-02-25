package com.fatec.banco.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.banco.modelo.CorrentistaModelo;

public interface  CorrentistaRepo extends JpaRepository<CorrentistaModelo, Long> {
    
}
