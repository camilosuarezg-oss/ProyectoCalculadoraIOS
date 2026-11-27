package jerarquia;

import excepciones.EntradaInvalidaExcepcion;
import historialArchivos.FileManager;

import java.util.ArrayList;

public class Controlador {

    private static final int maximoDigitos=9;

    private String textoPantalla;

    private ArrayList<Double> numeros;
    private ArrayList<String>operadores;
    private boolean empezarNumeroNuevo;
    private ArrayList<String> historial;

    public Controlador(){
      numeros=new ArrayList<Double>();
      operadores = new ArrayList<String>();
      limpiar();
      //historial = FileManager.leerArchivo();


    }

    public String getTextoPantalla() {
        return textoPantalla;
    }

    public ArrayList<String> getHistorial() {
        return new ArrayList<String>(historial);
    }

    public void limpiar() {
        textoPantalla="0";
        numeros.clear();
        operadores.clear();
        empezarNumeroNuevo=true;
    }
    public void mostrarError(){
        textoPantalla="Error";
        numeros.clear();
        operadores.clear();
        empezarNumeroNuevo=true;

    }
    public void agregarDigitos(String digito) throws EntradaInvalidaExcepcion {
        if((digito==null || digito.length()!=1)|| !"0123456789".contains(digito)){
            throw new EntradaInvalidaExcepcion("Solo se pueden ingresar digitos del 1 al 9",digito);
        }
        if(empezarNumeroNuevo||textoPantalla.equals("0")){
            textoPantalla=digito;
            empezarNumeroNuevo=false;
            return;
        }
        if (textoPantalla.equals("-0")){
            textoPantalla="-"+digito;
            return;
        }
    }


}
