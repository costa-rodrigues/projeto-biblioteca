package com.mycompany.app.Model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private boolean isUsuario; // Novo campo para diferenciar o tipo de autor

      // Construtor para autor tradicional
      public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.isUsuario = false;
    }
    
    // Construtor para autores que são usuários
    public Autor(string nome, String nacionalidade, boolean isUsuario) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }

    //Geters e Setters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obrasPublicadas;

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }
    
    public void setObrasPublicadas (Livro[] obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        // Lógica para retornar as obras piblicadas por g~enero
        return null;
    }
     @Override
     public String getNome() {
         return super.getNome();
    }
     @Override
     public void setNome(String nome) {
         super.setNome(nome);
    }

    
}

