package eva2_2_sobrecarga_constructores;

public class EVA2_2_SOBRECARGA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassPerosna object1 = new ClassPerosna();
        object1.printData();
        
        ClassPerosna object2 = new ClassPerosna("Walter","White",50);
        object2.printData();
        object2.setNombre("Jesse");
        object2.setApellidos("Pinkman");
        object2.setEdad(20);
        object2.printData();
    }
    
}
