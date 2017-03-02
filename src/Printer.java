import java.util.Arrays;

public class Printer {

    private String alphabet;


    // Constructor: accepta un String amb la representació de tot l'alfabet
    // Hi haurà 27 lletres en total, separades per un espai en blanc.
    Printer(String alphabet) {
        this.alphabet = alphabet;
    }

    // Mètode render: accepta un String amb el text a representar i torna
    // també un String amb el text en forma d'ASCII Art.
    // Només es consideren les lletres majúscules de la A a la Z. Les
    // minúscules es passen a majúscules, i els altres caràctes es tradueixen
    // a «?» (manco l'espai en blanc).
    public String render(String text) {
        text = text.toUpperCase();
        String [] abc = alphabet.split("\n");
        StringBuilder sb = new StringBuilder();
        int longitud = (abc[0].length() - 25) / 27;
        int posicion;

        for (int i = 0; i < abc.length ; i++) {
            for (int j = 0; j < text.length() ; j++) {

                if (text.charAt(j) >= 'A' && text.charAt(j) <= 'Z'){
                    posicion = (text.charAt(j) - 'A') * (longitud+1);
                    sb.append(abc[i].substring(posicion, posicion + longitud));

                }else if (text.charAt(j) == ' '){
                    sb.append(space(longitud));

                }else{
                    posicion = 26 * (longitud+1);
                    sb.append(abc[i].substring(posicion, posicion + longitud));
                }

                if (j != text.length()-1) sb.append(' ');

            }
            if (i != abc.length -1) sb.append('\n');
        }

        return sb.toString();
    }

    private String space(int longitud){
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < longitud ; k++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}