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

   public void asignarLibro(Libro libroAprestar){
      
   }
   


} // end of Usuario
