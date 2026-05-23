package Iterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IteradorPacientes implements Iterator {
    private List<Paciente> pacientes;
    private int posicion;

    public IteradorPacientes(List<Paciente> pacientes) {
        this.pacientes = new ArrayList<>(pacientes);
        ordenar();
        this.posicion = 0;
    }

    private void ordenar() {
        // Primero por nivel de prioridad (1=ROJO, 2=AMARILLO, 3=VERDE)
        // Si hay empate, por orden de llegada
        pacientes.sort(
                Comparator.comparingInt((Paciente p) -> p.getPrioridad().getNivel())
                        .thenComparingInt(Paciente::getOrdenLlegada)
        );
    }

    @Override
    public boolean hasNext() {
        return posicion < pacientes.size();
    }

    @Override
    public Paciente next() {
        if (!hasNext()) throw new RuntimeException("No hay más pacientes.");
        return pacientes.get(posicion++);
    }
}