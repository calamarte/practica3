import java.util.Arrays;

public class Printer {

    private String[] abc = null;


    // Constructor: accepta un String amb la representació de tot l'alfabet
    // Hi haurà 27 lletres en total, separades per un espai en blanc.
    Printer(String alphabet) {
        int longitud;
        int filas = 0;
        int columnas = 0;
        int posicion = 0;

        //cuenta las columnas excluyendo '\n'
        for (int i = 0; i < alphabet.length() ; i++) {
            if (alphabet.charAt(i) == '\n') {
                columnas = i-1;// ojo
                break;
            }

        }

        //cuenta las filas
        for (int i = 0; i < alphabet.length() ; i++) {
            if (alphabet.charAt(i) == '\n') {
                filas++;
            }
        }
        filas++;

        //cuantas columnas por letra
        longitud = (columnas - 25) / 27;

        System.out.println(columnas);
        System.out.println(filas);
        System.out.println(longitud);

        String [][] abc = new String[filas][27];
        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < filas ; i++) {
//            for (int j = 0,x = 0; j < columnas ; j++) {
//                if (x == longitud){
//                    if (i != filas-1)sb.append('\n');
//                    abc[posicion][] += sb.toString();
//                    sb.setLength(0);
//                    posicion++;
//                    x = 0;
//                    continue;
//                }
//
//                if (x < longitud+3){
//                    sb.append(alphabet.charAt(i));
//                    x++;
//                }
//            }
//            posicion = 0;
//
//        }

        System.out.println(Arrays.deepToString(abc));


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