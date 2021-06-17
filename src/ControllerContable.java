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

	//Parametros
	
	private ArrayList<OrdenDePago> ordenesDePago = new ArrayList <OrdenDePago>() ;
	

	
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
		CuentaCorriente cuenta = new CuentaCorriente();
		if (cuenta.obtenerCuitProveedor(cuit) == true) {
			System.out.println("Deuda del Proveedor: ");
			System.out.println(cuenta.getDeuda());
			System.out.println("Documentos Recibidos: ");
			System.out.println(cuenta.getDocRecibidos());
			System.out.println("Documentos Impagos: ");
			System.out.println(cuenta.getDocInpagos());
			System.out.println("Documentos Recibidos: ");
			System.out.println(cuenta.getPagosRealizados());
		}
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
	 * @return
	 */
	public List<CuentaCorriente> totalDeudaPorProveedor() {
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
	 * @param codDocumento  
	 * @return
	 */
	public List <String> consultaLibroIva(String codDocumento ) {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	
	
	
public void setOrdenesDePago(OrdenDePago value) {
		
		if (ordenNueva(value, this.ordenesDePago)) {
			this.ordenesDePago.add(value);
		}
		else {
			System.out.println("Esta Orden ya existe");
		}
		
		
	}
	


	public Boolean ordenNueva(OrdenDePago orden, ArrayList<OrdenDePago> listaOrden) {
		
		Iterator iter1 = listaOrden.iterator();
		OrdenDePago aux; 
		
		while (iter1.hasNext()) {
			
			aux = (OrdenDePago) iter1.next();
			if (orden.getNumero() == aux.getNumero()) {
				return false;
			}
		}
		return true;
			
		}
	
	
	/**
	 * 
	 */
	public List<OrdenDePago> getOrdenesDePago() {
		return this.ordenesDePago;
		// TODO implement here
	}

}