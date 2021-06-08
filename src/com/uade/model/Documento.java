package com.uade.model;

import com.uade.model.enumerations.TipoDocumento;

import java.time.LocalDate;
import java.util.List;

/**
 *
 */
public class Documento<ItemDeOrden> {

    /**
     * Default constructor
     */
    public Documento() {
    }

    /**
     *
     */
    private String nroDocumento;

    /**
     *
     */
    private float precioUnitario;

    /**
     *
     */
    private List<ItemDeOrden> productos;

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
    public void generarDoc() {
        // TODO implement here
    }

    /**
     * @return
     */
    public LocalDate getFechaEmision() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setFechaEmision(LocalDate value) {
        // TODO implement here
    }

    /**
     *
     */
    public void getTipoDoc() {
        // TODO implement here
    }

    /**
     * @param value
     */
    public void setTipoDoc(String value) {
        // TODO implement here
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

}