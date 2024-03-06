package eva2_2_sobrecarga_constructores;

public class ClassPerosna {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;

    public ClassPerosna() {
        this.nombre = "n";
        this.apellidos = "n";
        this.edad = 0;
    }

    public ClassPerosna(String nombre, String apellidos, int edad) {
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
    
    public void printData() {
        System.out.println("Nombre : "+nombre);
        System.out.println("Apellidos : "+apellidos);
        System.out.println("Edad: "+edad);
        System.out.println("");
    }
}
