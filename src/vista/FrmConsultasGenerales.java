package vista;

import javax.swing.*;
import java.awt.*;

public class FrmConsultasGenerales extends JDialog {
    private JPanel pnlPrincipal;

    public FrmConsultasGenerales(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);


    }

}
