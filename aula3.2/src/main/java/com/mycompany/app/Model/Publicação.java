package com.mycompany.app.Model;

public abstract class Publicação {
    private String titulo;
    private Autor autor;

    public Publicação(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    } 
    
    public void validarPublicação(){
        
    }           
}
