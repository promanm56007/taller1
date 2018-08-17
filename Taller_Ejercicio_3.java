import java.util.Scanner;
import java.lang.Math;

public class Taller_Ejercicio_3
{
    public static void main (String [] args)
    {
         
         // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        double radio, altura, volumen;
        
                      
        // Solicitar datos de entrada
                
        System.out.println("Ingrese mediante Teclado el Radio: ");
         radio= teclado.nextDouble();
                  
        
        System.out.println("Ingrese mediante Teclado Altura: ");
        altura = teclado.nextDouble();
        
        volumen = Math.PI * Math.pow(radio,2) * altura;
        
                // Mostrar Los Datos de Salida En Pantalla
        System.out.println("El Volumen del Tronco Es: " + volumen); 
        
    }
    
}   
     