import controllers.ContactoController;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------HashSet---------");
        Sets.runHasSet();

        System.out.println("------------LinkedHashSet-------------");
        Sets.runLinkedHashSet();

        System.out.println("-----------TreeSet natural--------------");
        Sets.runTreeSet();

        System.out.println("------------TreeSet con Comparador de longitud-----------");
        Sets.runTreeSetConComparador();

        System.out.println("-------TreeSet comparador alfabético-------");
        Sets.runTreeSetConComparadorAlfabetico();

        System.out.println("-------------------");
        ContactoController contactoController = new ContactoController();
        System.out.println("numero---------------");
        contactoController.runTreeContactoNumero();

    }
}
