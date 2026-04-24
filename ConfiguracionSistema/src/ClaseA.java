public class ClaseA {
    public void ejecutar() {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("ClaseA instancia: " + config);
    }
}