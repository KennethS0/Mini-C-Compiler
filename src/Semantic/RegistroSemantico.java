package Semantic;

public abstract class RegistroSemantico {

    private String token;

    public RegistroSemantico() {

    }

    public RegistroSemantico(String pToken) {
        this.token = pToken;
    }

    public void setToken(String pToken) {
        this.token = pToken;
    }

    public String getToken() {
        return token;
    }


}
