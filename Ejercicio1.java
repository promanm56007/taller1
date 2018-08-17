import java.util.Scanner;
import java.lang.Math;

public class Ejercicio1
{
    
    
    public static void main(String [] args)
    {
                
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        double area, volumen;
        double ladocuadrado_inferior,ladocuadrado_superior, altura, apotema ;
        // variables de salidas 
        double perimetro1,perimetro2,areacuadrado_inferior,areacuadrado_superior;
        
        // Solicitar datos de entrada
        
        System.out.println("ingrese datos del tronco de pirámide cuadrangular");
                      
        System.out.println("Entre el valor del lado del cuadrado Superior: ");
        ladocuadrado_superior = teclado.nextDouble();
        
        System.out.println("Entre el valor del lado del cuadrado Inferior: ");
        ladocuadrado_inferior = teclado.nextDouble();
        
        System.out.println("Entre Altura: ");
        altura = teclado.nextDouble();
        
        System.out.println("Entre Apotema: ");
        apotema = teclado.nextDouble();
        
        
        //operaciones 
        perimetro1= ladocuadrado_inferior *4 ;
        perimetro2= ladocuadrado_superior *4 ;
        areacuadrado_inferior  = Math.pow(ladocuadrado_inferior,2); 
        areacuadrado_superior = Math.pow(ladocuadrado_superior,2) ;
        // Hallar la Salida
        area = (((perimetro1 + perimetro2)/2)* apotema)+ perimetro1 + perimetro2; 
        volumen = (altura / 3)* (areacuadrado_inferior +areacuadrado_superior  + Math.sqrt(areacuadrado_inferior *areacuadrado_superior  ));
          
        // Mostrar Los Datos de Salida En Pantalla
        System.out.println("El Volumen del Tronco Es: " + volumen); 
        System.out.println("El Area del Tronco Es: " + area);    
    }
}   
 