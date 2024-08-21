package com.barbarapacheco.model;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Endereco {
  
   private String logradouro;
   private String complemento;
   private String bairro;
   private String localidade;
   private String uf;
   private String cep;

  public Endereco(){
      
  }
   
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.logradouro = Logradouro;
    }

    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String Compremento) {
        this.complemento = Compremento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String Bairro) {
        this.bairro = Bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String Localidade) {
        this.localidade = Localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String Uf) {
        this.uf = Uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String Cep) {
        this.cep = Cep;
    }
}
