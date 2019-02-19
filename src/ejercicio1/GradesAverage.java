
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alexa rodriguez y Laura roldan 
 * 
 */

public class GradesAverage {


    public static void main(String[] args) {

        int  numStudents;
        int calificaciones[][] = new int [10][10];
        int grado;
        int acum = 0;
        float prom;
        
        Scanner entrada;
                       
                entrada = new Scanner (System.in); //Creación de un objeto Scanner

                    System.out.println ("ingrese el numero de estudiantes:");
                    numStudents = entrada.nextInt(); 
   
                    
                     
                    
                     for (int i=1; i<=numStudents; i++){
                         
                            System.out.println("Introduzca la calificacion del estudiante "+i );
                           grado = entrada.nextInt();
                           
                            
                           
                           if(grado<=100){
                            for (int x=0; x < calificaciones.length ; x++) {
                                 for (int y=0; y < calificaciones[x].length; y++){
                                     calificaciones[x][y] = grado;
                                 }
                            }
                                              
                           acum=acum+grado;
                                   }
                           
                           else{
                                 System.out.println("grado invalido,intentelo de nuevo");
                                 i--;
                            }                  

                    }
                     prom = acum/numStudents;
                     System.out.printf("promedio es %.2f ",prom);
                     
                         
                    
                       
                         
}
                    
                    
                    

    
    }                    

