import java.time.LocalDate;
import java.util.*;

public class CertificadoNoRetencion<TipoRetencion> {

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
		// TODO implement here
		return 0;
	}

	/**
	 * @param value
	 */
	public void setIdCertificado(int value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public LocalDate getFechaInicio() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setFechaInicio(LocalDate value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public LocalDate getFechaFin() {
		// TODO implement here
		return null;
	}

	/**
	 * @param value
	 */
	public void setFechaFin(LocalDate value) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public TipoRetencion getTipoImpuesto() {
		// TODO implement here
		return null;
	}

	/**
	 * @param <TipoRetencion>
	 * @param value
	 */
	public <TipoRetencion> void setTipoImpuesto (TipoRetencion value) {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void calcularPorcentaje() {
		// TODO implement here
	}

}