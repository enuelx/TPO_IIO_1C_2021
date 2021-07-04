import java.time.LocalDate;
import java.util.*;

import enums.TipoIVA;


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
		Factura fact = new Factura();
		LibroIVA libro = new LibroIVA();
		Proveedor prov = new Proveedor();
		ItemDeCompra item = new ItemDeCompra();
		int LocalDate;
		List <String> lista = new ArrayList<String>();
		for (int i = 0; i < Factura.size(); i++) {
			fact.getCodDocumento();
			if (fact.getCodDocumento()== codDocumento) {
				fact.getLibroIVA();
				fact.getCuitProveedorCompra();
				libro.setCuit(i); //va un i o que va adentro??
				prov.getNombre();
				libro.setNombreProveedor(prov.getNombre());
				libro.setFecha(null); //se que no va un null, no se que poner adentro para que detecte fecha
				fact.documentoActivo();
				libro.setEspecieDocumento(null);
				fact.TotalDeIva(i);
				if (TipoIVA.DOSCINCO==item.getIva()) {
					for (int j = 0; j < ItemDeCompra.size(); j++) {
						item.getIva();
						item.getCantidad();
						item.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.DOSCINCO);
					}
				}
				if (TipoIVA.CINCO==item.getIva()) {
					for (int j = 0; j < ItemDeCompra.size(); j++) {
						item.getIva();
						item.getCantidad();
						item.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.CINCO);
				}
				}
				if (TipoIVA.DIEZCINCO==item.getIva()) {
					for (int j = 0; j < ItemDeCompra.size(); j++) {
						item.getIva();
						item.getCantidad();
						item.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.DIEZCINCO);
				}
				}
				if (TipoIVA.VEINTIUNO==item.getIva()) {
					for (int j = 0; j < ItemDeCompra.size(); j++) {
						item.getIva();
						item.getCantidad();
						item.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.VEINTIUNO);
				}
				}
				if (TipoIVA.VEINTISIETE==item.getIva()) {
					for (int j = 0; j < ItemDeCompra.size(); j++) {
						item.getIva();
						item.getCantidad();
						item.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.VEINTISIETE);
				}
				}
			}
		}
		return lista;
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
