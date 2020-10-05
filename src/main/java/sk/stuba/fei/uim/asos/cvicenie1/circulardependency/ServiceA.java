package sk.stuba.fei.uim.asos.cvicenie1.circulardependency;

public class ServiceA {

    private final String secret = "A";
    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public String getSecret() {
        return secret;
    }

    public String getCombinedSecrets() {
        return secret + serviceB.getSecret();
    }
}
