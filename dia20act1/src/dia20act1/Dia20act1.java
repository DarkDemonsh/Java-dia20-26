package dia20act1;

import dia20act1.Servicio.ServicioCB;
import dia20act1.Entidad.CuentaBancaria;
import java.util.Scanner;

public class Dia20act1 {

    public static void main(String[] args) {
        ServicioCB scb1 = new ServicioCB();
        Scanner Leer = new Scanner(System.in);
        CuentaBancaria cb1 = scb1.crear_cuenta();
        
        do{               
        System.out.println("que desea hacer");
        System.out.println("");
        System.out.println("1-ingresar dinero");
        System.out.println("2-retirar dinero");
        System.out.println("3-extraccion rapida");
        System.out.println("4-Consultar saldo");
        System.out.println("5-Consultar Datos");
        System.out.println("6-Salir");
        System.out.println("");
        
        cb1.setNum(Leer.nextInt()); 
        
        switch(cb1.getNum()){
            case 1:
                scb1.ingresar(cb1);
                System.out.println("");
                break;
            case 2:
                scb1.retirar(cb1);
                System.out.println("");
                break;
            case 3:
                scb1.extrac_rapida(cb1);
                System.out.println("");
                break;
            case 4:
                scb1.con_sal(cb1);
                System.out.println("");
                break;
            case 5:
                scb1.cons_dat(cb1);
                System.out.println("");
                break;
            case 6:
                break;
        }
        }while(cb1.num != 6);
    }
    
}
