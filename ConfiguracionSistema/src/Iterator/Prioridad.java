package Iterator;
public enum Prioridad {
    ROJO(1), AMARILLO(2), VERDE(3);

    private final int nivel;

    Prioridad(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}