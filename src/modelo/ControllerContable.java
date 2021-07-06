package modelo;

import enums.TipoIVA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
	
	private ArrayList<Factura> facturas = new ArrayList <Factura>() ; //agregar repositorio
	
	

	
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
		int i = 0;
		while (facturas.size()!=i) {
			factu.getFechaEmision();
			i++;
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
		int i = 0;
		while (facturas.size()!=i) {
			i++;
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
	public LibroIVA consultaLibroIva(String codDocumento ) {
		//facturas.clear();
		Factura fact = new Factura();
		LibroIVA libro = new LibroIVA();
		Proveedor prov = new Proveedor();
		List<ItemDeCompra> item = fact.getProductos();
		LocalDate ld = LocalDate.now();
		List <String> lista = new ArrayList<String>();
		int i = 0;
		while (facturas.size()!=i) {
			fact.getCodDocumento();
			i++;
			if (facturas.get(i).getCodDocumento().equals(codDocumento)){
				fact=facturas.get(i);
				fact.getLibroIVA();
				fact.getCuitProveedorCompra();
				libro.setCuit(fact.getProveedorCuit());
				prov.getNombre();
				libro.setNombreProveedor(prov.getNombre());
				libro.setFecha(ld); 
				fact.documentoActivo();
				libro.setEspecieDocumento(fact.getEspecieDocumento());
				fact.TotalDeIva(i);
				for (int k =0; k < item.size(); k++) {
					ItemDeCompra producto = item.get(k);
					if (TipoIVA.DOSCINCO==producto.getIva()) {
						producto.getIva();
						producto.getCantidad();
						producto.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.DOSCINCO);
					}
					if (TipoIVA.CINCO==producto.getIva()) {
						producto.getIva();
						producto.getCantidad();
						producto.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.CINCO);
					}
					if (TipoIVA.DIEZCINCO==producto.getIva()) {
						producto.getIva();
						producto.getCantidad();
						producto.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.DIEZCINCO);
					}
					if (TipoIVA.VEINTIUNO==producto.getIva()) {
						producto.getIva();
						producto.getCantidad();
						producto.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.VEINTIUNO);
					}
					if (TipoIVA.VEINTISIETE==producto.getIva()) {
						producto.getIva();
						producto.getCantidad();
						//libro.setCantidad(); //faltan sets y en clase
						producto.getPrecioAcordado();
						libro.setTiposDeIva(TipoIVA.VEINTISIETE);
					}
				}//set tipos de iva en lista??
			}
		}//totales ???
		return libro;
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
