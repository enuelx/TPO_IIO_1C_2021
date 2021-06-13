import enums.TipoRetencion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo!");
        CertificadoNoRetencion cnr01 = new CertificadoNoRetencion();
        cnr01.setIdCertificado(111);

        cnr01.setTipoImpuesto(TipoRetencion.IIBB);
        System.out.println(cnr01.calcularPorcentaje());
    }
}
