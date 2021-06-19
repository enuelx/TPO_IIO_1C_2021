import enums.TipoIVA;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Proveedor {

	/**
	 * Default constructor
	 */
	public Proveedor() {
	}

	/**
	 * 
	 */
	private int CUIT;

	/**
	 * 
	 */
	private String responsabilidadIva;

	/**
	 * 
	 */
	private String razonSocial;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private String direccion;

	/**
	 * 
	 */
	private int telefono;

	/**
	 * 
	 */
	private String email;

	/**
	 * 
	 */
	private double ingresosBrutos;

	/**
	 * 
	 */
	private LocalDate inicioActividades;

	/**
	 * 
	 */
	private List<Rubro> rubros;

	/**
	 * 
	 */
	private List<ProveedorProductoServicio> productosServicios;

	/**
	 * 
	 */
	private List<CertificadoNoRetencion> certificado;

	/**
	 * 
	 */
	private CuentaCorriente cuentaCorriente;

	/**
	 * 
	 */
	private Double topeDeuda;

	/**
	 * 
	 */
	private List<Factura> facturasExcepcionales;

	/**
	 * 
	 */
	private TipoIVA ivaARetener;

	/**
	 * 
	 */
	private Double gananciasARetener;


	/**
	 * @return
	 */
	public int getCUIT() {
		return this.CUIT;
	}

	/**
	 * @param value
	 */
	public void setCUIT(int value) {
		this.CUIT=value;
	}

	/**
	 * @return
	 */
	public String getResponsabilidadIva() {
		return this.responsabilidadIva;
	}

	/**
	 * @param value
	 */
	public void setResponsabilidadIva(String value) {
		this.responsabilidadIva=value;
	}

	/**
	 * @return
	 */
	public String getRazonSocial() {
		return this.razonSocial;
	}

	/**
	 * @param value
	 */
	public void setRazonSocial(String value) {
		this.razonSocial=value;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param value
	 */
	public void setNombre(String value) {
		this.nombre=value;
	}

	/**
	 * @return
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * @param value
	 */
	public void setDireccion(String value) {
		this.direccion=value;
	}

	/**
	 * @return
	 */
	public int getTelefono() {
		return this.telefono;
	}

	/**
	 * @param value
	 */
	public void setTelefono(int value) {
		this.telefono=value;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param value
	 */
	public void setEmail(String value) {
		this.email=value;
	}

	/**
	 * @return
	 */
	public double getIngresosBrutos() {
		return this.ingresosBrutos;
	}

	/**
	 * @param value
	 */
	public void setIngresosBrutos(double value) {
		this.ingresosBrutos=value;
	}

	/**
	 * @return
	 */
	public LocalDate getInicioActividades() {
		return this.inicioActividades;
	}

	/**
	 * @param value
	 */
	public void setInicioActividades(LocalDate value) {
		this.inicioActividades=value;
	}

	/**
	 * @return
	 */
	public List<Rubro> getRubros() {
		return this.rubros;
	}

	/**
	 * @param value
	 */
	public void setRubros(List<Rubro> value) {
	}

	/**
	 * @return
	 */
	public List<ProductoYServicio> getProductosServicios() {
		return null;
	}

	/**
	 * @param value
	 */
	public void setProductosServicios(List<ProductoYServicio> value) {
	}

	/**
	 * @return
	 */
	public List<CertificadoNoRetencion> getCertificado() {
		return this.certificado;
	}

	/**
	 * @param value
	 */
	public void setCertificado(List<CertificadoNoRetencion> value) {
	}

	/**
	 * @return
	 */
	public CuentaCorriente getCuentaCorriente() {
		return this.cuentaCorriente;
	}

	/**
	 * @param value
	 */
	public void setCuentaCorriente(CuentaCorriente value) {
		this.cuentaCorriente=value;
	}

	/**
	 * @return
	 */
	public Double getTopeDeuda() {
		return this.topeDeuda;
	}

	/**
	 * @param value
	 */
	public void setTopeDeuda(Double value) {
		this.topeDeuda=value;
	}

	/**
	 * @return
	 */
	public TipoIVA getIvaARetener() {
		return this.ivaARetener;
	}

	/**
	 * @param value
	 */
	public void setIvaARetener(TipoIVA value) {
		this.ivaARetener = value;
	}

	/**
	 * @return
	 */
	public Boolean certificadoValido() {
		return null;
	}

	/**
	 * @return
	 */
	public Double calcularGananciasARetener() {
		return 0.0;
	}

}