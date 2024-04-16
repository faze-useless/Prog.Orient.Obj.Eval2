package eva2_13_polimorfismo_2;

/**
 *
 * @author DELL
 */
public class Estudiante extends Persona {
    private String noCtrl;

    public Estudiante() {
        super();
        this.noCtrl = "&";
    }

    public Estudiante(String noCtrl, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.noCtrl = noCtrl;
    }
    
    public String getNoCtrl() {
        return noCtrl;
    }

    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }
    
    @Override
    public String toString() {
        return super.toString()+" #"+noCtrl;
    }
    
    public void estudiar() {
        System.out.println("Ha estudiado con exito.");
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("& #Ctrl: "+noCtrl);
    }
}
