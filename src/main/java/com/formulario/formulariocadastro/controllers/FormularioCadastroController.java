package com.formulario.formulariocadastro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.formulario.formulariocadastro.models.FormularioCadastro;
import com.formulario.formulariocadastro.repositories.FormularioCadastroRepository;

@Controller
public class FormularioCadastroController{

    private final FormularioCadastroRepository formularioCadastroRepository;
    public FormularioCadastroController(FormularioCadastroRepository formularioCadastroRepository){
        this.formularioCadastroRepository = formularioCadastroRepository;
    }

    @GetMapping("/")
    public String formulario(Model model){
        model.addAttribute("formulariocadastro", new FormularioCadastro());

        return "form";
     }

    @PostMapping("/")
    public String salvarformulario(FormularioCadastro formularioCadastro){

        formularioCadastroRepository.save(formularioCadastro);

        return "redirect:/";
    }
    

}