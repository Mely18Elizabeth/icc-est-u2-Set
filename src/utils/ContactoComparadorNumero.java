package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparadorNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // Primero: comparar por apellido en orden alfabético
        int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        // Segundo: comparar por nombre en orden alfabético
        int comparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        // Tercero: comparar por número en orden DESCENDENTE
        return o2.getTelefono().compareTo(o1.getTelefono());
    }
}
