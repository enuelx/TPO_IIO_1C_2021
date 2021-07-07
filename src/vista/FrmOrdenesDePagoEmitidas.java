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
        miModelo.add(123,List.of("F2","F9"),123.2f, FormaPago.CHEQUE);
        /*miModelo.add(LocalDate.ofYearDay(2021,35),123,"2",5964.6);
        miModelo.add(LocalDate.ofYearDay(2021, 35),321,"1", 8967.9);
        miModelo.add(LocalDate.ofYearDay(2021,35),321,"2",9685.8);*/

    }
}
