package utils;

import javax.swing.table.AbstractTableModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.CuentaCorriente;
import modelo.Documento;
import modelo.Factura;
import modelo.RepositorioDeDocumentos;

public class GrillaCCProveedor extends AbstractTableModel {
    public List<CuentaCorriente> lista = new ArrayList<CuentaCorriente>();

    protected String[] columnNames= new String[] {"Cuit","Deuda","DocRecibidos","DocImpagos","PagosRealizados"};
    protected Class[] columnClasses = new Class[] {int.class, Double.class, List.class,List.class, Double.class};

    public String getColumnName(int col) {return columnNames[col];}
    public Class getColumnClass(int col) {return columnClasses[col];}


    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return lista.get(rowIndex).getProveedor();
            case 1: return lista.get(rowIndex).getDeuda();
            case 2: return lista.get(rowIndex).getDocRecibidos();
            case 3: return lista.get(rowIndex).getDocInpagos();
            case 4: return lista.get(rowIndex).getPagosRealizados();
            default: return null;
        }

    }

    public int add(int cuit, Double deuda, List docRecibidos, List docImpagos, Double pagosRealizados){
        lista.add(new CuentaCorriente(cuit,deuda,docRecibidos,docImpagos,pagosRealizados));
        return lista.size() -1;
    }

}
