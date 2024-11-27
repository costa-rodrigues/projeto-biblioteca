package com.mycompany.app;

import org.junit.jupiter.api.Test;

import com.mycompany.app.Model.Autor;

import static org.junit.jupiter.api.Assertions.*;
public class AutorTest {
    @Test
    public void testConstrutorAutorTradicional() {
        Autor autor = new Autor("Maria", "Portuguesa");
        assertEquals("Maria", autor.getNome());
        assertEquals("Portuguesa", autor.getNacionalidade());
        assertFalse(autor.isUsuari@Test
    }
    
    @Test
    public void testConstrutorAutorUsuario() {
        Autor autor = new Autor("Pedro", "Espanhol", true);
        assertEquals("Pedro", autor.getNome());
        assertEquals("Espanhol", autor.getNacionalidade());
        assertTrue(autor.isUsuario());
    }
}
