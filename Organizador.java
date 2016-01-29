import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
public class Organizador
{
    // ArrayList para guardar String con el nombre de los alumnos
    private ArrayList<String> lista;
    // Objeto de tipo DecimalFormat para guardar formato e información de cada pareja
    private DecimalFormat formato;
    
    /**
     * Constructor de objetos de la clase Organizador
     */
    public Organizador()
    {
        lista = new ArrayList<String>();
        
        formato = new DecimalFormat("0000");

        lista.add("Adeva Tranche, Adrián");
        lista.add("Aller González, Francisco Javier");
        lista.add("Álvarez Prieto, Noelia");
        lista.add("Barrionuevo Pérez, Manuel");
        lista.add("Bóveda del Río, José Antonio");
        lista.add("de la Viuda Crespo, Ignacio");
        lista.add("Encina Maestro, David");
        lista.add("Felix Nañez, Kevin");
        lista.add("Fernández Diez, Daniel");
        lista.add("Fernández González, Javier");
        lista.add("Fernández Rincón, Jesús");
        lista.add("Fuentes Álvarez, Francisco José");
        lista.add("García Juárez, David");
        lista.add("García Serrano, Rubén");
        lista.add("González Álvarez, David");
        lista.add("López Beltrán, Víctor");
        lista.add("Lora García, Sandra");
        lista.add("Melcón Diez, Víctor");
        lista.add("Menéndez Pouso, Francisco José");
        lista.add("Pérez Bayón, Álvaro");
        lista.add("Pradera San José, Daniel");
        lista.add("Prieto Mediavilla, Gabriel");
        lista.add("Robles González, Miguel Ángel");
        lista.add("Sánchez Manzano, Adán");
        lista.add("Serrano García, Verónica");
    }

    /**
     * Método para emparejar a los alumnos de manera aleatoria y mostrar por pantalla los emparejamientos
     */
    public void emparejar()
    {
        Collections.shuffle(lista);
        int numeroEnLista = 0;
        int numeroPareja = 1;

        if (lista.size()%2!=0){
            System.out.println("Pareja nº " + formato.format(numeroPareja++));
            System.out.println(lista.get(numeroEnLista++));
            System.out.println(lista.get(numeroEnLista++));
            System.out.println(lista.get(numeroEnLista++));
        }
        
        while (numeroEnLista<lista.size()) {
            System.out.println("Pareja nº " + formato.format(numeroPareja++));
            System.out.println(lista.get(numeroEnLista++));
            System.out.println(lista.get(numeroEnLista++));
        }
    }
}
