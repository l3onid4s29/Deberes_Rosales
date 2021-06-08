
package clases;

/**
 *
 * @author leofl
 */
public class Cuadrilatero {
    int lado;
    
    public Cuadrilatero(int lado){
    this.lado = lado;
    }
    public void AreaPerimetro(){
        System.out.println("El area del cuadrilatero es: "+lado*lado);
        System.out.println("el perimetro del cuadrilatero es :"+lado*4);
    }
}
