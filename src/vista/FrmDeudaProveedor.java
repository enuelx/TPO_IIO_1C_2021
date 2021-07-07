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
        miModelo.add(2036587452,12354.65);
        miModelo.add(1995478632, 84512.85);
        miModelo.add(2036985475,19354.65);
        miModelo.add(2136587459, 74512.85);
        miModelo.add(1836524587,9354.65);
        miModelo.add(2036932145, 156512.85);
        miModelo.add(2134562145,36354.65);
        miModelo.add(1945621896, 87512.85);


    }
}
