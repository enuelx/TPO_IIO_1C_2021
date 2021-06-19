import java.util.*;

import enums.FormaPago;
import enums.TipoIVA;



/**
 * 
 */
public class OrdenDePago {

	/**
	 * Default constructor
	 */
	public OrdenDePago() {
	}

	private int numero;
	private List<Documento> documentosAsociados;
	private float montoXCancelar;
	private FormaPago formaDePago;
	private Cheque cheque;
	private Proveedor proveedor;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Documento> getDocumentosAsociados() {
		return this.documentosAsociados;
	}
	
	public void setDocumentosAsociados(Documento value) {
		this.documentosAsociados.add(value);
	}

	public float getMontoXCancelar() {
		return this.montoXCancelar;
	}

	public void setMontoXCancelar(float montoXCancelar) {
		this.montoXCancelar = montoXCancelar;
	}

	public FormaPago getFormaDePago() {
		return this.formaDePago;
	}

	public void setFormaDePago(FormaPago formaDePago) {
		this.formaDePago = formaDePago;
	}

	public Cheque getCheque() {
		return this.cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}
	
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public double totalRetenciones(){
		double ganancias = this.proveedor.calcularGananciasARetener();
		TipoIVA iva = this.proveedor.getIvaARetener();
		double iibb = this.proveedor.getIngresosBrutos();
		return iibb + ganancias;
	}
}