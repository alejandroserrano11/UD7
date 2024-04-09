package teoriaUnidad;

public class Abstraccion {
    
}

// creamos una clase abstracta llamada primera
// atributos dos: String nombre, int numero
// constructor sin atributos
// getter y setter
// un metodo abstracto: incrementaUno q no devolvera nada (incrementa numero en 1)
// un metodo normal: incrementa, q toma como parametro un int e incrementa numero con el parametro

// una clase normal llamada segunda que hereda de primera


abstract class Primera {

    String nombre = null;
    int  numero = 0;

    // constructor sin atributos

    public Primera(){

    }
    

    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract void incrementaUno();

    public void incrementa(int numero) {
        numero++;
    }

    abstract class Segunda extends Primera {

    }

    class Tercera extends Segunda{

        public void incrementaUno(){
            numero++;
        }

    }

    
}