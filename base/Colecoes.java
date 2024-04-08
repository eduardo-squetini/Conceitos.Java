package Conceitos;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Edu", 10);
        notas.put("Clara", 9);

        // Manipulação de coleções

        // Ver nota
        var nota = notas.get("Edu");
        System.out.println(nota);

        // Percorrer coleção
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é:" + key + " e o valor é " + value);
        }
    }

}
