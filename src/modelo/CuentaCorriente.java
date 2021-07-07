package modelo;

import java.util.*;
/**
 * 
 */
public class CuentaCorriente extends Persistente{
	
	/**
	 * Default constructor

	public CuentaCorriente() {
	}*/

	/**
	 * 
	 */
	private int nroCuenta;

	/**
	 * 
	 */
	private int proveedor;

	/**
	 * 
	 */
	private Double deuda;

	/**
	 * 
	 */
	private List<Documento> docRecibidos;

	/**
	 * 
	 */
	private List<Documento> docInpagos;

	/**
	 * 
	 */
	private Double pagosRealizados;

	public CuentaCorriente(int cuit, Double deuda, List<Documento> docRecibidos, List<Documento> docImpagos, Double pagosRealizados) {
		this.setProveedor(cuit);
		this.setDeuda(deuda);
		this.setDocRecibidos(docRecibidos);
		this.setDocInpagos(docImpagos);
		this.setPagosRealizados(pagosRealizados);
	}

	/**
	 * @return
	 */
	public Double getPagosRealizados() {
		// TODO implement here
		return this.pagosRealizados;
	}

	/**
	 * @param value
	 */
	public void setPagosRealizados(Double value)
		 {
		this.pagosRealizados=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Double getDeuda() {
		// TODO implement here
		return this.deuda;
	}

	/**
	 * @param value
	 */
	public void setDeuda(Double value) {
		this.deuda=value;
		// TODO implement here
	}

	/**
	 * @return

	public Proveedor getProveedor() {
		
		Proveedor proveedor1 = new Proveedor();
		proveedor1.getCUIT();
		proveedor1.getResponsabilidadIva();
		proveedor1.getRazonSocial();
		proveedor1.getNombre();
		proveedor1.getDireccion();
		proveedor1.getTelefono();
		proveedor1.getEmail();
		// TODO implement here
		return proveedor1;
	}*/
	public int getProveedor(){
		return this.proveedor;
	}
	public void setProveedor(int value){
		this.proveedor=value;
	}

	/**
	 * @param value

	public void setProveedor(Proveedor value) {

		this.proveedor = value;
	}
	public void setCuitProveedor(int value){
		this.proveedor.setCUIT(value);
	}

	/**
	 * @return
	 */
	public int getNroCuenta() {
		
		return this.nroCuenta;
	}

	/**
	 * @param value
	 */
	public void setNroCuenta(int value) {
		this.nroCuenta = value;
	}

	/**
	 * @return
	 */
	public List<Documento> getDocRecibidos() {
	
		return this.docRecibidos;
	}

	/**
	 * @param value
	 */
	public void setDocRecibidos(List<Documento> value) {

		this.docRecibidos = value;
	}

	/**
	 * @return
	 */
	public List<Documento> getDocInpagos() {
		return this.docInpagos;
	}

	/**
	 * @param value
	 */
	public void setDocInpagos(List<Documento> value) {
		
		this.docInpagos = value;
	}

	/**
	 * @return

	public Boolean obtenerCuitProveedor(int value) {
		Proveedor proveedor1 = new Proveedor();
		proveedor1=getProveedor();
		if (value == proveedor1.getCUIT()) {
			return true;
		}
		// TODO implement here
		return false;
	}
*/	/**
	 * @param value 
	 * @return
	 */
	
	class Datos{
		
		Double Deuda;
		List<Documento> docrecibidos;
		List<Documento> docinpagos;
		Double pagosrealizados;
	}
	
	public Object obtenerDatosCuenta(int value) {
		Datos dato = new Datos();
		dato.Deuda=this.deuda;
		dato.docrecibidos= this.docRecibidos;
		dato.docinpagos= this.docInpagos;
		dato.pagosrealizados= this.pagosRealizados;
		return dato;
		}
	}




