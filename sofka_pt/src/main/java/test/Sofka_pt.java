package test;

import Formularios.frmPrincipal;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Perea
 */
public class Sofka_pt {

    public static void main(String[] args) throws SQLException {
        frmPrincipal miFrmPrincipal = new frmPrincipal();
        miFrmPrincipal.setLocationRelativeTo(null);
        miFrmPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        miFrmPrincipal.setVisible(true);
    }
}
