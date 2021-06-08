package com.uade.model;

import java.util.*;

/**
 *
 */
public class NotaCredito extends Documento {

    /**
     * Default constructor
     */
    public NotaCredito() {
    }

    /**
     *
     */
    private float ivaDiscriminado;

    /**
     *
     */
    private Factura facturaCancelada;


    /**
     * @return
     */
    public float getIvaDiscriminado() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param value
     */
    public void setIvaDiscriminado(float value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Factura getFacturaCancelada() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setFacturaCancelada(Factura value) {
        // TODO implement here
    }

}