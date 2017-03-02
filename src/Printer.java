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
        String [] abc = alphabet.split("n");
        StringBuilder sb = new StringBuilder();
        int longitud = (abc[0].length() - 25) / 27;

        for (int i = 0; i < abc.length ; i++) {
            for (int j = 0; j < text.length() ; j++) {
                if (text.charAt(j) >= 'A' && text.charAt(j) <= 'Z'){
                    int posicion = text.charAt(j) - 'A';
                    sb.append(abc[i].substring(posicion, posicion + longitud));

                    if (j != text.length()-1) sb.append(' ');

                    continue;
                }

                if (text.charAt(j) == ' '){
                    //lo del espacio
                    continue;

                }else{
                    //interrogante
                }


            }
            if (i != abc.length -1) sb.append('\n');

        }

        return null;
    }
}