package modelo;
import java.util.*;
import enums.TipoIVA;
import modelo.Proveedor;
/**
 * 
 */
public class ProductoYServicio extends Persistente{

	/**
	 * Default constructor
	 *
	public ProductoYServicio() {
	}*/


	/**
	 * 
	 */
	private String codigoItem;

	/**
	 * 
	 */
	private Rubro rubros;

	/**
	 * 
	 */
	public List<Proveedor> proveedores;

	/**
	 * 
	 */
	private int tipoUnidad;

	/**
	 * 
	 */
	private float precioUnidad;

	/**
	 * 
	 */
	private TipoIVA iva;

	/**
	 * 
	 */
	public List <ProveedorProductoServicio> productosYServiciosProveedor;


	public ProductoYServicio(String codigoItem, Float precioUnidad) {
		this.precioUnidad=precioUnidad;
		this.codigoItem=codigoItem;
		/*
		this.setCodigoItem(codigoItem);
		this.setPrecioUnidad(precioUnidad);*/
	}
	public String toString(){
		return this.codigoItem;
	}
	/**
	 * @return
	 */
	public String getCodigoItem() {
		// TODO implement here
		return "";
	}

	/**
	 * @param value
	 */
	public void setCodigoItem(String value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List<Proveedor> getProveedores() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setProveedores(List<Proveedor> value) {
		// TODO implement here
	}


	/**
	 * @return
	 */
	public int getTipoUnidad() {
		// TODO implement here
		return this.tipoUnidad;
	}

	/**
	 * @param value
	 */
	public void setTipoUnidad(int value) {
		// TODO implement here
		this.tipoUnidad=value;
	}

	/**
	 * @return
	 */
	public float getPrecioUnidad() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param value
	 */
	public void setPrecioUnidad(float value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Rubro getRubros() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setRubros(Rubro value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public TipoIVA getIva() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setIva(TipoIVA value) {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void listaDePrecios() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public List <ProveedorProductoServicio> getProductosYServiciosProveedor() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setProductosYServiciosProveedor(List <ProveedorProductoServicio> value) {
		// TODO implement here
	}

}