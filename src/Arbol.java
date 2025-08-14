public class Arbol extends Planta{
    private String variedad, tipoDeTronco, color, tipoDeHoja;
    private float radioTronco;

    public Arbol(String nombre, String clima, float alto, boolean tienehojas,
                 String variedad, String tipoDeTronco, String color,
                 String tipoDeHoja, float radioTronco) {
        super(nombre, clima, alto, tienehojas);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.color = color;
        this.tipoDeHoja = tipoDeHoja;
        this.radioTronco = radioTronco;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHoja() {
        return tipoDeHoja;
    }

    public void setTipoDeHoja(String tipoDeHoja) {
        this.tipoDeHoja = tipoDeHoja;
    }

    public float getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(float radioTronco) {
        this.radioTronco = radioTronco;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "variedad='" + variedad + '\'' +
                ", tipoDeTronco='" + tipoDeTronco + '\'' +
                ", color='" + color + '\'' +
                ", tipoDeHoja='" + tipoDeHoja + '\'' +
                ", radioTronco=" + radioTronco +
                '}';
    }

    public void mensaje(){
        System.out.println("hola soy un arbol");
    }
}
