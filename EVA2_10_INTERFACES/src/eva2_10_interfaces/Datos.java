package eva2_10_interfaces;

/**
 *
 * @author DELL
 */
public interface Datos {
    // solo acepta constantes, no atributos
    final public int VALUE = 10;
    
    // solo acepta metodos abstractos, sin llaves { }
    public void printData();
    public String createFullName();
    
}
