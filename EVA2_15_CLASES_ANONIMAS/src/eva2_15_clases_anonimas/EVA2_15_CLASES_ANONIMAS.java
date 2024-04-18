package eva2_15_clases_anonimas;

/**
 *
 * @author DELL
 */
public class EVA2_15_CLASES_ANONIMAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test() { // esto es una clase sin nombre, utilizada solo para este objeto
            @Override
            public void ShowMessage() {
                System.out.println("Mensaje xdxdxd");
            }
        };
        
        Abstracta abstracta = new Abstracta() {
            @Override
            public void ShowAnotherMessage() {
                System.out.println("Otro mensaje xdxdxd");
            }
        };
        
        test.ShowMessage();
        abstracta.ShowAnotherMessage();
        abstracta.Message();
        
    }
    
}

interface Test {
    public void ShowMessage();   
}

abstract class Abstracta {
    public abstract void ShowAnotherMessage();
    
    public void Message() {
        System.out.println("Mensaje solo&");
    }
}