package Semantic;

public class RegistroConstante extends RegistroSemantico{

    private String tipo;

    public RegistroConstante() {
        super();
    }

    public RegistroConstante(String pToken) {
        super(pToken);
    }

    public RegistroConstante(String pToken, String pTipo) {
        super(pToken);
        this.tipo = pTipo;
    }

    @Override
    public String toString() {
        return "Registro de constante: " + this.getToken() + " Tipo: " + this.tipo;
    }
}
