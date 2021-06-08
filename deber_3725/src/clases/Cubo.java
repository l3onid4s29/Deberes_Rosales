
package clases;

/**
 *
 * @author Leonidas Rosales
 */
public class Cubo {
int ancho, alto, profundo;

//Constructor Vacío
public Cubo(){
    System.out.println("Invoca primero constructor");
    
}

public Cubo(int ancho,int alto, int profundo){
    this.ancho = ancho;
    this.alto = alto;
    this.profundo = profundo;
    
}
public void CalcularVolumen(int arg1){
    arg1 = (ancho*alto*profundo);
    System.out.println("El Volumen del cubo es: "+arg1);
}
}
