package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame {
    private JPanel pnlPrincipal;
    private JPanel pnlMenu;
    private JButton usuariosButton;
    private JButton proveedoresButton;
    private JButton ordenDeCompraYButton;
    private JButton consultasGeneralesButton;
    private JButton generacionDeOrdenesDeButton;
    private FrmPrincipal self;

    public FrmPrincipal(String titulo){
        super(titulo);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        this.setContentPane(pnlPrincipal);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.asociarEventos();
        this.self= this;


    }

    private void asociarEventos(){
        consultasGeneralesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmConsultasGenerales frame = new FrmConsultasGenerales(self, "Seleccione su consulta");
                frame.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal("TPO Grupo 2");
        frame.setVisible(true);
    }

}
