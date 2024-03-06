package eva2_3_vehiculo;

public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        ClassCarro carro1 = new ClassCarro();
        carro1.printData();
        
        ClassCarro carro2 = new ClassCarro("Henshel", "Tiger 1", 1944, "Gris");
        carro2.printData();
        
    }
    
}
