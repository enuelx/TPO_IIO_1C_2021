package vista;

import utils.GrillaDeudaProveedor;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FrmDeudaProveedor extends JDialog {
    private JTable tableDeudaproveedor;
    private JPanel pnlPrincipal;
    private FrmDeudaProveedor self;
    private GrillaDeudaProveedor miModelo = new GrillaDeudaProveedor();

    public FrmDeudaProveedor(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;
        tableDeudaproveedor.setModel(miModelo);
        miModelo.add(123,12354.65);
        miModelo.add(321, 84512.85);
        /*miModelo.add(LocalDate.ofYearDay(2021, 35),321,"1", 8967.9);
        miModelo.add(LocalDate.ofYearDay(2021,35),321,"2",9685.8);*/

    }
}
