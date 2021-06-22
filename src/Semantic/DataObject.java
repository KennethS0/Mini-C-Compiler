package Semantic;

import javax.xml.crypto.Data;

public class DataObject extends RegistroSemantico {

    DataTypes tipo;
    String valor = "";
    String nombre = "";
    Boolean variable;

    public DataObject(){};

    public DataObject(DataTypes pTipo, String pNombre, String pValor) {
        this.tipo = pTipo;
        this.nombre = pNombre;
        this.valor = pValor;
        this.variable = false;
    }

    public DataObject(DataTypes pTipo, String pNombre, String pValor, boolean pVar) {
        this.tipo = pTipo;
        this.nombre = pNombre;
        this.valor = pValor;
        this.variable = pVar;
    }


    // SETTERS - GETTERS
    public DataTypes  getTipo(){
        return this.tipo;
    }

    public String getValor(){
        return this.valor;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTipo(DataTypes pTipo){
        this.tipo = pTipo;
    }

    public void setValor(String pValor){
        this.valor = pValor;
    }

    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }

    public Boolean getVariable() {
        return variable;
    }

    public void setVariable(Boolean variable) {
        this.variable = variable;
    }

    @Override
    public String toString(){
        return "RS_DO: " + this.nombre + " TIPO: " + this.tipo + " VAL: " +  this.valor + " VAR: " + this.variable.toString();
    }
}
