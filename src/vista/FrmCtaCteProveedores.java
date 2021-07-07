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
        miModelo.add(2036547854,91235.54, List.of("A","B", "NC"),List.of("A","B"),1654.2);
        miModelo.add(1954786325,69835.54, List.of("A","C"),List.of("A"),78546.2);
        miModelo.add(2145879652,54235.54, List.of("A"),List.of("A"),12584.2);
        miModelo.add(2069854785,326235.54, List.of("A","B","C"),List.of("B","C"),6283.2);
        miModelo.add(1956348965,854725.54, List.of("A","NC","ND"),List.of("A","ND"),9854.2);
        miModelo.add(1845632578,104785.54, List.of("B","NC"),List.of("B"),63974.2);
        miModelo.add(2045874963,36535.54, List.of("C"),List.of("C"),41785.2);
        miModelo.add(2146385726,965435.54, List.of("A","NC"),List.of("A"),5841.2);


    }
}
