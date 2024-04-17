package eva2_14_vehiculos;

/**
 *
 * @author DELL
 */
public class Auto extends Vehiculo {
    private int noPuertas;

    public Auto() {
        super();
        this.noPuertas = 0;
    }

    public Auto(int noPuertas, double velocidad) {
        super(velocidad);
        this.noPuertas = noPuertas;
    }

    public int getNoPuertas() {
        return noPuertas;
    }
    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }
    
    
}
