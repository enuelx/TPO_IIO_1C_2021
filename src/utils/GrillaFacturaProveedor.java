package utils;

import modelo.ControllerContable;
import modelo.Factura;

import javax.swing.table.AbstractTableModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GrillaFacturaProveedor extends AbstractTableModel {
    public List<Factura> lista = new ArrayList<Factura>();

    protected String[] columnNames= new String[] {"Fecha Emision","Cuit","N Factura","Monto"};
    protected Class[] columnClasses = new Class[] {LocalDate.class, int.class, String.class, Double.class};

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
            case 0: return lista.get(rowIndex).getFechaEmision();
            case 1: return lista.get(rowIndex).getProveedor();
            case 2: return lista.get(rowIndex).getCodDocumento();
            case 3: return lista.get(rowIndex).getMonto();
            default: return null;
        }

    }

    public int add(LocalDate FechaEmision , int Cuit, String Factura, Double Monto){
        lista.add(new Factura(FechaEmision,Cuit,Factura,Monto));
        return lista.size() -1;
    }
}
