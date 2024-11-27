public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(Sting tiulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade() {
        if (!disponivel) {
            System.out.println("O livro não está disponível");
        }
    }

    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
