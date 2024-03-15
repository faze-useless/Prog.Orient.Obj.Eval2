package eva2_9_final;

/**
 *
 * @author DELL
 */
// Ahora ninguna clase puede heredar de esta por el tag final
public final class Compus extends Electronicos {
    private int ram;
    private String hd;
    private String procesador;

    public Compus() {
        setNombre("equipo de computo 1");
        setPrice(12099.99);
        setMarca("DELL");
        setGarantia(true);
        this.ram = 12;
        this.hd = "512gb ssd";
        this.procesador = "Intel core i5";
    }

    public Compus(int ram, String hd, String procesador, String marca, boolean garantia, String nombre, double price) {
        super(marca, garantia, nombre, price);
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public String getHd() {
        return hd;
    }
    public void setHd(String hd) {
        this.hd = hd;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
    @Override
    public String toString() {
        String string;
        string = super.toString()+"\n"+
                "RAM #"+ram+"\n"+
                "Hard Disc #"+hd+"\n"+
                "Procesador #"+procesador;
        return string;
    }
}
