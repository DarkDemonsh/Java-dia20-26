package dia21act2.Entidad;

public class Cafeteria {
    
    private int capmax = 500;
    private int cantact;

    public Cafeteria() {
    }

    public Cafeteria(int capmax, int cantact) {
        this.capmax = capmax;
        this.cantact = cantact;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setCapmax(int capmax) {
        this.capmax = capmax;
    }

    public int getCantact() {
        return cantact;
    }

    public void setCantact(int cantact) {
        this.cantact = cantact;
    }

    
}
