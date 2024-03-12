package eva2_6_clases_abstractas;

/**
 *
 * @author DELL
 */
public class Triangulo extends Figura {
    //atributos
    private double base;
    private double altura;

    public Triangulo() {
        base = 5;
        altura = 5;
    }

    public Triangulo(double base, double altura) {
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
        return (base*altura)/2;
    }
    private double calcHypotenuse() {
        return Math.sqrt((base*base)+(altura*altura));
    }
    @Override
    public double calcPerimeter(){
        return base+altura+calcHypotenuse();
    }
}
