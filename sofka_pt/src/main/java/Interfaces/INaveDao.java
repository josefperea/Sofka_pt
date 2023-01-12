package Interfaces;

import java.sql.SQLException;
import java.util.List;
import modelDTO.NaveDTO;

/**
 *
 * @author Perea
 */
public interface INaveDao {
    
    public List<NaveDTO> selectNaves() throws SQLException;
    
    public int insertNave(NaveDTO nave) throws SQLException;
}
