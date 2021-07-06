package vista;

//import utils.GrillaLibroIva;

import javax.swing.*;
import java.awt.*;

public class FrmLibroIVA extends JDialog {

    private JPanel pnlPrincipal;
    private JTable tableControllerContable;
    private JScrollBar scrollBar1;
    private FrmLibroIVA self;
    //private GrillaLibroIva miModelo = new GrillaLibroIva();

    public FrmLibroIVA(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;

        //tableControllerContable.setModel(miModelo);

    }

}
