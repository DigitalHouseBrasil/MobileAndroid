package aula9_dicionarios.Exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Exercicio1 {
    public static void main(String[] args) {
        Map<Integer, String> dicionarioSonhos = new HashMap<>();

        dicionarioSonhos.put(0, "Ovos");
        dicionarioSonhos.put(1, "Água");
        dicionarioSonhos.put(2, "Escopeta");
        dicionarioSonhos.put(3, "Cavalo");
        dicionarioSonhos.put(4, "Dentista");
        dicionarioSonhos.put(5, "Fogo");

        System.out.println(dicionarioSonhos.get(5));


        Map<String, List<String>> dicionarioApelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        dicionarioApelidos.put("João", apelidosJoao);
        dicionarioApelidos.put("Miguel", apelidosMiguel);
        dicionarioApelidos.put("Maria", apelidosMaria);
        dicionarioApelidos.put("Lucas", apelidosLucas);

        System.out.println("Apelidos do Miguel: \n" + dicionarioApelidos.get("Miguel"));
    }
}
