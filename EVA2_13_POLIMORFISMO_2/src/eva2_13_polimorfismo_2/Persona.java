package eva2_13_polimorfismo_2;

/**
 *
 * @author DELL
 */
public class Persona implements MostrarDatos {
    private String nombre;
    private String apellidos;
    
    public Persona() {
        this.nombre = "&";
        this.apellidos = "&";
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    @Override
    public String toString() {
        return nombre+" "+apellidos;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("& Nombre: "+nombre+"\n"
                + "& Apellidos: "+apellidos);
    }
}
