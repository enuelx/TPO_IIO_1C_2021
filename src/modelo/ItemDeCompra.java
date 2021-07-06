package modelo;
import java.util.*;
import enums.TipoIVA;

/**
 * 
 */
public class ItemDeCompra {

	/**
	 * Default constructor
	 */
	public ItemDeCompra() {
	}

	/**
	 * 
	 */
	private ProveedorProductoServicio item;

	/**
	 * 
	 */
	private int cantidad;

	/**
	 * 
	 */
	private float precioAcordado;

	/**
	 * 
	 */
	private TipoIVA iva;

	/**
	 * @return
	 */
	public ProveedorProductoServicio getItem() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setItem(ProveedorProductoServicio value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public int getCantidad() {
		// TODO implement here
		return 0;
	}

	/**
	 * @param value
	 */
	public void setCantidad(int value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public float getPrecioAcordado() {
		// TODO implement here
		return 0.0f;
	}

	/**
	 * @param value
	 */
	public void setPrecioAcordado(float value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public TipoIVA getIva() {
		TipoIVA.valueOf("DOSCINCO");
		TipoIVA.valueOf("CINCO");
		TipoIVA.valueOf("DIEZCINCO");
		TipoIVA.valueOf("VEINTIUNO");
		TipoIVA.valueOf("VEINTISIETE");
		return this.getIva();
	}

	/**
	 * @param value
	 */
	public TipoIVA setIva(TipoIVA value) {
		return this.iva = value;
	}

	public static int size() {
		ItemDeCompra.size();
		return ItemDeCompra.size();
	}

}