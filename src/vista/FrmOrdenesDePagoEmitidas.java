package vista;

import javax.swing.*;
import java.awt.*;

public class FrmOrdenesDePagoEmitidas extends JDialog{
    private JTable table1;
    private JPanel pnlPrincipal;
    private FrmOrdenesDePagoEmitidas self;
    public FrmOrdenesDePagoEmitidas(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;

    }
}
