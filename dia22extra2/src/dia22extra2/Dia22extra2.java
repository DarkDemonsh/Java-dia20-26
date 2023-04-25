package dia22extra2;

import dia22extra2.Entidad.NIF;
import dia22extra2.Servicio.ServicioNIF;

public class Dia22extra2 {

    public static void main(String[] args) {
        ServicioNIF sn = new ServicioNIF();
        NIF n = sn.init();
        
        sn.crear_NIF();
        sn.Mostrar(n);
        
    }
    
}
