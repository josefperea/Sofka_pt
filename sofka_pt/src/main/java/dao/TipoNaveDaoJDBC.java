package dao;

import Interfaces.ITipoNaveDao;
import config.Conexion;
import static config.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelDTO.TipoNaveDTO;

/**
 *
 * @author Perea
 */
public class TipoNaveDaoJDBC implements ITipoNaveDao{
    
    private Connection conexionTransaccional;
    
    //Constantes que almacenan las consultas SQL
    static private final String SQL_SELECT_TIPOS = "SELECT * from tipo_nave";
    static private final String SQL_SELECT_IDBYNAME = "SELECT id_tipo_nave from tipo_nave WHERE nombre_tipo = ?";
    static private final String SQL_SELECT_NAMEBYID = "SELECT nombre_tipo from tipo_nave WHERE id_tipo_nave = ?";
    
    public TipoNaveDaoJDBC() {
    }

    public TipoNaveDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    //Metodo para traer los tipos de naves
    @Override
    public List<TipoNaveDTO> selectTipos() throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        TipoNaveDTO tipo = null;
        
        List<TipoNaveDTO> tipos = new ArrayList<>();
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT_TIPOS);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                int idTipo = rs.getInt(1);
                String nombreTipo = rs.getString(2);

                tipo = new TipoNaveDTO(idTipo, nombreTipo);
                tipos.add(tipo);
            }
        }finally {
            try {
                close(rs);
                close(pst);

                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return tipos;
    }

    //Metodo para obtener el ID del tipo de nave segun su nombre
    @Override
    public int selectIdByName(String tipoNave) throws SQLException{
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT_IDBYNAME);
            pst.setString(1, tipoNave);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1);
            }
        } finally {
            try {
                close(rs);
                close(pst);

                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return 0;
    }

    //Metodo para obtener el nombre del tipo segun el Id del tipo
    @Override
    public String selectNameById(int idTipo) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT_NAMEBYID);
            pst.setInt(1, idTipo);
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                return rs.getString(1);
            }
        } finally {
            try {
                close(rs);
                close(pst);

                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return "UNKNOWN";
    }
}
