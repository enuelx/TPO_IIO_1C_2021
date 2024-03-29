package enums;

/**
 * 
 */
public enum TipoIVA {
    // solo para inicializar
    INIT,
    // valores para usar
    DOSCINCO,
    CINCO,
    DIEZCINCO,
    VEINTIUNO,
    VEINTISIETE;

    public double getIva (TipoIVA iva) {
        switch (iva) {
            case DOSCINCO:
                return 2.5;
            case CINCO:
                return 5.0;
            case DIEZCINCO:
                return 10.5;
            case VEINTIUNO:
                return 21.0;
            case VEINTISIETE:
                return 27.0;
            case INIT:
                return 0.0;
        }
        return 0.0;
    }
}
