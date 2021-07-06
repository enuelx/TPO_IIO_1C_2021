package modelo;

import java.util.*;
/**
 * 
 */
public class CuentaCorriente extends Persistente{
	
	/**
	 * Default constructor
	 */
	public CuentaCorriente() {
	}

	/**
	 * 
	 */
	private int nroCuenta;

	/**
	 * 
	 */
	private Proveedor proveedor;

	/**
	 * 
	 */
	private float deuda;

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
	public void setPagosRealizados(Double value) {
		this.pagosRealizados=value;
		
		// TODO implement here
	}

	/**
	 * @return
	 */
	public float getDeuda() {
		// TODO implement here
		return this.deuda;
	}

	/**
	 * @param value
	 */
	public void setDeuda(float value) {
		this.deuda=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
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
	}

	/**
	 * @param value
	 */
	public void setProveedor(Proveedor value) {

		this.proveedor = value;
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
	 */
	public Boolean obtenerCuitProveedor(int value) {
		Proveedor proveedor1 = new Proveedor();
		proveedor1=getProveedor();
		if (value == proveedor1.getCUIT()) {
			return true;
		}
		// TODO implement here
		return false;
	}
	
	/**
	 * @param value 
	 * @return
	 */
	
	class Datos{
		
		Float Deuda;
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




