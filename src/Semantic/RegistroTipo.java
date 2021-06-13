package Semantic;

public class RegistroTipo extends RegistroSemantico {

    public RegistroTipo(){
        super();
    }

    public RegistroTipo(String pToken) {
        super(pToken);
    }

    @Override
    public String toString() {
        return "Registro de tipo: " + this.getToken();
    }
}
