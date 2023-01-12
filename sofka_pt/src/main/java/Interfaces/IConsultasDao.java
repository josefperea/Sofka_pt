package Interfaces;

import java.sql.SQLException;
import java.util.List;
import modelDTO.NaveDTO;

/**
 *
 * @author Perea
 */
public interface IConsultasDao {
    
    public List<NaveDTO> selectByNombre(String nombre) throws SQLException;
    
    public List<NaveDTO> selectByPeso(int desde, int hasta) throws SQLException;
    
    public List<NaveDTO> selectByNombreAndPeso(String nombre, int desde, int hasta) throws SQLException;
}
