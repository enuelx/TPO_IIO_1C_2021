package modelo;

import enums.EspecieDocumento;
import enums.TipoIVA;

import java.time.LocalDate;
import java.util.List;

/**
 * 
 */
public class LibroIVA {

	/**
	 * Default constructor
	 */
	public LibroIVA() {
	}

	/**
	 * 
	 */
	private int cuit;

	/**
	 * 
	 */
	private String nombreProveedor;

	/**
	 * 
	 */
	private LocalDate fecha;

	/**
	 * 
	 */
	private List<TipoIVA> tiposDeIva;

	/**
	 * 
	 */
	private List<Float> totalesIva;

	/**
	 * 
	 */
	private EspecieDocumento especieDocumento;


	/**
	 * @return
	 */
	public int getCuit() {
		// TODO implement here
		return this.cuit;
	}

	/**
	 * @param value
	 */
	public void setCuit(int value) {
		// TODO implement here
		this.cuit=value;
	}

	/**
	 * @return
	 */
	public String getNombreProveedor() {
		// TODO implement here
		return this.nombreProveedor;
	}

	/**
	 * @param value
	 */
	public void setNombreProveedor(String value) {
		// TODO implement here
		this.nombreProveedor=value;
	}

	/**
	 * @return
	 */
	public LocalDate getFecha() {
		// TODO implement here
		return this.fecha;
	}

	/**
	 * @param value
	 */
	public void setFecha(LocalDate value) {
		// TODO implement here
		this.fecha=value;
	}

	/**
	 * @return
	 */
	public List<TipoIVA> getTiposDeIva() {
		// TODO implement here
		return this.tiposDeIva;
	}

	/**
	 * @param value
	 */
	public void setTiposDeIva(TipoIVA value) {
		// TODO implement here
		this.tiposDeIva.add(value);
	}

	/**
	 * @return
	 */
	public List<Float> getTotalesIva() {
		// TODO implement here
		return this.totalesIva;
	}

	/**
	 * @param value
	 */
	public void setTotalesIva(Float value) {
		// TODO implement here
		this.totalesIva.add(value);
	}

	/**
	 * @return
	 */
	public EspecieDocumento getEspecieDocumento() {
		// TODO implement here
		return this.especieDocumento;
	}

	/**
	 * @param value
	 */
	public void setEspecieDocumento(EspecieDocumento value) {
		// TODO implement here
		this.especieDocumento=value;
	}

}