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
		CuentaCorriente cuen = new CuentaCorriente();
		ArrayList<CuentaCorriente> lcuen= new ArrayList<CuentaCorriente>();
		for(int i=0; i<10; i++) {
			cuen.getProveedor().getCUIT();
			cuen.getDeuda();
			lcuen.add(cuen);
		
		}
		System.out.println(lcuen);
		return lcuen;
	}

	/**
	 * @return
	 */
	public Double totalImpuestosRetenidos() {
		List<Double> dR = new ArrayList<Double>();
		for (int i = 0; i < ordenesDePago.size(); i++) {
			dR.add(ordenesDePago.get(i).totalRetenciones());
		}
		double sumaTotal = 0.0;
		for (int i = 0; i < dR.size(); i++) {
			sumaTotal+=dR.get(i);
		}
		return sumaTotal;
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
