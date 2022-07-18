package aplicatiiSetTest;

import com.company.colectii_java.Set.AplicatiiHashSet;
import com.company.colectii_java.Set.AplicatiiSet;
import com.company.modele.Masina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicatiiHashSetTest {

    @Test
    public void hashSetTest(){

        AplicatiiHashSet aplicatiiHashSet=new AplicatiiHashSet();
        Masina t =new Masina(3, "Opel", 2039, "rosu");
        aplicatiiHashSet.removeCar(t);
        aplicatiiHashSet.afisare();
    }

}