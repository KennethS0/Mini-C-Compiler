package Semantic;

public class RegistroOperador extends RegistroSemantico {

    public RegistroOperador() {
        super();
    }

    public RegistroOperador(String pToken) {
        super(pToken);
    }

    private String token;


    @Override
    public String toString() {
        return "Registro de Operador: " + this.getToken();
    }
}
