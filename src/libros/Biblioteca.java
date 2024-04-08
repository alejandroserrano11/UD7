package libros;

public class Biblioteca {
   public static void main(String[] args) {


      Libro libro1 = new Libro("El Quijote");
      Libro libro2 = new Libro("El árbol de la ciencia");
      Libro libro3 = new Libro("El cuarto de Atrás");

      Usuario usuario1 = new Usuario("Fran");
      Usuario usuario2 = new Usuario("Darío");
      Usuario usuario3 = new Usuario("Adrián");
      Usuario usuario4 = new Usuario("Janhin");

      // prestar el Quijote a Fran.
      usuario1.asignarLibro(libro1);
      // intentar asignar el Quijote a Darío
      usuario2.asignarLibro(libro1);
      // intentar devolver un libro q no tengo.
      usuario1.devolverLibro(libro3);
      // intentar devolver un libro q tengo.
      usuario1.devolverLibro(libro1);

      

   }
}
