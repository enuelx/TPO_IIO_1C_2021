package vista;

import enums.EspecieDocumento;
import enums.TipoIVA;
import utils.GrillaLibroIva;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FrmLibroIVA extends JDialog {

    private JPanel pnlPrincipal;
    private JTable tableControllerContable;
    private JScrollBar scrollBar1;
    private FrmLibroIVA self;
    private GrillaLibroIva miModelo = new GrillaLibroIva();

    public FrmLibroIVA(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(500,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;
        tableControllerContable.setModel(miModelo);
        miModelo.add(1234,"Made",LocalDate.ofYearDay(1995,32), EspecieDocumento.FACTURA, TipoIVA.DOSCINCO,"21544");
        miModelo.add(4321,"Pili",LocalDate.ofYearDay(1996,349), EspecieDocumento.FACTURA, TipoIVA.DOSCINCO,"68687");
    }

}
