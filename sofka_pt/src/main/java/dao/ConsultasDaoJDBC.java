package dao;

import Interfaces.IConsultasDao;
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
public class ConsultasDaoJDBC implements IConsultasDao {

    private Connection conexionTransaccional;

    //Constantes que almacenan las consultas SQL
    static private final String SQL_SELECT_BY_NOMBRE= "SELECT * from naves WHERE nombre LIKE ?";
    static private final String SQL_SELECT_BY_PESO = "SELECT * from naves WHERE peso BETWEEN ? and ?";
    static private final String SQL_SELECT_BY_NOMBRE_AND_PESO = "SELECT * from naves WHERE nombre LIKE ? and peso BETWEEN ? and ?";
    
    public ConsultasDaoJDBC() {
    }

    public ConsultasDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    //Metodo para buscar una o mas naves por su nombre
    @Override
    public List<NaveDTO> selectByNombre(String nombre) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        NaveDTO nave = null;
        List<NaveDTO> naves = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT_BY_NOMBRE);
            pst.setString(1, "%" + nombre + "%");
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

    //Metodo para buscar una o mas naves por su peso
    @Override
    public List<NaveDTO> selectByPeso(int desde, int hasta) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        NaveDTO nave = null;
        List<NaveDTO> naves = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT_BY_PESO);
            pst.setInt(1, desde);
            pst.setInt(2, hasta);
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

    //Metodo para buscar una o mas naves por su nombre y peso
    @Override
    public List<NaveDTO> selectByNombreAndPeso(String nombre, int desde, int hasta) throws SQLException {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        NaveDTO nave = null;
        List<NaveDTO> naves = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pst = conn.prepareStatement(SQL_SELECT_BY_NOMBRE_AND_PESO);
            pst.setString(1, "%" + nombre + "%");
            pst.setInt(2, desde);
            pst.setInt(3, hasta);
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

}
