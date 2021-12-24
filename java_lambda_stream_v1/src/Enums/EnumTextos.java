package Enums;

public enum EnumTextos {

    NO_EXISTE_ATGBOLEF("No Existe en ATGBOLEF"),
    NO_EXISTE_VENTA("No existen venta: Loc."),
    NO_ESTA_ENCENDIDO_APT_OMS("No esta encendido APT-OMS"),
    DATOS_VENDEDOR_INCORRECTOS("Datos del vendedor incorrectos, reintente"),
    TIPO_TRX_INVALIDA("Tipo de trx invalida, reintente"),
    GENERAR_COD_AUTH_MANUAL("Generar cod. de autorizacion manual.4");

    private final String glosa;

    EnumTextos(String glosa) {
        this.glosa = glosa;
    }

    public String getGlosa() {
        return glosa;
    }


}
