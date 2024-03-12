package eva2_6_clases_abstractas;

/**
 *
 * @author DELL
 */
public class Circulo extends Figura {
    //atributos
    private double radio;

    public Circulo() {
        radio = 7;
    }

    public Circulo(double base, double altura) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcArea(){
        return Math.PI*(radio*radio);
    }
    @Override
    public double calcPerimeter(){
        return Math.PI*2*radio;
    }
}
