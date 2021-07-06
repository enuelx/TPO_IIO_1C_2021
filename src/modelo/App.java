package modelo;
import enums.TipoRetencion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo!");
        CertificadoNoRetencion cnr01 = new CertificadoNoRetencion();
        cnr01.setIdCertificado(111);
        cnr01.setTipoImpuesto(TipoRetencion.IIBB);
        System.out.println(cnr01.calcularPorcentaje());
        Proveedor p1 = new Proveedor();
        p1.setCUIT(123);
        System.out.println(p1.getRubros());
        System.out.println(p1.getCUIT());
        ControllerContable usuario = new ControllerContable();
        usuario.reporteDeCuenta(0);
        usuario.totalDeudaPorProveedor();
    }
}
