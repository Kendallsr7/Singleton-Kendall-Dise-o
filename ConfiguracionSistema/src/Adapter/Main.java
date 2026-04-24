package Adapter;

public class Main {
    public static void main(String[] args) {

        DispositivoImperial dispositivo = new DispositivoImperial(5.9, 160);
        DispositivoImperialAdapter adapter = new DispositivoImperialAdapter(dispositivo);
        adapter.procesarPaciente();
    }
}