package com.formulario.formulariocadastro.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "formulariocadastro")
public class FormularioCadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    @Column(length = 20 ,nullable = false)
    private String nome;

    @NotBlank
    @Column(length = 20 ,nullable = false)
    private String sobrenome;

    @NotBlank
    @Email
    @Column(length = 40 ,nullable = false)
    private String email;

    @NotBlank
    @Size(min=8, max=30)
    @Column(length = 30 ,nullable = false)
    private String senha;

    @NotBlank
    @Size(min = 8, max = 8)
    @Column(length = 8, nullable = false)
    private String cep;

    @NotBlank
    @Column(length = 50 ,nullable = false)
    private String rua;

    @NotBlank
    @Column(length = 50, nullable = false)
    private String bairro;

    @NotBlank
    @Column(length = 30, nullable = false)
    private String cidade;

    @NotBlank
    @Column(length = 30, nullable = false)
    private String estado;

    @NotNull
    @Column(nullable = false)
    private  String numero;

    @Column(nullable = true)
    private String complemento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "formulariocadastro [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }
    
}
