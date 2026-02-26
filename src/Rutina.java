public class Rutina {
    private String nombreRutina;
    private String topoRetorno;
    private Rutina siguiente;

    public Rutina(String nombreRutina, String topoRetorno) {
        this.nombreRutina = nombreRutina;
        this.topoRetorno = topoRetorno;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public String getTopoRetorno() {
        return topoRetorno;
    }

    public void setTopoRetorno(String topoRetorno) {
        this.topoRetorno = topoRetorno;
    }

    public Rutina getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Rutina siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "nombreRutina='" + nombreRutina + '\'' +
                ", topoRetorno='" + topoRetorno + '\'' +
                ", siguiente=" + siguiente +
                '}';
    }
}
