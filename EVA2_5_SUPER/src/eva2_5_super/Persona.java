package eva2_5_super;

/**
 *
 * @author DELL
 */
public class Persona {
    //atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private char genero;
    //constructores
    public Persona() {
        nombre = "xd";
        apellidoPaterno = "xd";
        apellidoMaterno = "xd";
        edad = 0;
        genero = '&';
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, char genero) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.genero = genero;
    }
    //get & set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public void printData() {
        System.out.println("Nombre completo: "+nombre+" "+apellidoPaterno+" "+apellidoMaterno);
        //System.out.println("Apellido Paterno: "+apellidoPaterno);
        //System.out.println("Apellido Materno: "+apellidoMaterno);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
    }
}


