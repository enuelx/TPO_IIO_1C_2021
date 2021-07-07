package vista;

import modelo.Documento;
import utils.GrillaCCProveedor;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FrmCtaCteProveedores extends JDialog{
    private JTable tableCCProveedor;
    private JPanel pnlPrincipal;
    private FrmCtaCteProveedores self;
    private GrillaCCProveedor miModelo = new GrillaCCProveedor();

    public FrmCtaCteProveedores(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(500,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;
        tableCCProveedor.setModel(miModelo);
        miModelo.add(123,91235.54, List.of("weqw","ewrwe"),List.of("ie5","ie9"),1684.2);
        /*miModelo.add(LocalDate.ofYearDay(2021,35),123,"2",5964.6);
        miModelo.add(LocalDate.ofYearDay(2021, 35),321,"1", 8967.9);
        miModelo.add(LocalDate.ofYearDay(2021,35),321,"2",9685.8);*/

    }
}
