import java.time.LocalDate;
import java.util.*;

import enums.EspecieDocumento;
import enums.TipoIVA;

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
		return 0;
	}

	/**
	 * @param value
	 */
	public void setCuit(int value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getNombreProveedor() {
		// TODO implement here
		return "";
	}

	/**
	 * @param value
	 */
	public void setNombreProveedor(String value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public LocalDate getFecha() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setFecha(LocalDate value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<TipoIVA> getTiposDeIva() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setTiposDeIva(List<TipoIVA> value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<Float> getTotalesIva() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setTotalesIva(List<Float> value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public EspecieDocumento getEspecieDocumento() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setEspecieDocumento(EspecieDocumento value) {
		// TODO implement here
	}

}