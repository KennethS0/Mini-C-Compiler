package Semantic;

public class RegistroIdentificador extends RegistroSemantico{

    public RegistroIdentificador() {
        super();
    }

    public RegistroIdentificador(DataTypes pTipo, String pToken) {
        super(pToken);
        this.tipo = pTipo;
    }

    private DataTypes tipo;

    @Override
    public String toString() {
        return "RS_ID: " + this.getToken() + " TIPO: " + this.tipo;
    }

    public DataTypes getTipo() {
        return tipo;
    }

    public void setTipo(DataTypes tipo) {
        this.tipo = tipo;
    }
}
