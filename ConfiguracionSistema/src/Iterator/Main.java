package Iterator;

public class Main {
    public static void main(String[] args) {
        ColaPacientes cola = new ColaPacientes();

        System.out.println(" Registro de pacientes (orden de llegada) ");
        cola.agregarPaciente(new Paciente("Ana Pérez",    Prioridad.VERDE,    1));
        cola.agregarPaciente(new Paciente("Luis Mora",    Prioridad.ROJO,     2));
        cola.agregarPaciente(new Paciente("Sofía Díaz",  Prioridad.AMARILLO, 3));
        cola.agregarPaciente(new Paciente("Carlos Ruiz",  Prioridad.ROJO,     4));
        cola.agregarPaciente(new Paciente("Marta León",  Prioridad.VERDE,    5));
        cola.agregarPaciente(new Paciente("Pedro Vega",  Prioridad.AMARILLO, 6));

        System.out.println("\n Orden de atención (por prioridad y llegada) ");
        Iterator it = cola.crearIterador();
        int turno = 1;
        while (it.hasNext()) {
            System.out.println("Turno " + turno++ + ": " + it.next());
        }
    }
}