package Parser.Error;

import java.util.ArrayList;

public class SyntaxError {

    private ErrorTypes type;
    private int line;
    private int column;

    public SyntaxError(ErrorTypes pType, int pLine, int pColumn) {
        type = pType;
        line = pLine;
        column = pColumn;
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return type.toString() + " | Line: " + line + " | Col: " + column;
    }
}
