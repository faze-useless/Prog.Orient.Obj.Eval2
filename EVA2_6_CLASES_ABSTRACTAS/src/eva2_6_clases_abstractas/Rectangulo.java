package eva2_6_clases_abstractas;

/**
 *
 * @author DELL
 */
public class Rectangulo extends Figura {
//atributos
    private double base;
    private double altura;

    public Rectangulo() {
        base = 7;
        altura = 5;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcArea(){
        return (base*altura);
    }
    @Override
    public double calcPerimeter(){
        return (base*2)+(altura*2);
    }
}
