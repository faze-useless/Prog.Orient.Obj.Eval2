package eva2_14_vehiculos;

/**
 *
 * @author DELL
 */
public class Moto extends Vehiculo {
    private int capacidad;

    public Moto(int capacidad) {
        super();
        this.capacidad = capacidad;
    }

    public Moto(int capacidad, double velocidad) {
        super(velocidad);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
