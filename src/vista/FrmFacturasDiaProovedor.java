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
        miModelo.add(LocalDate.ofYearDay(2021, 35),123,"1",21354.5);
        miModelo.add(LocalDate.ofYearDay(2021,35),123,"2",5964.6);
        miModelo.add(LocalDate.ofYearDay(2021, 35),321,"1", 8967.9);
        miModelo.add(LocalDate.ofYearDay(2021,35),321,"2",9685.8);


    }
}
