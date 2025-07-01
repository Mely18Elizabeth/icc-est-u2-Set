package controllers;
import java.util.*;

public class Sets {

    private Sets() {}

    public static Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");

        return palabras;
    }

    public static void runHasSet() {
        Set<String> ejemploHashSet = construirHashSet();
        System.out.println("HashSet:");
        for (String palabra : ejemploHashSet) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");

        System.out.println("LinkedHashSet:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("laptop");
        palabras.add("pera");
        palabras.add("laptop");

        System.out.println("TreeSet:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
