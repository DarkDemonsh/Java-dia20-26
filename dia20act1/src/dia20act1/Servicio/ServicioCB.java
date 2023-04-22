package dia20act1.Servicio;

import dia20act1.Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServicioCB {
    Scanner leer = new Scanner(System.in);
    CuentaBancaria c1 = new CuentaBancaria();
    
    public CuentaBancaria crear_cuenta(){
        
        System.out.println("Ingrese el DNI");
        c1.setDnic(leer.nextLong());
        
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumcuenta(leer.nextInt());
        
        System.out.println("Ingrese el saldo actual");
        c1.setSalact(leer.nextDouble());
        
        return c1;
           
    }
    
    public void ingresar(CuentaBancaria c1){
        
        System.out.println("Ingrese la cantidad que quiera sumar");
        double ing = leer.nextDouble();
        c1.setSalact(c1.getSalact() + ing);
        
    }
    
    public void retirar(CuentaBancaria c1){
        
        System.out.println("Ingrese la cantidad de dinero que quiera retirar");
        double ret = leer.nextDouble();
        
        c1.setSalact(c1.getSalact() - ret);
        
    }
    
    public void extrac_rapida(CuentaBancaria c1){
        double i = 0;
        
        System.out.println("ingrese el saldo que quiera retirar menor al 20%"); 
        double er = leer.nextDouble();
        
        i = 20*c1.getSalact()/100;
        
        if(er < i){
            c1.setSalact(c1.getSalact() - er);
        }else{
            System.out.println("debe ser menor al 20% de su saldo");
        }

    }
    
    public void con_sal(CuentaBancaria c1){
        
        System.out.println("Su saldo actual es: "+c1.getSalact());
        
    }
    
    public CuentaBancaria cons_dat(CuentaBancaria c1){
        
        System.out.println("su DNI: "+c1.getDnic());
        System.out.println("su numero de cuenta: "+c1.getNumcuenta());
        System.out.println("su saldo actual es: "+c1.getSalact());
        
        return null;  
    }

    }
