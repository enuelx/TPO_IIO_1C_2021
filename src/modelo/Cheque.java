package modelo;

import java.time.LocalDate;

/**
 * 
 */
public class Cheque {

	/**
	 * Default constructor
	 */
	public Cheque() {
	}

	/**
	 * 
	 */
	private int numero;

	/**
	 * 
	 */
	private LocalDate fechaEmision;

	/**
	 * 
	 */
	private LocalDate fechaVencimiento;

	/**
	 * 
	 */
	private String firmante;

	/**
	 * 
	 */
	private float importe;

	/**
	 * 
	 */
	private Boolean esPropio;



	/**
	 * @return
	 */
	public int getNumero() {
		
		return this.numero;
	}

	/**
	 * @param value
	 */
	public void setNumero(int value) {
		this.numero = value;
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
	 * @return
	 */
	public LocalDate getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	/**
	 * @param value
	 */
	public void setFechaVencimiento(LocalDate value) {
		this.fechaVencimiento = value;
	}

	/**
	 * @return
	 */
	public String getFirmante() {
		
		return this.firmante;
	}

	/**
	 * @param value
	 */
	public void setFirmante(String value) {
		this.firmante = value;
		
	}

	/**
	 * @return
	 */
	public float getImporte() {
		
		return this.importe;
	}

	/**
	 * @param value
	 */
	public void setImporte(float value) {

		this.importe = value;
	}

	/**
	 * @return
	 */
	public Boolean getEsPropio() {
		
		return this.esPropio;
	}

	/**
	 * @param value
	 */
	public void setEsPropio(Boolean value) {
		this.esPropio = value;
	}

}