package utils;

import modelo.CuentaCorriente;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class GrillaDeudaProveedor extends AbstractTableModel {
    public List<CuentaCorriente> lista = new ArrayList<CuentaCorriente>();

    protected String[] columnNames= new String[] {"Cuit","TotalDeuda"};
    protected Class[] columnClasses = new Class[] {int.class, Double.class};

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
            default: return null;
        }

    }

    public int add(int cuit, Double deuda){
        lista.add(new CuentaCorriente(cuit,deuda));
        return lista.size() -1;
    }

}
