package modelo;
import java.time.LocalDate;
import java.util.*;

import enums.EspecieDocumento;

/**
 * 
 */
public class Factura extends Documento {

	/**
	 * Default constructor
	 */
	public Factura() {
	}

	/**
	 * 
	 */
	private OrdenDeCompra ordenCompra;

	public Factura(LocalDate fechaEmision, int cuit, String factura, Double monto) {
		this.setFechaEmision(fechaEmision);
		this.setProveedorCuit(cuit);
		this.setCodDocumento(factura);
		this.setMonto(monto);
	}

	/**
	 * @return
	 */
	public OrdenDeCompra getOrdenCompra() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setOrdenCompra(OrdenDeCompra value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public int obtenerProveedorCuit() {
		return this.getProveedorCuit();
	}

	/**
	 * 
	 */
	public int getCuitProveedorCompra() {
		return this.getCuitProveedorCompra();
	}

	public static int size() {
		Factura.size();
		return Factura.size();
		
	}
	
	public EspecieDocumento getEspecieDocumento() {
		return this.getEspecieDocumento();
	}
	
	public List<ItemDeCompra> getProductos(){
		return this.getProductos();
	}

}