package modelo;

public class PPItem {
    private String codigoItem;
    private Float precioUnidad;

    public PPItem(String codigoItem, Float precioUnidad) {
        this.precioUnidad=precioUnidad;
        this.codigoItem=codigoItem;
		/*
		this.setCodigoItem(codigoItem);
		this.setPrecioUnidad(precioUnidad);*/
    }
    public String toString(){
        return this.codigoItem;
    }
}
