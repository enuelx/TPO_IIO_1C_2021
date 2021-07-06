/*package utils;

import modelo.ControllerContable;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class GrillaLibroIva extends AbstractTableModel {

    public List<ControllerContable> lista = new ArrayList<ControllerContable>();

    protected String[] columnNames= new String[] {"Cuit Proveedor","Nombre","Fecha","EspecieDoc","IVA","Total"};
    protected Class[] columnClasses = new Class[] {String.class, String.class, String.class, String.class, String.class, String.class};

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
            case 0: return lista.get(rowIndex).getProveedorCuit();
            case 1: return lista.get(rowIndex).getNombreProveedor();
            case 2: return lista.get(rowIndex).getFecha();
            case 3: return lista.get(rowIndex).getEspecieDoc();
            case 4: return lista.get(rowIndex).getIVA();
            case 5: return lista.get(rowIndex).getTotales();
            default: return null;
        }

    }

    public int add(String cuit, String nombre, String fecha, String especiedoc, String iva, String total ){

    }
}
*/