package Semantic;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataObject extends RegistroSemantico {

    DataTypes tipo;
    String valor = "";
    String nombre = "";
    Boolean variable;
    Boolean function;
    ArrayList<RegistroIdentificador> parametros;

    public DataObject(){};

    public DataObject(DataTypes pTipo, String pNombre, String pValor) {
        this.tipo = pTipo;
        this.nombre = pNombre;
        this.valor = pValor;
        this.variable = false;
        this.function = false;
    }

    public DataObject(DataTypes pTipo, String pNombre, String pValor, boolean pVar, boolean pFunc) {
        this.tipo = pTipo;
        this.nombre = pNombre;
        this.valor = pValor;
        this.variable = pVar;
        this.function = pFunc;

        if (pFunc){
            parametros = new ArrayList<RegistroIdentificador>();
        }
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

    public Boolean getFunction() {
        return function;
    }

    public void setFunction(Boolean function) {
        this.function = function;
    }

    public ArrayList<RegistroIdentificador> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<RegistroIdentificador> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString(){
        return "RS_DO: " + this.nombre + " TIPO: " + this.tipo + " VAL: " +  this.valor + " VAR: " + this.variable.toString() + " FUNC: " + this.function.toString();
    }
}
