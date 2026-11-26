package jerarquia;

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
      historial = FileManager.leerArchivo(File archivo);


    }

    private void limpiar() {

    }

}
