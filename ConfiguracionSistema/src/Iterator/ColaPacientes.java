package Iterator;
import java.util.ArrayList;
import java.util.List;

public class ColaPacientes implements IterableColeccion {
    private List<Paciente> listaPacientes;

    public ColaPacientes() {
        this.listaPacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
        System.out.println("Registrado: " + paciente);
    }

    @Override
    public Iterator crearIterador() {
        return new IteradorPacientes(listaPacientes);
    }
}