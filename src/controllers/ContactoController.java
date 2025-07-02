package controllers;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparadorNumero;
import utils.ContactoComparator;

public class ContactoController {

    public ContactoController() {
        runTreeContacto();
    }

    private void runTreeContacto() {
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());
        

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public void runTreeContactoNumero() {
        Set<Contacto> contactosNumero = new TreeSet<>(new ContactoComparadorNumero());
        

        contactosNumero.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactosNumero.add(new Contacto("Luis", "Perez", "111111111"));
        contactosNumero.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactosNumero.add(new Contacto("Ana", "Perez", "987654321"));
        contactosNumero.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactosNumero.add(new Contacto("Pedro", "Lopez", "222222222"));
        for (Contacto contacto : contactosNumero) {
            System.out.println(contacto);
        }
    }
}
