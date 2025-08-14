public class main {
    public static void main(String[] args) {
        Arbol arbol1 = new Arbol("Sauce","templado", 20.5F, true, "sauce lloron",
                "frondoso", "rojizo", "Diamante",150.65F);
        arbol1.mensaje();
        System.out.println("de tipo "+arbol1.getNombre()+" y variedad "+ arbol1.getVariedad()+" y clima "+arbol1.getClima());
        System.out.println("puedo llegar a medir "+arbol1.getAlto()+"mts con un troco "+ arbol1.getTipoDeTronco()+" de color "+ arbol1.getColor());
        System.out.println("tiene hojas "+arbol1.isTienehojas());
        System.out.println("mis hojas tienen forma de "+arbol1.getTipoDeHoja()+" y el radio de mi tronco puede llegar a medir "+arbol1.getRadioTronco()+"cm");
        System.out.println("---------------------------------------------");

        Flor flor1 = new Flor("Petunia","mixto", 10, false, "rosa o blanco",
                "blanco", "Petunia salvaje", 10,"primavera");

        flor1.mensaje();
        System.out.println("de tipo "+flor1.getNombre()+" y variedad "+ flor1.getVariedadDeFlor()+" y floresco en "+flor1.getEstacionQueFlorece()+ " de un clima "+flor1.getClima());
        System.out.println("puedo llegar a medir "+flor1.getAlto()+"cm con un promedio de petalos de "+ flor1.getPromedioPetalos()+" de color "+ flor1.getColorPetalos());
        System.out.println("tiene hojas "+flor1.isTienehojas());
        System.out.println("mis pistillos son color "+flor1.getColorPistillo());
        System.out.println("--------------------------------------------");

        Arbusto arbusto1 = new Arbusto("Matorral","Seco",1.50F,true, 2.50F,true,true,
                "Matorral desertico","verdes o cafes");
        arbusto1.mensaje();
        System.out.println("Me llamo"+arbusto1.getNombre()+" de la variedad "+arbusto1.getVariedadDeArbusto()+" y clima "+arbusto1.getClima());
        System.out.println("puedo llegar a medir "+arbusto1.getAlto()+"mts de alto y "+arbusto1.getAnchoArbusto()+"mts de ancho");
        System.out.println("tengo hojas "+ arbusto1.isTienehojas()+" de color "+arbusto1.getColorDeHojas());
        System.out.println("Se me puede podar "+arbusto1.isSePoda()+" ya que tambien soy domestico "+arbusto1.isEsDomestico());

    }
}
