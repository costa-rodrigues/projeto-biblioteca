package com.mycompany.app.Model;

import com.mycompany.app.Interface.Autorinterface;

public class Usuario extends Pessoa implements Autorinterface {
    private int idade;
    private Emprestimo [] historicoEmprestimos;

    //Construtor co mome, idade e historico de emprestimos
    piblic Usuario(String nome, int idade) {
        super(nome); //chama o construtor da classe Pessoa para inicializar o nome
        this.idade = idade;
    }
    
    public int getIdade () {
        return idade;
    }

    public void setIdade ( int idade){
        this.idade = idade;
    }

    public Emprestimo [] getHistoricoEmprestimos () {
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos (Emprestimo [] historicoEmprestimos ) {
        this . historicoEmprestimos = historicoEmprestimos ;
    }
    @Override
    public void publicar() {
        System.out.println("Usuário publicando...");
    }
}

