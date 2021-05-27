package Parser.Error;

public class Error {

    private ErrorTypes type;
    private int line;
    private int column;

    public Error(ErrorTypes pType, int pLine, int pColumn) {
        type = pType;
        line = pLine;
        column = pColumn;
    }
}
