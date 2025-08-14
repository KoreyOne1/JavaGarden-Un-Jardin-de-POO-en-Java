public class Arbusto extends Planta{
    private double anchoArbusto;
    private boolean esDomestico, sePoda;
    private String variedadDeArbusto, colorDeHojas;

    public Arbusto(String nombre, String clima, float alto, boolean tienehojas, double anchoArbusto, boolean esDomestico, boolean sePoda, String variedadDeArbusto, String colorDeHojas) {
        super(nombre, clima, alto, tienehojas);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.sePoda = sePoda;
        this.variedadDeArbusto = variedadDeArbusto;
        this.colorDeHojas = colorDeHojas;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    public String getVariedadDeArbusto() {
        return variedadDeArbusto;
    }

    public void setVariedadDeArbusto(String variedadDeArbusto) {
        this.variedadDeArbusto = variedadDeArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    @Override
    public String toString() {
        return "Arbusto{" +
                "anchoArbusto=" + anchoArbusto +
                ", esDomestico=" + esDomestico +
                ", sePoda=" + sePoda +
                ", variedadDeArbusto='" + variedadDeArbusto + '\'' +
                ", colorDeHojas='" + colorDeHojas + '\'' +
                '}';
    }

    public void mensaje(){
        System.out.println("Hola soy un arbusto");
    }
}
