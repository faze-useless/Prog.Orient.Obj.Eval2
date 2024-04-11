package eva2_12_polimorfismo;

public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("23550385", "Ruben", "Doblas");
        System.out.println(estudiante);
        estudiante.estudiar();
        //podemos convertir un objeto de una subclase en su superclase
        Persona persona = estudiante;
        System.out.println(persona+"?");
        //persona.estudiar(); <-- no puede porque ya no es estudiante
    }
    
}
