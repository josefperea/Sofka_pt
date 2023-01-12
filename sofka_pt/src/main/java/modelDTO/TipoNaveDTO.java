package modelDTO;

/**
 *
 * @author Perea
 */
public class TipoNaveDTO {
    
    private int id_nave;
    private String tipo_nave;

    public TipoNaveDTO(int id_nave, String tipo_nave) {
        this.id_nave = id_nave;
        this.tipo_nave = tipo_nave;
    }

    public int getId_nave() {
        return id_nave;
    }

    public void setId_nave(int id_nave) {
        this.id_nave = id_nave;
    }

    public String getTipo_nave() {
        return tipo_nave;
    }

    public void setTipo_nave(String tipo_nave) {
        this.tipo_nave = tipo_nave;
    }
    
    
}
