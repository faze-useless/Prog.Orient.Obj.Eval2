package eva2_11_has_a;

public class EVA2_11_HAS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion direccion1 = new Direccion("Negra arrollo","12","quintas","31140");
        Persona persona = new Persona("Walter","White",50,direccion1);
        
        System.out.println(persona);
    }
    
}
