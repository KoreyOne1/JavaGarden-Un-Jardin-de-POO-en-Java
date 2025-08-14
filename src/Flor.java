public class Flor extends Planta{
    private String colorPetalos, colorPistillo, variedadDeFlor, estacionQueFlorece;
    private int promedioPetalos;

    public Flor(String nombre, String clima, float alto, boolean tienehojas, String colorPetalos, String colorPistillo, String variedadDeFlor, int promedioPetalos, String estacionQueFlorece) {
        super(nombre, clima, alto, tienehojas);
        this.colorPetalos = colorPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadDeFlor = variedadDeFlor;
        this.promedioPetalos = promedioPetalos;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public int getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(int promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "colorPetalos='" + colorPetalos + '\'' +
                ", colorPistillo='" + colorPistillo + '\'' +
                ", variedadDeFlor='" + variedadDeFlor + '\'' +
                ", estacionQueFlorece='" + estacionQueFlorece + '\'' +
                ", promedioPetalos=" + promedioPetalos +
                '}';
    }

    public void mensaje(){
        System.out.println("Hola soy una flor");
    }
}
