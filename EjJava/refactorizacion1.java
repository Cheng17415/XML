import java.util.ArrayList;
import java.util.Scanner;

public class refactorizacion1 {
    public static void main(String[] args) {
        String linea = getInputUsuario();
        ArrayList<String> listaPalabras = getListaPalabras(linea);
        getMediaYMax(listaPalabras);
    }

    private static String getInputUsuario() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba palabras separadas por espacios: ");
        String linea = entrada.nextLine();
        entrada.close();
        return linea;
    }

    private static ArrayList<String> getListaPalabras(String linea) {
        String[] palabras = linea.split(" ");
        ArrayList<String> listaPalabras = new ArrayList<>();
        for (String palabra : palabras) {
            listaPalabras.add(palabra);
        }
        return listaPalabras;
    }

    private static void getMediaYMax(ArrayList<String> listaPalabras) {
        int longitudTotal = 0;
        String palabraMaxLongitud = "";
        for (String palabra : listaPalabras) {
            longitudTotal += palabra.length();
            if (palabra.length() > palabraMaxLongitud.length()) {
                palabraMaxLongitud = palabra;
            }
        }
        
        double media = (double) longitudTotal / listaPalabras.size();
        System.out.println("La longitud media es de: " + media);
        System.out.println("La palabra con más letras es: " + palabraMaxLongitud);
    }

}
