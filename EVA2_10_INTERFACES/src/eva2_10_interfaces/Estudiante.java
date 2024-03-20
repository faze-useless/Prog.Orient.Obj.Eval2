
package eva2_10_interfaces;

/**
 *
 * @author DELL
 */
public class Estudiante extends Persona implements Datos, GenerarFecha {
    private String noCtrl;

    public Estudiante() {
        super();
        this.noCtrl = "";
    }

    public Estudiante(String noCtrl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noCtrl = noCtrl;
    }

    public String getNoCtrl() {
        return noCtrl;
    }
    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }
    
    @Override
    public void printData(){
        System.out.println("nombre # "+getNombre());
        System.out.println("apellidos # "+getApellido());
        System.out.println("edad # "+getEdad());
        System.out.println("año de nacimiento # "+calcYear());
    }
    
    @Override
    public String createFullName(){
        return "# "+getNombre()+" "+getApellido();
    }

    @Override
    public int calcYear() {
        return 2024-getEdad();
    }
}
