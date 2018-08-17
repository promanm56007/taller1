import java.util.Scanner;

public class ejercicio4 extends Ejercicio1
{
    public static void main (String [] args)
    {
         
         // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        
        // declarar variables
        int estudiantes_gordos, estudiantes_flacos;
        int n_sillas_bus = 0, valor_plato_comida, n_persona_habitacion, precio_alquiler_bus, n_dias_paseo, valor_habitacion ; 
        double bus;
        double valor_comida , habitaciones, valor_diario,valor_total;
        double alquiler_total;
        
                      
        // Solicitar datos de entrada
                
        System.out.println("Ingrese Número de Estudiantes FLACOS: ");
         estudiantes_flacos = teclado.nextInt();
        
        System.out.println("Ingrese Número de Estudiantes GORDOS: ");
         estudiantes_gordos = teclado.nextInt();
        
        System.out.println("Ingrese Número de SILLAS DEL BUS: ");
         n_sillas_bus = teclado.nextInt();
         
        System.out.println("Ingrese Valor Plato de Comida: ");
         valor_plato_comida = teclado.nextInt();
         
        System.out.println("Ingrese Valor Habitación: ");
         valor_habitacion = teclado.nextInt();
         
        System.out.println("Ingrese Número de Persona por Habitacion: ");
         n_persona_habitacion = teclado.nextInt();
         
        System.out.println("Ingrese Precio Alquiler por Bus: ");
         precio_alquiler_bus = teclado.nextInt();
         
        System.out.println("Ingrese Número de Días de Paseo: ");
         n_dias_paseo = teclado.nextInt();
         
        //punto a
        int total_sillas_gordos = (estudiantes_gordos * 2 );
        int total_estudiantes = total_sillas_gordos + estudiantes_flacos;
        if(total_estudiantes > n_sillas_bus){
            bus = total_estudiantes / n_sillas_bus ;
        }else{
            bus = 1 ;
        }
        //punto b    
            alquiler_total = bus * precio_alquiler_bus * 2 ;
        //punto c    
            valor_comida = (valor_plato_comida* 5 * estudiantes_gordos )+( valor_plato_comida * 3 * estudiantes_flacos) ;
        //punto d
             if( (estudiantes_gordos + estudiantes_flacos ) >  n_persona_habitacion){
            habitaciones = (estudiantes_gordos + estudiantes_flacos )/ n_persona_habitacion;
           
        }else{
            habitaciones = 1 ;
        }
        //punto e
            valor_diario = valor_habitacion * habitaciones;
            valor_total = n_dias_paseo * valor_diario;
            
            System.out.println("numero de buses para el viaje:" + bus);
            System.out.println("el alquiler de buses costará:" + alquiler_total);
            System.out.println("el valor total de la comida será:" + valor_comida);
            System.out.println("el número de habitaciones es:" + habitaciones);
            System.out.println("el valor diario por las habitaciones es:" + valor_diario);
            System.out.println("el valor total por las habitaciones es:" + valor_total);
            
        
        }
    }    