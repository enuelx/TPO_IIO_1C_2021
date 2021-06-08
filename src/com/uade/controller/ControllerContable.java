package com.uade.controller;

import com.uade.model.CuentaCorriente;
import com.uade.model.Factura;
import com.uade.model.OrdenDeCompra;
import com.uade.model.OrdenDePago;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class ControllerContable {

    /**
     * Default constructor
     */
    public ControllerContable() {
    }

    /**
     * 
     */
    public void calcularGanancia() {
        // TODO implement here
    }

    /**
     * @param dia 
     * @return
     */
    public List <Factura> facturasPorDia(LocalDate dia) {
        // TODO implement here
        return null;
    }

    /**
     * @param cuit 
     * @return
     */
    public List <Factura> facturasPorProveedor(int cuit) {
        // TODO implement here
        return null;
    }

    /**
     * @param cuit 
     * @return
     */
    public CuentaCorriente reporteDeCuenta(int cuit) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List <OrdenDePago> ordenesPagoEmitidas() {
        // TODO implement here
        return null;
    }

    /**
     * @param cuit 
     * @return
     */
    public Double totalDeudaPorProveedor(int cuit) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Double totalImpuestosRetenidos() {
        // TODO implement here
        return null;
    }

    /**
     * @param nroOrdenCompra 
     * @return
     */
    public List <String> consultaLibroIva(int nroOrdenCompra) {
        // TODO implement here
        return null;
    }

}