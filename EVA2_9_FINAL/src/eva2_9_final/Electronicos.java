package eva2_9_final;

/**
 *
 * @author DELL
 */
public abstract class Electronicos extends Productos {
    private String marca;
    private boolean garantia;

    public Electronicos() {
        setNombre("Raton");
        setPrice(129.99);
        marca = "Levono";
        garantia = false;
    }

    public Electronicos(String marca, boolean garantia, String nombre, double price) {
        super(nombre, price);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isGarantia() {
        return garantia;
    }
    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        String string;
        string = super.toString()+"\n"+
                "Marca #"+marca+"\n"+
                "Garantia #"+garantia;
        return string;
    }
}
