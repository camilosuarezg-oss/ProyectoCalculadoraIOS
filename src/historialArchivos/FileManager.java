package historialArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private static final String nombreArchivo= "historial.txt";

    public static List<String> leerArchivo(File archivo) {
        // lista que almacena el contenido del archivo
        // var no hace la variable global. Solo ahorra escribir el tipo: Java lo deduce por lo que hay a la derecha.
        final var lista = new ArrayList<String>();

        try {
            // Scanner es la herramienta que lee el archivo, línea por línea.
            final var scanner = new Scanner(archivo);

            // lee el archivo mientras existan más líneas
            // hasNextLine() pregunta si todavía hay otra línea por leer.
            // nextLine() lee esa línea.
            while (scanner.hasNextLine()) {
                lista.add(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            // La primera vez que se usa la calculadora el archivo todavía no existe y es normal:
            // se imprime el aviso y se devuelve la lista vacía.
            System.err.println("Error al abrir el archivo " + e.getMessage());
        }
        return lista;
    }

    public static void escribirArchivo(File archivo, List<String> lista) {
        try {
            // FileWriter es la herramienta que escribe texto dentro de un archivo.
            // Es lo contrario del Scanner: el Scanner lee, el FileWriter escribe.
            // Si el archivo no existe, FileWriter lo crea y escribe en él.
            final var escribirArchiv = new FileWriter(archivo);

            // for para recorrer la lista
            for (var linea : lista) {
                // cada línea se escribe con un salto de línea (%n)
                final var lineaEscribir = String.format("%s%n", linea);
                // se escribe en el archivo
                escribirArchiv.write(lineaEscribir);
            }
            // cerramos el archivo para decir que ya se terminó el proceso
            escribirArchiv.close();

        } catch (IOException e) {
            System.err.println("Error al escribir el archivo " + e.getMessage());
        }
    }
}
