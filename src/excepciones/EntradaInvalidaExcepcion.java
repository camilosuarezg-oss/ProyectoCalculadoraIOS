package excepciones;

public class EntradaInvalidaExcepcion extends Exception {

    //Atributo

    private String entradaRechazada;


    public EntradaInvalidaExcepcion(String message, String entradaRechazada) {
        super(message);
        this.entradaRechazada=entradaRechazada;

    }
    public String getEntradaRechazada() {
        return entradaRechazada;
    }


}
