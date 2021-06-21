package Semantic;

public class DataObject extends RegistroSemantico {

    String tipo = "";
    String valor = "";
    String nombre = "";

    public DataObject(String pTipo, String pNombre, String pValor) {
        this.tipo = pTipo;
        this.nombre = pNombre;
        this.valor = pValor;
    }
    // SETTERS - GETTERS
    public String getTipo(){
        return this.tipo;
    }

    public String getValor(){
        return this.valor;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTipo(String pTipo){
        this.tipo = pTipo;
    }

    public void setValor(String pValor){
        this.valor = pValor;
    }

    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }

    @Override
    public String toString(){
        return "'" + this.nombre + ", " + this.tipo + ", " +  this.valor  + "'";
    }
}
