import java.time.LocalDate;
import java.util.*;
import enums.TipoDocumento;
import enums.EspecieDocumento;

/**
 * 
 */
public class Documento {

	/**
	 * Default constructor
	 */
	public Documento() {
	}

	/**
	 * 
	 */
	private String codDocumento;

	/**
	 * 
	 */
	private float precioUnitario;

	/**
	 * 
	 */
	private List<ItemDeCompra> productos;

	/**
	 * 
	 */
	private Proveedor proveedor;

	/**
	 * 
	 */
	private TipoDocumento tipoDoc;

	/**
	 * 
	 */
	private Boolean pagado;

	/**
	 * 
	 */
	private Double monto;

	/**
	 * 
	 */
	private LocalDate fechaEmision;

	/**
	 * 
	 */
	private Boolean activo;

	/**
	 * 
	 */
	private EspecieDocumento especie;

	/**
	 * 
	 */
	private LibroIVA libroIVA;




	/**
	 * 
	 */
	public void generarDoc() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public LocalDate getFechaEmision() {
		
		return this.fechaEmision;
	}

	/**
	 * @param value
	 */
	public void setFechaEmision(LocalDate value) {
		this.fechaEmision = value;
	}

	/**
	 * 
	 */
	public TipoDocumento getTipoDoc() {
		return this.tipoDoc;
	}

	/**
	 * @param value
	 */
	public void setTipoDoc(TipoDocumento value) {

		this.tipoDoc = value;
	}

	/**
	 * @return
	 */
	public Factura getFactura() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setFactura(Factura value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Boolean documentoActivo() {
		// TODO implement here
		return this.documentoActivo();
	}

	/**
	 * @return
	 */
	public String getCodDocumento() {
		// TODO implement here
		return "";
	}

	/**
	 * @param value
	 */
	public void setCodDocumento(String value) {
		// TODO implement here
	}

	/**
	 * @param TipoIva 
	 * @return
	 */
	public Float TotalDeIva(int TipoIva) {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public LibroIVA getLibroIVA() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setLibroIVA(LibroIVA value) {
		// TODO implement here
	}
	
	public void setActivo(boolean value) {
		this.activo=value;
	}
	
	public boolean getActivo() {
		return this.activo;
	}
	
	public void setProveedor(Proveedor value) {
		this.proveedor = value;
	}
	
	public Proveedor getProveedor() {
		return this.proveedor;
	}
	
	public int getProveedorCuit() {
		return this.proveedor.getCUIT();
	}
	
}