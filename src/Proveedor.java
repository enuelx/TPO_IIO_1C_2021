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
	 * 
	 */
	public Set<Factura> Posee;






	/**
	 * @return
	 */
	public int getCUIT() {
		// TODO implement here
		return this.CUIT;
	}

	/**
	 * @param value
	 */
	public void setCUIT(int value) {
		this.CUIT=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getResponsabilidadIva() {
		// TODO implement here
		return this.responsabilidadIva;
	}

	/**
	 * @param value
	 */
	public void setResponsabilidadIva(String value) {
		this.responsabilidadIva=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getRazonSocial() {
		// TODO implement here
		return this.razonSocial;
	}

	/**
	 * @param value
	 */
	public void setRazonSocial(String value) {
		this.razonSocial=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getNombre() {
		// TODO implement here
		return this.nombre;
	}

	/**
	 * @param value
	 */
	public void setNombre(String value) {
		this.nombre=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getDireccion() {
		// TODO implement here
		return this.direccion;
	}

	/**
	 * @param value
	 */
	public void setDireccion(String value) {
		this.direccion=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public int getTelefono() {
		// TODO implement here
		return this.telefono;
	}

	/**
	 * @param value
	 */
	public void setTelefono(int value) {
		this.telefono=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public String getEmail() {
		// TODO implement here
		return this.email;
	}

	/**
	 * @param value
	 */
	public void setEmail(String value) {
		this.email=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public double getIngresosBrutos() {
		// TODO implement here
		return this.ingresosBrutos;
	}

	/**
	 * @param value
	 */
	public void setIngresosBrutos(double value) {
		this.ingresosBrutos=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public LocalDate getInicioActividades() {
		// TODO implement here
		return this.inicioActividades;
	}

	/**
	 * @param value
	 */
	public void setInicioActividades(LocalDate value) {
		this.inicioActividades=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<Rubro> getRubros() {
		// TODO implement here
		return this.rubros;
	}

	/**
	 * @param value
	 */
	public void setRubros(List<Rubro> value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<ProductoYServicio> getProductosServicios() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setProductosServicios(List<ProductoYServicio> value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<CertificadoNoRetencion> getCertificado() {
		// TODO implement here
		return this.certificado;
	}

	/**
	 * @param value
	 */
	public void setCertificado(List<CertificadoNoRetencion> value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public CuentaCorriente getCuentaCorriente() {
		// TODO implement here
		return this.cuentaCorriente;
	}

	/**
	 * @param value
	 */
	public void setCuentaCorriente(CuentaCorriente value) {
		this.cuentaCorriente=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Double getTopeDeuda() {
		// TODO implement here
		return this.topeDeuda;
	}

	/**
	 * @param value
	 */
	public void setTopeDeuda(Double value) {
		this.topeDeuda=value;
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Boolean certificadoValido() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public Double calcularGananciasARetener() {
		// TODO implement here
		return null;
	}

}