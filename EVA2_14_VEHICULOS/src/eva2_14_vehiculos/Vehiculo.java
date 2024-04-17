package eva2_14_vehiculos;

/**
 *
 * @author DELL
 */
public abstract class Vehiculo {
    private double velocidad;

    public Vehiculo() {
        velocidad = 0.0;
    }
    
    public Vehiculo(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() { return velocidad; }
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }
    
    public void acelerar(double ajuste) {
        velocidad += ajuste;
    }
}
