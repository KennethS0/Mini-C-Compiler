package Semantic;

public class RegistroIdentificador extends RegistroSemantico{

    public RegistroIdentificador() {
        super();
    }

    public RegistroIdentificador(String pToken) {
        super(pToken);
    }

    @Override
    public String toString() {
        return "Registro de identificador: " + this.getToken();
    }
}
