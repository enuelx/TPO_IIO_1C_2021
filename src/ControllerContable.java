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
	
	private Set<OrdenDePago> ordenesDePago = new TreeSet <OrdenDePago>();
	
	
	
	public void calcularGanancia() {
		// TODO implement here
	}

	/**
	 * @param dia 
	 * @return
	 */
	
	public ArrayList<Factura> facturasPorDia(LocalDate dia) {
		Factura factu = new Factura();
		ArrayList<Factura> lfactu= new ArrayList<Factura>();
		int indice=0;
		//falta definir lista de facturas
		//while  (indice<=lfactu.size()){ 
		while (indice==10) {
			factu.getFechaEmision();
			indice++;
			if (dia == factu.getFechaEmision()){
				if (factu.getActivo()==true) {
					lfactu.add(factu);
				}
			}
		}
		return lfactu;
	}

	/**
	 * @param cuit 
	 * @return
	 */
	public List <Factura> facturasPorProveedor(int cuit) {
		Factura factur = new Factura();
		ArrayList<Factura> lfactur= new ArrayList<Factura>();
		int indice=0; //falta definir 
		while (indice==10) {
			indice++;
			if (cuit == factur.obtenerProveedorCuit()) {
				if (factur.getActivo()==true) {
					lfactur.add(factur);
				}
			}
		}
		return lfactur;
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
		
		this.ordenesDePago.add(value);
		
	}
	
	
	
	
	/**
	 * 
	 */
	public Set<OrdenDePago> getOrdenesDePago() {
		return this.ordenesDePago;
		// TODO implement here
	}

}