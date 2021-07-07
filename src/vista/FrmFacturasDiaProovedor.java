package vista;

import enums.EspecieDocumento;
import enums.TipoIVA;
import utils.GrillaFacturaProveedor;
import utils.GrillaLibroIva;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class FrmFacturasDiaProovedor extends JDialog {
    private JTable tableDiaProveedor;
    private JPanel pnlPrincipal;
    private FrmFacturasDiaProovedor self;
    private GrillaFacturaProveedor miModelo = new GrillaFacturaProveedor();

    public FrmFacturasDiaProovedor(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;
        tableDiaProveedor.setModel(miModelo);
        miModelo.add(LocalDate.ofYearDay(2021, 35),2039658745,"1",21354.5);
        miModelo.add(LocalDate.ofYearDay(2021,35),2139688745,"3",5964.6);
        miModelo.add(LocalDate.ofYearDay(2021, 35),1945698547,"5", 8967.9);
        miModelo.add(LocalDate.ofYearDay(2021,35),1854214587,"4",9685.8);
        miModelo.add(LocalDate.ofYearDay(2021, 35),2036365874,"6",26354.5);
        miModelo.add(LocalDate.ofYearDay(2021,35),2136547895,"7",8964.6);
        miModelo.add(LocalDate.ofYearDay(2021, 35),1954245874,"4", 6967.9);
        miModelo.add(LocalDate.ofYearDay(2021,35),2136547895,"6",15585.8);


    }
}
