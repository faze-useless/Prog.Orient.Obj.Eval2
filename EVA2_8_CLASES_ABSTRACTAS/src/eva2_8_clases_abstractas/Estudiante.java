package eva2_8_clases_abstractas;

/**
 *
 * @author DELL
 */
public class Estudiante extends Persona{
    protected String noCtrl;

    public Estudiante() {
        super();
        this.noCtrl = "2030805122";
    }

    public Estudiante(String noCtrl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noCtrl = noCtrl;
    }

    public String getNoCtrl() {
        return noCtrl;
    }
    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }
    // como las variables de persona son protected la clase heredera estudiante puede verlos directamente
    public void printData() {
        System.out.println("Nombre:      "+nombre);
        System.out.println("Apellidos:   "+apellidos);
        System.out.println("Edad:        "+edad);
        System.out.println("No. Control: "+noCtrl);
    }
    
}
