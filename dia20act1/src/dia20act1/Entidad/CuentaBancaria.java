package dia20act1.Entidad;

public class CuentaBancaria {
    
    public int numcuenta;
    public long dnic;
    public double salact;
    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numcuenta, long dnic, double salact) {
        this.numcuenta = numcuenta;
        this.dnic = dnic;
        this.salact = salact;
    }

    public double getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public long getDnic() {
        return dnic;
    }

    public void setDnic(long dnic) {
        this.dnic = dnic;
    }

    public double getSalact() {
        return salact;
    }

    public void setSalact(double salact) {
        this.salact = salact;
    }
    
    
}
