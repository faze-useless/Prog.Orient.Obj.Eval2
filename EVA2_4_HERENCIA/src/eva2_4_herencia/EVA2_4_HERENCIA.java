package eva2_4_herencia;

public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona obj = new Persona();
        System.out.println(obj.toString());
        //El metodo to string se hereda de object
        //TODAS LAS CLASES DE HAVA DESCIENDEN DE UNA CLASE GENERAL (Object)
        
        Estudiante obj2 = new Estudiante();
        System.out.println("Nombre: " + obj2.getNombre());
        System.out.println("Apellidos: " + obj2.getApellidos());
        System.out.println("Edad: " + obj2.getEdad());
    } 
}

class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        nombre = "xd";
        apellidos = "xd";
        edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}

class Estudiante extends Persona {
    private String noControl;

    public String getNoControl() {
        return noControl;
    }
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}