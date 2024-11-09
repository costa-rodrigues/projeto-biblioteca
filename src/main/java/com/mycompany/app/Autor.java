public class Autor extends Pessoa {
    private String nacionalidade;

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obrasPublicadas;

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }
    
    public void setObrasPublicadas (Livro[] obrasPublicadas) {
        obrasPublicadas.add(livro);
    }

    public List<Livro> getObrasPublicadasPorGenero(String genero) {
        List<Livro> livrosPorGenero = new ArrayList<>();
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equals(genero)) {
                livrosPorGenero.add(livro);
            }
        }
        return livrosPorGenero;
    }
}
