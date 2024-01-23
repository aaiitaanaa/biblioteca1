public class BibliotecaRefac {
    private Libro[] listaLibro;

    public BibliotecaRefac(){
        this.listaLibro =  new Libro[100];
    }

    public Libro[] getLibros(){
        return listaLibro;
    }
    
    public boolean añadirLibro(Libro libro){
        for (int i = 0; i<listaLibro.length;i++){
            if(listaLibro[i] == null){
                listaLibro[i] = libro;
                return true;
            }
        }
        return false;
    }

    public void eliminarLibro(String isbn){
        for(int i = 0; i<listaLibro.length;i++){
            if(listaLibro[i] != null && listaLibro[i].getIsbn().equals(isbn)){
                listaLibro[i] = null;
            }
        }
    }

    public void mostrarLibros(){
        for(int i = 0; i<listaLibro.length;i++){
            if(listaLibro[i] !=null){
                System.out.println(listaLibro[i]);
            }
        }
    }

    public void mostrarGeneroLiterario(String generoLiterario){
        int contador=0;
        Libro [] lib = new Libro[100];
        for(int i = 0; i<listaLibro.length;i++){
            if(listaLibro[i] != null && listaLibro[i].getGeneroLiterario().equals(generoLiterario)){
                lib[contador] = listaLibro[i];
                contador ++;
            }
        }
    }

    public Libro[] librosDeAutor(String autor){
        Libro[] libros = new Libro[100];
        int contador = 0;
        for(int i = 0; i<listaLibro.length;i++){
            if(listaLibro[i] != null && listaLibro[i].getAutor().equals(autor)){
                libros[contador] = listaLibro[i];
                contador ++;
            }
        }
        return libros;
    }

    public void mostrarLibroMasLasgo(){
        int max = 0;
        for(int i = 0; i<listaLibro.length;i++){
            if (listaLibro[i] != null && listaLibro[i].getNumpagina()>max){
                max = listaLibro[i].getNumpagina();
            }
        }

    }





}
