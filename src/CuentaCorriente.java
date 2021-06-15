import java.util.*;
/**
 * 
 */
public class CuentaCorriente {
	
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
		// TODO implement here
	}

	/**
	 * @return
	 */
	public int getNroCuenta() {
		// TODO implement here
		return 0;
	}

	/**
	 * @param value
	 */
	public void setNroCuenta(int value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<String> getDocRecibidos() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setDocRecibidos(List<String> value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<String> getDocInpagos() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setDocInpagos(List<String> value) {
		// TODO implement here
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




