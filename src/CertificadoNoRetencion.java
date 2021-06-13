import java.time.LocalDate;
import enums.TipoRetencion;
import java.util.*;

public class CertificadoNoRetencion {

	/**
	 * Default constructor
	 */
	public CertificadoNoRetencion() {
	}

	/**
	 * 
	 */
	private int idCertificado;

	/**
	 * 
	 */
	private LocalDate fechaInicio;

	/**
	 * 
	 */
	private LocalDate fechaFin;

	/**
	 * 
	 */
	private TipoRetencion tipoImpuesto;


	/**
	 * @return
	 */
	public int getIdCertificado() {
		return this.idCertificado;
	}

	/**
	 * @param value
	 */
	public void setIdCertificado(int value) {
		this.idCertificado = value;
	}

	/**
	 * @return
	 */
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * @param value
	 */
	public void setFechaInicio(LocalDate value) {
		this.fechaInicio = value;
	}

	/**
	 * @return
	 */
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * @param value
	 */
	public void setFechaFin(LocalDate value) {
		this.fechaFin = value;
	}

	/**
	 * @return
	 */
	public TipoRetencion getTipoImpuesto() {
		return this.tipoImpuesto;
	}

	/**
	 * @param value
	 */
	public void setTipoImpuesto (TipoRetencion value) {
		this.tipoImpuesto = value;
	}

	/**
	 * 
	 */
	public double calcularPorcentaje() {
		return 0.0;
	}

}