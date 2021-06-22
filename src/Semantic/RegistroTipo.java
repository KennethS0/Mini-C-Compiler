package Semantic;

public class RegistroTipo extends RegistroSemantico {

    public RegistroTipo(){
        super();
    }

    private DataTypes tipo;

    public RegistroTipo(DataTypes pTipo) {
        this.tipo = pTipo;
    }

    public DataTypes getTipo() {
        return tipo;
    }

    public void setTipo(DataTypes tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "RS_Type: " + this.getToken();
    }
}
