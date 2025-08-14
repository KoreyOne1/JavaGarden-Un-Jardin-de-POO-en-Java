public abstract class Planta {
    private String nombre, clima;
    private  float alto;
    private boolean tienehojas;

    public Planta(String nombre, String clima, float alto, boolean tienehojas) {
        this.nombre = nombre;
        this.clima = clima;
        this.alto = alto;
        this.tienehojas = tienehojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public boolean isTienehojas() {
        return tienehojas;
    }

    public void setTienehojas(boolean tienehojas) {
        this.tienehojas = tienehojas;
    }
    void mensaje(){

    }
}
