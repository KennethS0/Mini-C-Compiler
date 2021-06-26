package Semantic;

import java.util.ArrayList;

public class FunctionRegister extends RegistroSemantico {

    private ArrayList<RegistroIdentificador> params;






    public void addParam(RegistroIdentificador param) {
        params.add(param);
    }
}
