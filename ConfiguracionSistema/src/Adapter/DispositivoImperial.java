package Adapter;

// Adaptee
public class DispositivoImperial {
    private double alturaPies;
    private double pesoLibras;

    public DispositivoImperial(double alturaPies, double pesoLibras) {
        this.alturaPies = alturaPies;
        this.pesoLibras = pesoLibras;
    }

    public double getAlturaPies() {
        return alturaPies;
    }

    public double getPesoLibras() {
        return pesoLibras;
    }
}