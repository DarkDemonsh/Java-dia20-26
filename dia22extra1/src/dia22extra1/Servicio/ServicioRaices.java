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
        
        r.setD(Math.pow(r.getB(),2)-(4*r.getA()*r.getC()));
        
        return r.getD();  
    }
    
    public boolean tieneRaices(Raices r){
        return r.getD() > 0;
    }
    
    public boolean tieneRaiz(Raices r){
        return r.getD() == 0;
    }
    
    public void obtener_raices(Raices r){
      if(tieneRaices(r)){
        System.out.println((-r.getB()-Math.sqrt(r.getD()))/(2*r.getA()));
        System.out.println((-r.getB()+Math.sqrt(r.getD()))/(2*r.getA()));
      }
    }
    
    public void obtener_Raiz(Raices r){
        if(tieneRaiz(r)){
        System.out.println((-r.getB()+Math.sqrt(r.getD()))/(2*r.getA()));
        }
    }
    
    public void calcular(Raices r){
        
        if(tieneRaices(r)){
        obtener_raices(r);
        }else if(tieneRaiz(r)){
        obtener_Raiz(r);
        }else{
        System.out.println("NO EXISTE SOLUCION");
        }
    }
}
