package dia22extra2.Servicio;

import dia22extra2.Entidad.NIF;
import java.util.Scanner;

public class ServicioNIF {
    Scanner leer = new Scanner(System.in);
    NIF r = new NIF();
    
    public NIF init(){
        return r;    
    }
    
    public NIF crear_NIF(){
        System.out.println("Ingresar DNI");
        
        r.setDni(leer.nextLong());
        
        return r;
    }
    
    public void Mostrar(NIF r){
       long num;
       long num2;
        
        num = (r.getDni()%23);
        num2 = (r.getDni()/23);
        
        int i = (int) num;
        
        switch (i) {
            case 0:
                r.setL("T");
                break;
            case 1:
                r.setL("R");
                break;
            case 2:
                r.setL("W");
                break;
            case 3:
                r.setL("A");
                break;
            case 4:
                r.setL("G");
                break;
            case 5:
                r.setL("M");
                break;
            case 6:
                r.setL("Y");
                break;
            case 7:
                r.setL("F");
                break;
            case 8:
                r.setL("P");
                break;
            case 9:
                r.setL("D");
                break;
            case 10:
                r.setL("X");
                break;
            case 11:
                r.setL("B");
                break;
            case 12:
                r.setL("N");
                break;
            case 13:
                r.setL("J");
                break;
            case 14:
                r.setL("Z");
                break;
            case 15:
                r.setL("S");
                break;
            case 16:
                r.setL("Q");
                break;
            case 17:
                r.setL("V");
                break;
            case 18:
                r.setL("H");
                break;
            case 19:
                r.setL("L");
                break;
            case 20:
                r.setL("C");
                break;
            case 21:
                r.setL("K");
                break;
            case 22:
                r.setL("E");
                break;
            default:
                break;
        }
       System.out.println("");
       System.out.println("su NIF es: "+num2+"-"+r.getL());
       
    }
    
}
