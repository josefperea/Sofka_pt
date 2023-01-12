package dao;

import Interfaces.INaveDao;
import config.Conexion;
import static config.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelDTO.NaveDTO;

/**
 *
 * @author Perea
 */
public class NaveDaoJDBC implements INaveDao{
    
    private Connection conexionTransaccional;
    
    //Constantes que almacenan las consultas SQL
    static private final String SQL_SELECT = "SELECT * from naves";
    static private final String SQL_INSERT = "INSERT into naves (nombre, peso, empuje, capacidad_pasajeros, id_tipo_nave, combustible)"
            + "values (?,?,?,?,?,?)";

    public NaveDaoJDBC() {
    }
    
    public NaveDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    //Metodo para traer todas las naves registradas en la base de datos
    @Override
    public List<NaveDTO> selectNaves() throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        NaveDTO nave = null;
        List<NaveDTO> naves = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT);
            rs = pst.executeQuery();

            while (rs.next()) {
                int idNave = rs.getInt(1);
                String nombreNave = rs.getString(2);
                int pesoNave = rs.getInt(3);
                String combustible = rs.getString(4);
                int empuje = rs.getInt(5);
                int capPasajeros = rs.getInt(6);
                int tipoNave = rs.getInt(7);

                nave = new NaveDTO(idNave, nombreNave, tipoNave, pesoNave, combustible, empuje, capPasajeros);
                naves.add(nave);
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

        return naves;
    }

    //Metodo para crear una nave
    @Override
    public int insertNave(NaveDTO nave) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;

        int registros = 0;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_INSERT);
            pst.setString(1, nave.getNombreNave());
            pst.setInt(2, nave.getPesoNave());
            pst.setInt(3, nave.getEmpuje());
            pst.setInt(4, nave.getCapPasajeros());
            pst.setInt(5, nave.getTipoNave());
            pst.setString(6, nave.getCombustible());
            
            registros = pst.executeUpdate();
        } finally {
            try {
                close(pst);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }
    
}
