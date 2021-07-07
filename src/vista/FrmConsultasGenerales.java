package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmConsultasGenerales extends JDialog {
    private JPanel pnlPrincipal;
    private JButton totalDeFacturasPorButton;
    private JButton ordenesDePagoEmitidasButton;
    private JButton compulsaDePreciosButton;
    private JButton cuentaCorrienteDeProveedoresButton;
    private JButton totalDeDeudaPorButton;
    private JButton totalDeImpuestosRetenidosButton;
    private JButton consultaLibroIVAButton;
    private FrmConsultasGenerales self;

    public FrmConsultasGenerales(Window owner, String titulo){
        super(owner, titulo);
        this.setContentPane(pnlPrincipal);
        this.setSize(500,500);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;

        consultaLibroIVAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmLibroIVA frame = new FrmLibroIVA(self, "Libro IVA");
                frame.setVisible(true);

            }
        });
        totalDeDeudaPorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmDeudaProveedor frame = new FrmDeudaProveedor(self, "Total de deuda por proveedor");
                frame.setVisible(true);
            }
        });
        totalDeImpuestosRetenidosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmImpuestosRetenidos frame = new FrmImpuestosRetenidos(self, "Total de impuestos retenidos");
                frame.setVisible(true);

            }
        });

        compulsaDePreciosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmCompulsaDePrecios frame = new FrmCompulsaDePrecios(self, "Compulsa de Precios");
                frame.setVisible(true);
            }
        });
        ordenesDePagoEmitidasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmOrdenesDePagoEmitidas frame = new FrmOrdenesDePagoEmitidas(self, "Ordenes de Pago emitidas");
                frame.setVisible(true);
            }
        });
        totalDeFacturasPorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmFacturasDiaProovedor frame = new FrmFacturasDiaProovedor(self, "Total de facturas por dia y/o proveedor");
                frame.setVisible(true);
            }
        });
        cuentaCorrienteDeProveedoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmCtaCteProveedores frame = new FrmCtaCteProveedores(self, "Cuenta corriente de proveedores");
                frame.setVisible(true);
            }
        });
    }


}
