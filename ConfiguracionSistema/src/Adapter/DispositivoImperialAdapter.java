package Adapter;

// Adapter
public class DispositivoImperialAdapter implements MedidorSalud {

    private DispositivoImperial dispositivo;

    public DispositivoImperialAdapter(DispositivoImperial dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public double calcularIMC(double alturaMetros, double pesoKg) {
        return pesoKg / (alturaMetros * alturaMetros);
    }

    @Override
    public String clasificar(double imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 25) return "Normal";
        else return "Sobrepeso";
    }

    public void procesarPaciente() {
        double alturaMetros = dispositivo.getAlturaPies() * 0.3048;
        double pesoKg = dispositivo.getPesoLibras() * 0.4536;

        double imc = calcularIMC(alturaMetros, pesoKg);
        String estado = clasificar(imc);

        System.out.println("Datos originales: "
                + dispositivo.getAlturaPies() + " pies, "
                + dispositivo.getPesoLibras() + " libras");

        System.out.println("Convertido a: "
                + alturaMetros + " metros, "
                + pesoKg + " kg");

        System.out.println("IMC: " + imc);
        System.out.println("Estado: " + estado);
    }
}