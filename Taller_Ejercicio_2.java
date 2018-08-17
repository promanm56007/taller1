
import java.util.Scanner;

public class Taller_Ejercicio_2
{
    public static void main (String [] args)
    {
         
         // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        double galones_por_kilometros;
        double n_kilos;
        double n_viajes;
        int distancia_bogota_sasaima;
        double kilos_camion;
                
        // Solicitar datos de entrada
                
            System.out.println("N° de kilos que el Camión puede Cargas: ");
            kilos_camion= teclado.nextDouble();
            
             System.out.println("Cantidad de Kilos a Llevar: ");
             n_kilos= teclado.nextDouble();
         
               System.out.println("Ingrese Distancia Bogotá - Sasaima: ");
               distancia_bogota_sasaima = teclado.nextInt();
               
         //numero de viajes a realizar
           if (n_kilos >= kilos_camion)
           {
           n_viajes = n_kilos / kilos_camion;
           }
              else
              { 
                  n_viajes=1;
                }
                
         //numero de galones a usar
         galones_por_kilometros = n_viajes * distancia_bogota_sasaima * 2;
         
         System.out.println(" los galones ocupados en el trayecto son:" + galones_por_kilometros); 
         System.out.println(" El numero de Viajes son:" + n_viajes);
             

 
    }
    
}   
     