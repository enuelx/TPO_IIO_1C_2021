import java.util.*;

import enums.FormaPago;



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
	private Proveedor provedor;
	
	
	
	
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
		// SE TIENE QUE DESARROLLAR;
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
	
	
	
	
	public Proveedor getProvedor() {
		return this.provedor;
	}
	
	
	
	public void setProvedor(Proveedor provedor) {
		this.provedor = provedor;
	}
	
	
	
	
	
}