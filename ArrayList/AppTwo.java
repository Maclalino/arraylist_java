package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class AppTwo {
    public static void main(String[] args) {
        ArrayList<String> filmes= new ArrayList<String>();
        ArrayList<Integer> numeros= new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(40);
        numeros.add(90);

        Collections.sort(numeros, Collections.reverseOrder());

        for (Integer numero: numeros) {
            System.out.println(numero);
        }

    }
}
