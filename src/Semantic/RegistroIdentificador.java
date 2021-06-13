package Semantic;

public class RegistroIdentificador extends RegistroSemantico{

    public RegistroIdentificador() {
        super();
    }

    public RegistroIdentificador(String pToken) {
        super(pToken);
    }

    private String tipo;



    @Override
    public String toString() {
        return "Registro de identificador: " + this.getToken();
    }
}
