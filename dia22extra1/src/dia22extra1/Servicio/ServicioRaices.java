package dia22extra1.Servicio;

import dia22extra1.Entidad.Raices;
import java.util.Scanner;

public class ServicioRaices {
    
    Raices r = new Raices();    
    Scanner leer = new Scanner(System.in);
    
    public Raices init(){
        return r;    
    }
    
    public double getDiscriminate(Raices r){
        
        r.setD(Math.pow(r.getB(),2)-4*r.getA()*r.getC());
        
        return r.getD();  
    }
    
    public boolean tieneRaices(Raices r){
        boolean t = false;
        
        if(r.getD() >= 0){
            t = true;
        }
        return t;
    }
    
    public boolean tieneRaiz(Raices r){
        boolean t = false;
        if(r.getD() == 0){
            t = true;
        }
        return t;
    }
    
    public void obtener_raices(Raices r){
        double a = (-r.getB()-r.getD());
        double b = (-r.getB()+r.getD());
        
        System.out.println(a);
        System.out.println(b);
        
    }
    
    public void obtener_Raiz(Raices r){
        
        System.out.println(r.getD());
        
    }
    
    public void calcular(Raices r){
        if(tieneRaiz(r)==true){
        obtener_raices(r);
        }else if(tieneRaices(r) == true){
        obtener_Raiz(r);
        }else{
        System.out.println("NO EXISTE SOLUCION");
        }
    }
}
