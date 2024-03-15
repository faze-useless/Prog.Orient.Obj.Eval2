package eva2_9_final;

/**
 *
 * @author DELL
 */
public abstract class Productos {
    private String nombre;
    private double price;

    public Productos() {
        this.nombre = "Coca cola lata 355ml";
        this.price = 19.99;
    }
    
    public Productos(String nombre, double price) {
        this.nombre = nombre;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        String string;
        string = "Nombre #"+nombre+"\n" +
                "Precio #$"+price;
        return string;
    }
}
