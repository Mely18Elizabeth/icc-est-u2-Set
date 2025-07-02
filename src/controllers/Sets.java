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

    public static void runTreeSetConComparador() {
    Comparator<String> comparador = (s1, s2) -> {
        int cmp = Integer.compare(s2.length(), s1.length());
        return (cmp != 0) ? cmp : s2.compareTo(s1);
    };

    Set<String> palabras = new TreeSet<>(comparador);
    palabras.add("manzana"); 
    palabras.add("celular");  
    palabras.add("celulas");  
    palabras.add("laptop");   
    palabras.add("pera");    

    for (String palabra : palabras) {
        System.out.println(palabra);
    }
}

    public static void runTreeSetConComparadorAlfabetico() {
        Comparator<String> comparador = String::compareTo;

        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("laptop");
        palabras.add("manzana");
        palabras.add("pera");
        palabras.add("celular");
        palabras.add("celulas");
        palabras.add("laptop");
        palabras.add("laptop");
        palabras.add("pera");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
