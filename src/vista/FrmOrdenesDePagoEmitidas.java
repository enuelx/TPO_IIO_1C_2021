package vista;

import enums.FormaPago;
import utils.GrillaOrdenesPagoEmitidas;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FrmOrdenesDePagoEmitidas extends JDialog{
    private JTable tableOrdenPagoEmitida;
    private JPanel pnlPrincipal;
    private FrmOrdenesDePagoEmitidas self;
    private GrillaOrdenesPagoEmitidas miModelo = new GrillaOrdenesPagoEmitidas();

    public FrmOrdenesDePagoEmitidas(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;
        tableOrdenPagoEmitida.setModel(miModelo);
        miModelo.add(32587,List.of("A","B","C"),12358.25f, FormaPago.CHEQUE);
        miModelo.add(32569,List.of("A", "B"),547856.35f,FormaPago.EFECTIVO);
        miModelo.add(32784,List.of("A"),85478.58f,FormaPago.EFECTIVO);
        miModelo.add(33658,List.of("A","C"),36525.54f,FormaPago.CHEQUE);
        miModelo.add(33689,List.of("B","C"),2365478.56f,FormaPago.EFECTIVO);
        miModelo.add(33758,List.of("A","B"),4785412.45f,FormaPago.CHEQUE);

    }
}
