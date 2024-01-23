public class MainBiblioteca {
    public static void main(String[] args) {
        BibliotecaRefac biblioteca = new BibliotecaRefac();
        biblioteca.añadirLibro(new Libro("El Quijote", "Cervantes", "97-8840806-1052",1560 , "Novela"));
        biblioteca.añadirLibro(new Libro("Los pilares de la Tierra", "Ken Follett", "97-5440806-1055", 1068, "Novela"));
        biblioteca.añadirLibro(new Libro("Libro de Poemas", "Federico Garcia Lorca", "97-5440806-1050", 164, "Poesia"));
        biblioteca.mostrarLibros();
        biblioteca.mostrarGeneroLiterario("Novela");
        biblioteca.mostrarLibroMasLargo();
        biblioteca.eliminarLibro("97-8840806-1052");
        biblioteca.mostrarLibros();
    }
}
