


//JORGE DANIEL DEL ANGEL BOMBARDIER
//A01410409
//IMT


package spp.jdelangel.t01.p3;
import java.util.Scanner;

public class SPPJDELANGELT01P3 {

    
    public static void main(String[] args) {
        
        System.out.println("Programa para calcular distancia entre dos puntos");
        
    //Variables
        double x1, x2, y1, y2, rx, ry, dist;
        
    //Llamamos al scanner
         Scanner kb = new Scanner (System.in);
    
    //PREGUNTADERA
        System.out.println("Ingresa el valor de x1");
        x1= kb.nextDouble();
        
        System.out.println("Ingresa el valor de x2");
        x2= kb.nextDouble();
        
        System.out.println("Ingresa el valor de y1");
        y1= kb.nextDouble();
        
        System.out.println("Ingresa el valor de y2");
        y2= kb.nextDouble();
    
    //OPERACIONES
        rx=(x1-x2);
        ry=(y1-y2);
        
        dist=Math.sqrt(Math.pow(rx,2)+ Math.pow(ry,2));
        
        System.out.println("LA DISTANCIA ENTRE LOS 2 PUNTOS ES" +            dist);
        
         
        
    }
    
}
