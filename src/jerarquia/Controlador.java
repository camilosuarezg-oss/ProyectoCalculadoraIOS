package jerarquia;

import excepciones.EntradaInvalidaExcepcion;
import historialArchivos.FileManager;

import java.io.IOException;
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
     // historial = FileManager.leerArchivo();


    }

    private void limpiar() {

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
        if (contarDigitos(textoPantalla)>=maximoDigitos){
            throw new EntradaInvalidaExcepcion("Solo se puede escribir hasta " + maximoDigitos + "digitos",digito);
        }
        textoPantalla=textoPantalla + digito;

    }

    public void agregarPunto() throws EntradaInvalidaExcepcion{
        if(empezarNumeroNuevo){
            textoPantalla="0.";
            empezarNumeroNuevo=false;
            return;
        }
        if(textoPantalla.contains(".")){
            throw new EntradaInvalidaExcepcion("El numero ya tiene punto decimal." , ",");

        }
        textoPantalla=textoPantalla+".";

    }

    public void elegirOperacion(String simbolo) throws EntradaInvalidaExcepcion, IOException {

        if(!esOperador(simbolo)){
            throw new EntradaInvalidaExcepcion("La operacion" + simbolo + "no existe", simbolo);
        }

        double numeroActual=leerNumeroPantalla();

        if (operadores.isEmpty()|| !empezarNumeroNuevo){
            numeros.add(numeroActual);
            operadores.add(simbolo);

        }else{
            operadores.set(operadores.size()-1, simbolo);
        }
        textoPantalla=formatearNumero(calcularParaPantalla(simbolo));
        empezarNumeroNuevo=true;

    }

    public void calcularResultado()throws EntradaInvalidaExcepcion, IOException, ArithmeticException{

        if(operadores.isEmpty()){
            return;
        }

        if(empezarNumeroNuevo){
            operadoresCuenta.remove(operadoresCuenta.size -1);
        }else{
            numerosCuenta.add(leerNumeroPantalla());
        }

        if(operadoresCuenta.isEmpty()){

            textoPantalla=formatearNumero(numerosCuenta.get(0));
            numeros.clear();
            operadores.clear();
            empezarNumeroNuevo=true;
            return;

        }
        double resultado=

    }




    public int contarDigitos(String textoPantalla) {


    }


}
