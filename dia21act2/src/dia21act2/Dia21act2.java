package dia21act2;

import dia21act2.Entidad.Cafeteria;
import dia21act2.Servicio.ServicioCafeteria;
import java.util.Scanner;

public class Dia21act2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCafeteria sc1 = new ServicioCafeteria();
        Cafeteria c1 = sc1.llenarCafetera();
        
        int op;
        
        do{
            System.out.println("BIENVENIDO A LA CAFETERA VIRTUUAL");
            System.out.println("");
            System.out.println("¿Que desea hacer?");
            System.out.println("");
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir Taza");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar Cafe");
            System.out.println("5-Salir");
            System.out.println("");
            
            op=leer.nextInt();
            System.out.println("");
            
            switch(op){
                case 1:
                    sc1.llenarCafetera();
                    System.out.println("");
                    break;
                case 2:
                    sc1.servirTaza(c1);
                    System.out.println("");
                    break;
                case 3:
                    sc1.vaciarCafetera(c1);
                    System.out.println("");
                    break;
                case 4:
                    sc1.agregarCafe(c1);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Adios y buen dia");
                    op = 0;
                    System.out.println("");
                    break;
                    
            }
        }while(op != 0);
        
    }
    
}
