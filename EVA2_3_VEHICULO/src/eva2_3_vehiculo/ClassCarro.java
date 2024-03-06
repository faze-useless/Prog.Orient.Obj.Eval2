package eva2_3_vehiculo;

public class ClassCarro {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private int annio;
    private String color;

    public ClassCarro() {
        this.marca = "Non";
        this.modelo = "Non";
        this.annio = 0;
        this.color = "Non";
    }

    public ClassCarro(String marca, String modelo, int annio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.annio = annio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnnio() {
        return annio;
    }
    public void setAnnio(int annio) {
        this.annio = annio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void printData() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Annio: "+annio);
        System.out.println("color: "+color);
        System.out.println("");
    }
}
