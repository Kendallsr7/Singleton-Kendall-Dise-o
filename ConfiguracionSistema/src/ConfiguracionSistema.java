public class ConfiguracionSistema {

    private static ConfiguracionSistema configuracionSistema;
    private String urlBase;
    private int puerto;



    private ConfiguracionSistema() {
        this.urlBase = "http://localhost";
        this.puerto = 8080;
    }

    // aca asumo que el puerto lo creo yo y la url
    public static ConfiguracionSistema getInstancia() {
        if (configuracionSistema == null) {
            configuracionSistema = new ConfiguracionSistema();
        }
        return configuracionSistema;
    }



    public String getUrlBase() {
        return urlBase;
    }

    public int getPuerto() {
        return puerto;
    }



}
