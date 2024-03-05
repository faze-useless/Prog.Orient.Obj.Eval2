package eva2_1_sobrecarga_metodos;

public class EVA2_1_SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de 5 + 4 es "+sumar(5,9));
        
        System.out.println("La suma de 3.1 + 2.5 es "+sumar(3.1,2.5));
        
        System.out.println("La suma de Hola + Mundo es "+sumar("Hola","Mundo"));
        
        sumar();
    }
    
    // SOBRE CARGA DE METODOS: usar el mismo nombre para metodos con propositos diferentes pero parecidos
    public static int sumar(int n1, int n2) {
        return n1+n2;
    }
    public static double sumar(double n1, double n2) {
        return n1+n2;
    }
    public static String sumar(String n1, String n2) {
        return n1+n2;
    }
    public static void sumar() {
        System.out.println("XD");
    }
}
