package Interfaces;

import java.sql.SQLException;
import java.util.List;
import modelDTO.TipoNaveDTO;

/**
 *
 * @author Perea
 */
public interface ITipoNaveDao {
    public List<TipoNaveDTO> selectTipos() throws SQLException;
    
    public int selectIdByName(String tipoNave) throws SQLException;
    
    public String selectNameById(int idTipo) throws SQLException;
}
