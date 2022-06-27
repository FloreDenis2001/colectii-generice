package listatest;

import com.company.colectii_impl.Lista;
import com.company.comparatori.ComparatorCuloare;
import com.company.comparatori.ComparatorId;
import com.company.comparatori.ComparatorMarca;
import com.company.comparatori.ComparatorNume;
import com.company.modele.Masina;
import com.company.modele.Person;
import org.junit.jupiter.api.Test;

class ListaTest {

    @Test
    public void listatest() {
        Lista<Masina> masini = new Lista<>();
        masini.add(new Masina(0, "Audi", 2001, "alb"));
        masini.add(new Masina(13, "Mercedes", 2024, "verde"));
        masini.add(new Masina(2, "Skoda", 2021, "rosu"));
        masini.add(new Masina(3, "Opel", 2014, "negru"));

        Lista<Person> persons = new Lista<>();
        persons.add(new Person(3, "Flore", "Denis", 20, "075442151"));
        persons.add(new Person(2, "Pop", "Razvan", 74, "079951231"));
        persons.add(new Person(1, "Ake", "Tomi", 17, "0755112156"));
        persons.add(new Person(0, "Tocaci", "Raul", 42, "076122415"));


//        persons.afisareLista();
//        masini.afisareLista();
//        persons.erase(0);
//        persons.add(0,new Person(42, "Tass", "Tailor", 32, "076122415"));
//         persons.erase(new Person(2, "Pop", "Razvan", 74, "079951231"));
//        System.out.println(persons.findposition(new Person(1, "Pop", "Razvan", 74, "079951231")));
//        System.out.println(persons.get(3));
//        persons.set(3,new Person(100, "Pop", "Razvan", 74, "079951231"));

//        System.out.println( persons.sizeList());
//        masini.sortList();
//        System.out.println(masini.getMaxim());
//        System.out.println(persons.getMaxim());
//        masini.sortList(new ComparatorMarca());
//        masini.sortList(new ComparatorCuloare());
//        System.out.println(persons.getMinim());
//        System.out.println(masini.getMinim());
//        masini.sortList(new ComparatorId<>());
//        persons.sortList(new ComparatorId<>());
        persons.sortList(new ComparatorNume());
        persons.afisareLista();
//       masini.afisareLista();


    }

}