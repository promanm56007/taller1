import java.util.Scanner;
import java.lang.Math;

public class Taller_Ejercicio_7
{
    public static void main (String [] args)
    {
         
         // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        double semiperimetro, area, circumradius; 
        double lado_a, lado_b, lado_c;
                      
        // Solicitar datos de entrada
                
        System.out.println("Ingrese mediante Teclado el Lado A: ");
         lado_a= teclado.nextDouble();
         
         System.out.println("Ingrese mediante Teclado el Lado B: ");
         lado_b= teclado.nextDouble();
          
         System.out.println("Ingrese mediante Teclado el Lado C: ");
         lado_c= teclado.nextDouble();
        
        
        
        semiperimetro = (lado_a + lado_b + lado_c) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado_a) * (semiperimetro - lado_b) * (semiperimetro - lado_c));
        circumradius = (lado_a * lado_b * lado_c) / (4 * Math.PI * area);
        
        
                // Mostrar Los Datos de Salida En Pantalla
        System.out.println("El Semiperimetro del Triangulo Es: " + semiperimetro); 
        System.out.println("El Área del Triangulo Es: " + area); 
        System.out.println("El Circumradius del Triangulo Es: " + circumradius); 
        
    }
    
}   
     