package utils;

import enums.FormaPago;
import modelo.CuentaCorriente;
import modelo.Documento;
import modelo.OrdenDePago;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class GrillaOrdenesPagoEmitidas extends AbstractTableModel {
    public List<OrdenDePago> lista = new ArrayList<OrdenDePago>();

    protected String[] columnNames= new String[] {"NOrden", "Doc.Asociados","MontoCancelar","FormaPago"};
    protected Class[] columnClasses = new Class[] {int.class, List.class, Float.class, FormaPago.class};

    public String getColumnName(int col) {return columnNames[col];}
    public Class getColumnClass(int col) {return columnClasses[col];}

    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return this.columnNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return lista.get(rowIndex).getNumero();
            case 1: return lista.get(rowIndex).getDocumentosAsociados();
            case 2: return lista.get(rowIndex).getMontoXCancelar();
            case 3: return lista.get(rowIndex).getFormaDePago();
            default: return null;
        }

    }

    public int add(int nOrden, List docAsociados, Float monto, FormaPago formaPago){
        lista.add(new OrdenDePago(nOrden, docAsociados , monto , formaPago));
        return lista.size() -1;
    }


}