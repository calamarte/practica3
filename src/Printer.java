import java.util.Arrays;

public class Printer {

    private String alphabet;


    // Constructor: accepta un String amb la representació de tot l'alfabet
    // Hi haurà 27 lletres en total, separades per un espai en blanc.
    public Printer(String alphabet) {
        this.alphabet = alphabet;
    }

    // Mètode render: accepta un String amb el text a representar i torna
    // també un String amb el text en forma d'ASCII Art.
    // Només es consideren les lletres majúscules de la A a la Z. Les
    // minúscules es passen a majúscules, i els altres caràctes es tradueixen
    // a «?» (manco l'espai en blanc).
    public String render(String text) {

        //Se pone todo el String en mayusculas para evitar conflictos
        text = text.toUpperCase();

        //Se separan las filas de caracteres y se guardan en un array
        String [] abc = alphabet.split("\n");

        //Esta variable se encarga de ser donde se iran guardando los segmentos de letras de Arte ASCII
        //hasta formar toda la palabra o frase
        StringBuilder sb = new StringBuilder();

        //Esta variable es la que determina de cuantos caracteres está determinada cadaa letra
        int longitud = (abc[0].length() - 25) / 27;

        //Indicará la posición donde empieza una letra en concreto
        int posicion;


        //Tantas vueltas como filas hay en el Arte ASCII
        for (int i = 0; i < abc.length ; i++) {

            //Tantas vueltas como caracteres tenga el "text"
            for (int j = 0; j < text.length() ; j++) {

                //Algoritmo para letras [A,Z]
                if (text.charAt(j) >= 'A' && text.charAt(j) <= 'Z'){
                    posicion = (text.charAt(j) - 'A') * (longitud+1);
                    sb.append(abc[i].substring(posicion, posicion + longitud));

                //Algoritmo para espacios
                }else if (text.charAt(j) == ' '){
                    sb.append(space(longitud));

                //Agoritmo para el resto de caracteres
                }else{
                    posicion = 26 * (longitud+1);
                    sb.append(abc[i].substring(posicion, posicion + longitud));
                }

                //Se encarga de introducir el espacio predeterminado
                //cuando es necesario
                if (j != text.length()-1) sb.append(' ');

            }

            //Se encarag de introducir el salto de lina
            //cunado es necesario
            if (i != abc.length -1) sb.append('\n');
        }

        return sb.toString();
    }

    //Genera un espacio adecuado al tamaño de las letras en Arte ASCII
    private String space(int longitud){
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < longitud ; k++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}