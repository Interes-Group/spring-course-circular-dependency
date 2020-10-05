package sk.stuba.fei.uim.asos.cvicenie1.circulardependency;

public class ServiceA {

    private final String secret = "A";
    private ServiceB serviceB;

    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public String getSecret() {
        return secret;
    }

    public String getCombinedSecrets() {
        return secret + serviceB.getSecret();
    }
}
