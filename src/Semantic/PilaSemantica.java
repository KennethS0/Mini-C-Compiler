package Semantic;

import java.util.ArrayList;

public class PilaSemantica extends ArrayList<RegistroSemantico> {

    private enum tipos {
        IDENTIFICADOR,
        TIPO,
        DATA_OBJECT
    };

    public void push(RegistroSemantico pRegistro) {
        this.add(0, pRegistro);
    }

    public RegistroSemantico pop() {
        if (!this.isEmpty()) {
            RegistroSemantico registro = this.get(0);
            this.remove(0);
            return registro;
        } else {
            return null;
        }
    }

    public RegistroSemantico buscarRegistro(tipos pRegistro) {
        for (RegistroSemantico registro : this) {
            switch (pRegistro) {
                case IDENTIFICADOR:
                    if (registro instanceof RegistroIdentificador) return registro;
                    break;
                case TIPO:
                    if (registro instanceof RegistroTipo) return registro;
                    break;
                }
            }
        return null;
    }

}
