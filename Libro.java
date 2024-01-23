public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numpagina;
    private String generoLiterario;

    public Libro(String titulo, String autor, String isbn, int numpagina, String generoLiterario){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numpagina = numpagina;
        this.generoLiterario = generoLiterario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumpagina() {
        return numpagina;
    }

    public void setNumpagina(int numpagina) {
        this.numpagina = numpagina;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", numpagina=" + numpagina
                + ", generoLiterario=" + generoLiterario + "]";
    }

    


    
}
