package dia22extra1;

import dia22extra1.Entidad.Raices;
import dia22extra1.Servicio.ServicioRaices;
import java.util.Scanner;

public class Dia22extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioRaices sr = new ServicioRaices();
        Raices r = sr.init();
        
        System.out.println("Ingrese el primer numero");
        r.setA(leer.nextDouble());
        System.out.println("Ingrese el segundo numero");
        r.setB(leer.nextDouble());
        System.out.println("Ingrese el tercer numero");
        r.setC(leer.nextDouble());
        
        System.out.println("");
        
        sr.calcular(r);
        
        System.out.println("");
    }
    
}
