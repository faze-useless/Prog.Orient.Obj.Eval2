package eva2_14_vehiculos;

/**
 *
 * @author DELL
 */
public class EVA2_14_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo flota[] = new Vehiculo[10];
        flota[0] = new Auto (4,0);
        flota[1] = new Auto (6,0);
        flota[2] = new Auto (2,0);
        flota[3] = new Auto (2,0);
        flota[4] = new Auto (4,0);
        flota[5] = new Moto (125,0);
        flota[6] = new Moto (400,0);
        flota[7] = new Moto (400,0);
        flota[8] = new Moto (1000,0);
        flota[9] = new Moto (625,0);
        
        Auto auto1 = (Auto) flota[0];
        System.out.println("# de puertas: "+ auto1.getNoPuertas());
        Moto moto2 = (Moto) flota[5];
        System.out.println("capacidad: "+ moto2.getCapacidad());
        
        System.out.println("");
        
        for (int i = 0; i < flota.length; i++) {
            //System.out.println(i);
            System.out.print("#"+i+" ");
                    
            if (flota[i] instanceof Auto) {
                Auto auto = (Auto) flota[i];
                System.out.println("# de puertas: "+ auto.getNoPuertas());
            } else {
                Moto moto = (Moto) flota[i];
                System.out.println("capacidad: "+ moto.getCapacidad());
            }
        }
        System.out.println("");
        
        for (int i = 0; i < flota.length; i++) {
            //System.out.println(i);
            acelerar(flota[i],45);
            System.out.println("#"+i+" Velocidad del vehiculo "+flota[i].getVelocidad()+"km/h");
        }
        System.out.println("");
        for (int i = 0; i < flota.length-5; i++) {
            //System.out.println(i);
            acelerar(flota[i],-35);
            System.out.println("#"+i+" Velocidad del vehiculo "+flota[i].getVelocidad()+"km/h");
        }

    }
    
    public static void acelerar(Vehiculo vehiculo, int ajuste) {
        vehiculo.acelerar(ajuste);
    }
    
}
