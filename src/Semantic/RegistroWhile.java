package Semantic;

public class RegistroWhile extends RegistroSemantico{
    String etiquetaInicio;
    String etiquetaSalida;

    public RegistroWhile() {

    }

    public RegistroWhile(String pEtiquetaInicio, String pEtiquetaSalida) {
        this.etiquetaInicio = pEtiquetaInicio;
        this.etiquetaSalida = pEtiquetaSalida;
    }

    public void setEtiquetaInicio(String pEtiquetaInicio) {
        this.etiquetaInicio = pEtiquetaInicio;
    }

    public void setEtiquetaSalida(String pEtiquetaSalida) {
        this.etiquetaSalida = pEtiquetaSalida;
    }

    public String getEtiquetaSalida() {
        return etiquetaSalida;
    }

    public String getEtiquetaInicio() {
        return etiquetaInicio;
    }

}
