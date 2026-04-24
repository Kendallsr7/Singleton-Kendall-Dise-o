package Adapter;

// Target
public interface MedidorSalud {
    double calcularIMC(double alturaMetros, double pesoKg);

    String clasificar(double imc);
}