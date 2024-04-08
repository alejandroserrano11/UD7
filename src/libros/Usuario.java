package libros;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
   // Atributtes
   private String nombre;
   private List<Libro> librosUsuario; // lista de libros prestados al usuario

   // Constructor
   public Usuario(String nombre) {
      this.nombre = nombre;
      this.librosUsuario = new ArrayList<Libro>();
   }
   // getters and setters

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public List<Libro> getLibrosPrestadosAUsuario() {
      return librosUsuario;
   }

   public void setLibrosPrestadosAUsuario(List<Libro> librosUsuario) {
      this.librosUsuario = librosUsuario;
   }

   public boolean asignarLibro(Libro libroAprestar) {
      if (libroAprestar.prestarLibro()) {
         this.librosUsuario.add(libroAprestar);
         System.out.println("El libro " + libroAprestar.getTitulo() + " se ha prestado a " + this.nombre);
         return true;
      } else {
         System.out.println("El libro " + libroAprestar.getTitulo() + " no está disponible");
         return false;
      }
   }

   public boolean devolverLibro(Libro libroAdevolver) {
      if (librosUsuario.contains(libroAdevolver)) {
         librosUsuario.remove(libroAdevolver);
         libroAdevolver.setPrestado(false);
         System.out.println("El libro " + libroAdevolver.getTitulo() + " ha sido devuelto por " + this.nombre);
         return true;
      } else {
         System.out
               .println("El usuario " + this.nombre + " no tiene el libro a devolver: " + libroAdevolver.getTitulo());
         return false;
      }
   }

   public void listarLibrosUsuario() {
      System.out.println("El usuario " + this.nombre + " tiene prestados los siguientes libros:");
      System.out.print("[ ");
      for (Libro libro : librosUsuario) {
         System.out.print(libro.getTitulo()+" ");
      }
      System.out.println("]");
   }

   @Override
   public boolean equals(Object obj) {
      return (
         this.nombre.equals(
            ((Usuario) obj).nombre
            )
         );
   }
} // end of Usuario
