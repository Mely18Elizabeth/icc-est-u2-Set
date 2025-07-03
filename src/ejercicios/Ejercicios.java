package ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1:");
        int[] duplicados1 = {1, 2, 3, 4, 5};
        int[] duplicados2 = {1, 2, 3, 4, 5, 4, 3, 2, 45};

        System.out.println("Números a comparar:");
        System.out.println(Arrays.toString(duplicados1));
        System.out.println(Arrays.toString(duplicados2));

        System.out.println("¿El primer arreglo tiene duplicados? " + tieneDuplicados(duplicados1));
        System.out.println("¿El segundo arreglo tiene duplicados? " + tieneDuplicados(duplicados2));

        System.out.println("\nEjercicio 2:");
        System.out.println("\"murcielago\" es isograma = " + esIsograma("murcielago")); 
        System.out.println("\"camaleon\" es isograma = " + esIsograma("camaleon"));

        System.out.println("\nEjercicio 3: Palabras únicas del texto");
        contarPalabrasUnicas();
    }

    public boolean tieneDuplicados(int[] numeros) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        palabra = palabra.toLowerCase();
        HashSet<Character> letras = new HashSet<>();

        for (char c : palabra.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!letras.add(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void contarPalabrasUnicas() {
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
        """;

        texto = texto.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "");
        String[] palabras = texto.split("\\s+");
        Set<String> unicas = new HashSet<>(Arrays.asList(palabras));

        System.out.println("Cantidad de palabras únicas: " + unicas.size());

    }

}
