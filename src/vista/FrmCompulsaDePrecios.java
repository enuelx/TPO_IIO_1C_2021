package vista;

import modelo.PPItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FrmCompulsaDePrecios extends JDialog{
    private JPanel pnlPrincipal;
    private JComboBox comboBox1;
    private JComboBox cbProductosyServicios;
    private FrmCompulsaDePrecios self;

    private List<PPItem> productos = new ArrayList<PPItem>();


    public FrmCompulsaDePrecios(Window owner, String titulo){
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(300,300);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.self= this;

        productos.add(new PPItem("h1",12543.2f));
        productos.add(new PPItem("h2",12543.2f));
        productos.add(new PPItem("h3",12543.2f));
        productos.add(new PPItem("h4",12543.2f));
        productos.add(new PPItem("h5",12543.2f));
        productos.add(new PPItem("h6",12543.2f));
        productos.add(new PPItem("h7",12543.2f));


        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        model1.addAll((Collection) productos);
        cbProductosyServicios.setModel(model1);

        cbProductosyServicios.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                
            }
        });
    }

}
