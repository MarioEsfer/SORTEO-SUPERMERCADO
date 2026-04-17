package logica;

import igu.Principal;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

public class TPIntegradorSorteos {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Principal ventana = new Principal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
