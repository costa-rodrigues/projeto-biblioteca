package com.mycompany.app.Model;

import com.mycompany.app.Interface.Pessoavel;

public class Pessoa implements Pessoavel {
    private String nome;
        
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    @Override
    public String getNome() {
        return nome;
    }        

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    private Livro[] listaLivros;

    public Livro[] getLivros() {
        return listaLivros;
    }

    public void setLivros(Livro[] listaLivros) {
        this.listaLivros = listaLivros;
    }
}
