import java.util.Scanner;
import java.lang.Math;

public class Taller_Ejercicio_6
{
    public static void main (String [] args)
    {
         
         // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        double area, lado, apotema;
        
                      
        // Solicitar datos de entrada
                
        System.out.println("Ingrese mediante Teclado el Lado Del Hexágono: ");
         lado= teclado.nextDouble();
                  
        
        System.out.println("Ingrese mediante Teclado Apotema: ");
        apotema = teclado.nextDouble();
        
        area = (6 * lado * apotema) / 2;
        
                // Mostrar Los Datos de Salida En Pantalla
        System.out.println("El Área del Hexágono Es: " + area); 
        
    }
    
}   
     