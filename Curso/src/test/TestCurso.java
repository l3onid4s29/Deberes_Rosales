

package test;

import dominio.Curso;

/**
 *
 * Leonidas Rosales
 */
public class TestCurso {
    public static void main(String[] args) {
        Curso cursoA = new Curso();
        double[] notas = new double[12];
            cursoA.setNotas(notas);
       
        for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;      
    } 
       
        cursoA.setNotas(notas);
         double suma=0;
        for(int i=0;i<12;i++){
           suma += notas[i];         
    } 
        double prom = 0;
        prom = (suma)/10; 
        cursoA.setPromedio(prom);
        System.out.println("El promedio del curso es:"+cursoA.getPromedio(prom));
        
        int EncimaProm=0;
        
          for(int i=0;i<12;i++){
           if((prom)<notas[i]){
           EncimaProm = i++;
           }
    }
        cursoA.setEstudiantesEncimaPromedio(EncimaProm);
        System.out.println("El numero de estudiantes por encima del primedio es: "+cursoA.getNumerosEstudiantesEncimaPromedio());
}       
 }
