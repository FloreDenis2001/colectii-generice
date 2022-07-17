package colectii_java_test;

import com.company.colectii_java.List.AplicatiiList;
import com.company.modele.Masina;
import org.junit.jupiter.api.Test;

class AplicatiiListTest {

    @Test
    public void runTest() {
        Masina x = new Masina(10, "Ferrari", 2016, "rosu");
        AplicatiiList aplicatiiList = new AplicatiiList();
//        aplicatiiList.afisareIterable();
//       Masina x = aplicatiiList.ceaMaiNouaMasinaIterable();
//        System.out.println(x);
//        Masina t =aplicatiiList.penultimaCeeaMaiMare();
//        System.out.println(t);
//        System.out.println(aplicatiiList.pozitieByMarca("Audi"));
        aplicatiiList.addSfarsit(x);
        aplicatiiList.removeByMarca("Audi");
        aplicatiiList.afisareIterable();
    }

}