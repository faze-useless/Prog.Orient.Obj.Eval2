package eva2_11_has_a;

/**
 *
 * @author DELL
 */
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String codigoPostal;

    public Direccion() {
        this.calle = "";
        this.numero = "";
        this.colonia = "";
        this.codigoPostal = "";
    }

    public Direccion(String calle, String numero, String colonia, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Override
    public String toString() {
        return "calle "+calle+" numero "+numero+", colonia "+colonia+" C.P. "+codigoPostal;
    }
}