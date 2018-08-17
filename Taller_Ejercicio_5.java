import java.lang.Math; 
import java.util.Scanner;
public class Taller_Ejercicio_5 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int opcion = 0;
     int numero_pasajeros_clase1 = 0;
     int numero_pasajeros_clase2 = 0;
     int numero_pasajeros_clase3 = 0;
     int dinerorecogido;
     int clase;
         // asociar teclado al programa
        System.out.println("1.agregar pasajero");
        System.out.println("2.mostrar pasajeros del avión y el valor total recolectado por la empresa aérea");
        System.out.println("0.Salir");
        
        opcion = in.nextInt();
        if(opcion == 1){
                System.out.println("Ingrese la clase del pasajero(solo el numero 1 , 2 o 3)");
                clase = in.nextInt();
                if (clase == 1 ){
                    numero_pasajeros_clase1 = numero_pasajeros_clase1 +1;
                    
                }else if(clase==2){
                     numero_pasajeros_clase2 = numero_pasajeros_clase2 +1;
                } else if(clase==3){
                     numero_pasajeros_clase3 = numero_pasajeros_clase3 +1;
                }else{
                System.out.println("no ha ingresado un valor valido");
                } 
                
        }else if(opcion == 2){
        
                System.out.println("pasajeros de la clase 1 " +  numero_pasajeros_clase1 );
                
                System.out.println("pasajeros de la clase 2 " +  numero_pasajeros_clase2 );
                
                System.out.println("pasajeros de la clase 3 " +  numero_pasajeros_clase3 );
            
                dinerorecogido= (numero_pasajeros_clase1*500000)+(numero_pasajeros_clase2*200000)+(numero_pasajeros_clase3*125000);
                System.out.println("valor total recolectado por la empresa aérea "  +  dinerorecogido );
        
        }
            
            }
        }