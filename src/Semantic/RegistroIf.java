package Semantic;

public class RegistroIf extends RegistroSemantico{

    private String else_label = "else_";
    private String exit_label = "exit_if_";

    public RegistroIf(String elseNum, String exitNum) {
        this.else_label += elseNum;
        this.exit_label += exitNum;
    }

    @Override
    public String toString(){
        return "IF: " + else_label + " " + exit_label;
    }

    public String getElse_label() {
        return else_label;
    }

    public void setElse_label(String else_label) {
        this.else_label = else_label;
    }

    public String getExit_label() {
        return exit_label;
    }

    public void setExit_label(String exit_label) {
        this.exit_label = exit_label;
    }
}
