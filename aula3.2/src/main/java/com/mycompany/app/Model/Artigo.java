package com.mycompany.app.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Artigo extends Publicação {
    private String genero;
    private boolean publicado;
    
    public Artigo(String título, Autor autor, String genero, boolean publicado) {
        super(título, autor);
        this.genero = genero;
        this.publicado = publicado;
        }

        public String getGenero() {
            return genero;
        }

        public boolean isPublicado() {
            return publicado;
        }

        @Override
        public void validarPublicação() {
            // Lógica específica de validação para Artigo
            System.out.println("Validando publicação de Artigo...");
        }
}
