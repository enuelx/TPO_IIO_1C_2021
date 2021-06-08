package com.uade.model;

import java.util.*;

/**
 *
 */
public class CuentaCorriente {

    /**
     * Default constructor
     */
    public CuentaCorriente() {
    }

    /**
     *
     */
    private int nroCuenta;

    /**
     *
     */
    private Proveedor proveedor;

    /**
     *
     */
    private float deuda;

    /**
     *
     */
    private List<Documento> docRecibidos;

    /**
     *
     */
    private List<Documento> docInpagos;

    /**
     *
     */
    private Double pagosRealizados;


    /**
     * @return
     */
    public Double getPagosRealizados() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setPagosRealizados(Double value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public float getDeuda() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param value
     */
    public void setDeuda(float value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Proveedor getProveedor() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setProveedor(Proveedor value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getNroCuenta() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setNroCuenta(int value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<String> getDocRecibidos() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setDocRecibidos(List<String> value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<String> getDocInpagos() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setDocInpagos(List<String> value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Boolean obtenerCuitProveedor() {
        // TODO implement here
        return null;
    }

    /**
     * @param nroCuenta
     * @return
     */
    public void obtenerDatosCuenta(int nroCuenta) {
        // TODO implement here
        // Corregir el return en el diagrama y acá
    }

}