package dia21act2.Servicio;

import dia21act2.Entidad.Cafeteria;
import java.util.Scanner;

public class ServicioCafeteria {
    Cafeteria c1 = new Cafeteria();
    Scanner leer = new Scanner(System.in);
    
    
    public Cafeteria llenarCafetera(){
        
        if(c1.getCantact() < c1.getCapmax()){
            System.out.println("Cafetera rellenada");
            c1.setCantact(c1.getCapmax());
        }else{
            System.out.println("La cafetera ya esta llena");
        }   
        return c1;
    }
    
    public void servirTaza(Cafeteria c1){
        
        System.out.println("ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        if(taza > c1.getCantact()){
            System.out.println("Cantidad de cafe insuficiente");
        }else{
            System.out.println("Sirviendo taza");
            c1.setCantact(c1.getCantact() - taza);
        }
        
    }
    
    public void vaciarCafetera(Cafeteria c1){
        System.out.println("limpiando cafetera");
        c1.setCantact(0);
    }
    
    public void agregarCafe(Cafeteria c1){
        System.out.println("Ingrese la cantidad de cafe que quiere añadir");
        int more = leer.nextInt();
        if(c1.getCapmax() >= 501){
            System.out.println("La cantidad que desea añadir excede a la capacidad maxima");
        }else{
            System.out.println("Añadiendo cafe");
            c1.setCantact(c1.getCantact() + more);
        }
        
    }
    
}
