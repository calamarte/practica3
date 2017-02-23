public class Printer {

    private String[] abc = null;


    // Constructor: accepta un String amb la representació de tot l'alfabet
    // Hi haurà 27 lletres en total, separades per un espai en blanc.
    Printer(String alphabet) {
        int longitud = 0;

        for (int i = 0; i < alphabet.length() ; i++) {
            if (alphabet.charAt(i) == '\n') {
                longitud = i-1;
                break;// ojo
            }

        }
        longitud -= 25;
        longitud /= 27;

        StringBuilder [] abc = new StringBuilder[longitud];

        for (int i = 0,aux = 1,posicion = 0; i < alphabet.length() ; i++) {
            if (alphabet.charAt(i) == '\n'){
                posicion = 0;
                continue;
            }

            if (aux == longitud+1){
                aux = 1;
                posicion++;
                continue;
            }

            

        }


    }



    // Mètode render: accepta un String amb el text a representar i torna
    // també un String amb el text en forma d'ASCII Art.
    // Només es consideren les lletres majúscules de la A a la Z. Les
    // minúscules es passen a majúscules, i els altres caràctes es tradueixen
    // a «?» (manco l'espai en blanc).
    public String render(String text) {
        return null;
    }
}