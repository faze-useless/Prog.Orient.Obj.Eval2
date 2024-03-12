package eva2_5_super;

/**
 *
 * @author DELL
 */
//            Subclase    de   Superclase
public class Estudiante extends Persona {
    //atributos
    private String noControl;
    private String carrera;

    //constructores
    public Estudiante() {
        super();// Llamada al contructor de la superclase
        noControl = "&";
        carrera = "&";
    }
    //SIEMPRE HAY QUE LLAMAR AL CONTRUCTOR DE LA SUPERCLASE
    //SIEMPRE DEBE SER LA PRIMERA INSTRUCCION
    public Estudiante( String nombre, String apellidoPaterno, String apellidoMaterno, int edad, char genero, String noControl, String carrera) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, genero);//Llamada al contructor custon de la superclase
        this.noControl = noControl;
        this.carrera = carrera;
    }

    //get & set
    public String getNoControl() {
        return noControl;
    }
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void printData(){
        super.printData();
        System.out.println("Numero de control: "+noControl);
        System.out.println("Carrera: "+carrera);
    }
}
