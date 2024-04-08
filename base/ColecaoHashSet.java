package Conceitos;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        /* Manipulação HashSet */
        /* tamanho */
        System.out.println(numeros.size());

        /* percorrer */
        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        /* remover */
        numeros.remove(12);

        /* Verificar dados */
        System.out.println(numeros.contains(12));

    }

}
