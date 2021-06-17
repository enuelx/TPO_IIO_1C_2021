
import java.util.*;

/**
 * 
 */
public class NotaCredito extends Documento {

	/**
	 * Default constructor
	 */
	public NotaCredito() {
	}

	/**
	 * 
	 */
	private float ivaDiscriminado;

	/**
	 * 
	 */
	private Factura facturaCancelada;




	/**
	 * @return
	 */
	public float getIvaDiscriminado() {
		
		return this.ivaDiscriminado;
	}

	/**
	 * @param value
	 */
	public void setIvaDiscriminado(float value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Factura getFacturaCancelada() {
		
		return this.facturaCancelada;
	}

	/**
	 * @param value
	 */
	public void setFacturaCancelada(Factura value) {
		this.facturaCancelada = value;
	}

}