package modelDTO;

/**
 *
 * @author Perea
 */
public class NaveDTO {
    
    private int idNave;
    private String nombreNave;
    private int tipoNave;
    private int pesoNave;
    private String combustible;
    private int empuje;
    private int capPasajeros; //Capacidad de pasajeros

    public NaveDTO() {
    }

    //Constructor para llenar la tabla de naves
    public NaveDTO(int idNave, String nombreNave, int tipoNave, int pesoNave, String combustible, int empuje, int capPasajeros) {
        this.idNave = idNave;
        this.nombreNave = nombreNave;
        this.tipoNave = tipoNave;
        this.pesoNave = pesoNave;
        this.combustible = combustible;
        this.empuje = empuje;
        this.capPasajeros = capPasajeros;
    }

    //Constructor para crear una nave
    public NaveDTO(String nombreNave, int tipoNave, int pesoNave, String combustible, int empuje, int capPasajeros) {
        this.nombreNave = nombreNave;
        this.tipoNave = tipoNave;
        this.pesoNave = pesoNave;
        this.combustible = combustible;
        this.empuje = empuje;
        this.capPasajeros = capPasajeros;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public int getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(int tipoNave) {
        this.tipoNave = tipoNave;
    }

    public int getPesoNave() {
        return pesoNave;
    }

    public void setPesoNave(int pesoNave) {
        this.pesoNave = pesoNave;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }
    
    
}
