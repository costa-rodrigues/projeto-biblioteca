package com.mycompany.app;

import java.util.Date;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criando um autor
        Autor autor = new Autor("Jess","Inglesa");
        String nome = autor.getNome();

        // Criando um autor que é um usuário
        Autor autorUsuario = new Autor("João", "Brasileiro", true);

        // Criando um artigo com o autor que é um usuário
        Artigo artigo = new Artigo("Entendendo Compiladores", autorUsuario, "tecnologia", true);

        
        // Criando um livro
        Livro livro = new Livro("Java For Begginers", autor, "tecnologia", true);
        livro.validarDisponibilidade();

        // Criando um usuário
        Usuario usuario = new Usuario(nome:"Jess", idade:21);

        // Criando um empréstimo
        Emprestimo emprestimo = new Emprestimo((new Date()), (new Date()), livro, usuario); 

        // Exibindo as informações do empréstimo
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + autor.getNome();
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}

