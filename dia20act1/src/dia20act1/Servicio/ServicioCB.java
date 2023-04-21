package dia20act1.Servicio;

import dia20act1.Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServicioCB {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crear_cuenta(){
        
        System.out.println("Ingrese el DNI");
        long dnic = leer.nextLong();
        
        System.out.println("Ingrese el numero de cuenta");
        int numcuenta = leer.nextInt();
        
        System.out.println("Ingrese el saldo actual");
        double salact = leer.nextDouble();
        
        return new CuentaBancaria(numcuenta,dnic,salact);   
    }
    
    public double ingresar(double salact){
        
        System.out.println("Ingrese la cantidad que quiera sumar");
        double ing = leer.nextDouble();
        salact = salact + ing;
        
        return salact;
    }
    
    public double retirar(double salact){
        
        System.out.println("Ingrese la cantidad de dinero que quiera retirar");
        double ret = leer.nextDouble();
        
        salact = salact - ret;
        
        return salact;
    }
    
    public double extrac_rapida(double salact){
        double i = 0;
        
        System.out.println("ingrese el saldo que quiera retirar menor al 20%"); 
        double er = leer.nextDouble();
        
        i = 20*salact/100;
        
        if(er < i){
            salact = salact - er;
        }else{
            System.out.println("debe ser menor al 20% de su saldo");
        }

        
        return salact;
    }
    
    public double con_sal(double salact){
        
        System.out.println("Su saldo actual es: "+salact);
        
        return salact;
    }
    
    public CuentaBancaria cons_dat(long dnic, double salact, int numcuenta){
        
        System.out.println("su DNI: "+dnic);
        System.out.println("su numero de cuenta: "+numcuenta);
        System.out.println("su saldo actual es: "+salact);
        
        return null;  
    }

    }
