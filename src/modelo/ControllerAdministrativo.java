package modelo;

import java.util.*;

/**
 * 
 */
public class ControllerAdministrativo {

	/**
	 * Default constructor
	 */
	public ControllerAdministrativo() {
	}

	// Instancia de Objetos Base
	Proveedor pv = new Proveedor();

	
	
	private List<ProductoYServicio> productosYServicios;
	

	/**
	 * @param value
	 */
	public void setCUIT(int value) {
		pv.setCUIT(value);
	}

	/**
	 * @param value
	 */
	public void setResponsabilidadIva(String value) {
		pv.setResponsabilidadIva(value);
	}

	/**
	 * @param codigoItem
	 */
	public List<ProveedorProductoServicio> compulsaDePrecios(String codigoItem) {
		
		ProductoYServicio productoBuscado = this.encontrarProductoYServicio(codigoItem, this.productosYServicios);
		
		return productoBuscado.getProductosYServiciosProveedor();
		
		
	}

	
public ProductoYServicio encontrarProductoYServicio (String codItem, List<ProductoYServicio> listaProductos) {
		
		Iterator iter1 = listaProductos.iterator();
		ProductoYServicio aux; 
		
		while (iter1.hasNext()) {
			
			aux = (ProductoYServicio) iter1.next();
			if (codItem.equals(aux.getCodigoItem())) {
				return aux;
			}
		}
		return null;
			
		}
	
	
	
	
	
}