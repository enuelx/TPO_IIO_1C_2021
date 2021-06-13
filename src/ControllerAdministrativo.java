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
	public void compulsaDePrecios(String codigoItem) {
		// TODO implement here
	}

}