package eva2_13_polimorfismo_2;

/**
 *
 * @author DELL
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Persona persona1 = new Persona("Ruben", "Doblas");
        Persona persona2 = new Persona("Samuel", "Deluque");
        Persona persona3 = new Persona("Leonardo", "Davinci");
        
        Estudiante estudiante1 = new Estudiante("23550385", "Walter Jr", "White");
        Estudiante estudiante2 = new Estudiante("23550323", "Peter", "Parker");
        Estudiante estudiante3 = new Estudiante("23550365", "Shouko", "Komi");
        
        // no se pueden instanciar interfaces
        // MostrarDatos xd = new MostrarDatos();
        
        imprimirDatos(persona1);
        imprimirDatos(persona2);
        imprimirDatos(persona3);
        
        imprimirDatos(estudiante1);
        imprimirDatos(estudiante2);
        imprimirDatos(estudiante3);
        */
        Estudiante estudiantes[] = new Estudiante[3000];
        for (int i = 1; i <= estudiantes.length; i++) {
            estudiantes[i] = new Estudiante("2355"+i,"Estudiante #"+i,"null");
        }
        
        for (int i = 1; i <= estudiantes.length; i++) {
            imprimirDatos(estudiantes[i]);
        }
    }
    
    public static void imprimirDatos(MostrarDatos datos) {
        datos.imprimirDatos();
        // CASTING
        if (datos instanceof Estudiante) { // verifica que clase era el objeto
            Estudiante estudiante = (Estudiante)datos;
        } else {
            Persona persona = (Persona)datos;
        }
    }
    
}
