package com.uade.model;

import com.uade.model.enumerations.TipoIVA;

import java.util.*;

/**
 *
 */
public class ProductoYServicio {

    /**
     * Default constructor
     */
    public ProductoYServicio() {
    }

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
    public List<ProveedorProductoServicio> productosYServiciosProveedor;


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
    public int getTipoUnidad() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setTipoUnidad(int value) {
        // TODO implement here
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

}