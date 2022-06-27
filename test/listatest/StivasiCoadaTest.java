package listatest;

import com.company.modele.Masina;
import com.company.colectii_impl.Coada;
import com.company.colectii_impl.Stiva;
import org.junit.jupiter.api.Test;

class StivasiCoadaTest {
    @Test
    public void testLifo() {
        Stiva<Masina> masini = new Stiva<>();
        masini.push(new Masina(0, "Audi", 2001, "alb"));
        masini.push(new Masina(13, "Mercedes", 2024, "verde"));
        masini.push(new Masina(2, "Skoda", 2021, "rosu"));
        masini.push(new Masina(3, "Opel", 2014, "negru"));
        masini.push(new Masina(4, "Opel", 2014, "negru"));

        System.out.println(masini.pop().getData());
        System.out.println("///////////////////////////");
        System.out.println(masini.pop().getData());
        System.out.println("///////////////////////////");
        masini.afisare();
    }

    @Test
    public void testFifo(){
        Coada<Masina> masini = new Coada<>();
        masini.enqueue(new Masina(0, "Audi", 2001, "alb"));
//        masini.enqueue(new Masina(13, "Mercedes", 2024, "verde"));
//        masini.enqueue(new Masina(2, "Skoda", 2021, "rosu"));
//        masini.enqueue(new Masina(3, "Opel", 2014, "negru"));
//        masini.enqueue(new Masina(4, "Opel", 2014, "negru"));

//        System.out.println(masini.dequeue().getData());
//        System.out.println(masini.dequeue().getData());
        System.out.println(masini.dequeue().getData());
        System.out.println("///////////////////////////");
        masini.afisare();
    }
}