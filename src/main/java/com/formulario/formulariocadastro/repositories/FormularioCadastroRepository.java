package com.formulario.formulariocadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formulario.formulariocadastro.models.FormularioCadastro;

public interface FormularioCadastroRepository extends JpaRepository<FormularioCadastro, Long > {
    
}
