package Semantic;

public class DataObject {

    String tipo = "";
    String valor = "";
    String nombre = "";

    public DataObject(String pTipo, String pNombre) {
        this.tipo = pTipo;
        this.nombre = pNombre;
    }
    // SETTERS - GETTERS
    String getTipo(){
        return this.tipo;
    }

    String getValor(){
        return this.valor;
    }

    String getNombre(){
        return this.nombre;
    }

    void setTipo(String pTipo){
        this.tipo = pTipo;
    }

    void setValor(String pValor){
        this.valor = pValor;
    }

    void setNombre(String pNombre){
        this.nombre = pNombre;
    }

    @Override
    public String toString(){
        return "'" + this.nombre + ", " + this.tipo + ", " +  this.valor  + "'";
    }
}
