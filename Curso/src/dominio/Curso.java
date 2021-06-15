

package dominio;

/**
 *
 * Leonidas Rosales
 */
public class Curso {
  private double [] notas;
  private double promedio;
  private int estudiantesEncimaPromedio;
    
 public Curso(){
     notas = new double[12];
    }
 public void setNotas(double notas[]){
 this.notas = notas;
 }

 public void mostrarNotas(){
 for(int i = 0;i<12;i++){
    System.out.println(this.notas[i]);
 }    
 }
 
 public void setPromedio(double promedio){ 
   
   this.promedio = promedio;
   
 }
 
 public double getPromedio(double promedio){    
 return this.promedio = promedio;
 }
 
 public void setEstudiantesEncimaPromedio(int EstudiantesEncima){
 this.estudiantesEncimaPromedio = EstudiantesEncima;
 }
         
 public int getNumerosEstudiantesEncimaPromedio(){
 return this.estudiantesEncimaPromedio;
 }
    
}
