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
        miModelo.add(2033016244,"Made",LocalDate.ofYearDay(1995,20), EspecieDocumento.FACTURA, TipoIVA.DOSCINCO,"21544");
        miModelo.add(2033016244,"Made",LocalDate.ofYearDay(1995,32), EspecieDocumento.CREDITO, TipoIVA.DOSCINCO,"56214");
        miModelo.add(2033301624,"Made",LocalDate.ofYearDay(1995,62), EspecieDocumento.FACTURA, TipoIVA.CINCO,"78541");
        miModelo.add(2033016244,"Made",LocalDate.ofYearDay(1995,62), EspecieDocumento.FACTURA, TipoIVA.VEINTISIETE,"63985");
        miModelo.add(2033016244,"Made",LocalDate.ofYearDay(1995,80), EspecieDocumento.DEBITO, TipoIVA.DIEZCINCO,"78541");
        miModelo.add(1939916866,"Pili",LocalDate.ofYearDay(1996,349), EspecieDocumento.CREDITO, TipoIVA.DOSCINCO,"68687");
        miModelo.add(1939916866,"Pili",LocalDate.ofYearDay(1996,349), EspecieDocumento.FACTURA, TipoIVA.VEINTIUNO,"36528");
        miModelo.add(1939916866,"Pili",LocalDate.ofYearDay(1996,363), EspecieDocumento.FACTURA, TipoIVA.DOSCINCO,"21458");
        miModelo.add(1939916866,"Pili",LocalDate.ofYearDay(1996,365), EspecieDocumento.DEBITO, TipoIVA.VEINTIUNO,"78452");
        miModelo.add(1939916866,"Pili",LocalDate.ofYearDay(1996,365), EspecieDocumento.FACTURA, TipoIVA.VEINTISIETE,"36985");
    }

}
