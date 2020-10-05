package sk.stuba.fei.uim.asos.cvicenie1.circulardependency;

public class ServiceB {

    private final String secret = "B";
    private final ServiceA serviceA;

    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public String getSecret() {
        return secret;
    }

    public String getCombinedSecrets() {
        return secret + serviceA.getSecret();
    }
}
