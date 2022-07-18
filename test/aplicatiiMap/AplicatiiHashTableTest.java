package aplicatiiMap;

import com.company.colectii_java.Map.AplicatiiHashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicatiiHashTableTest {
    @Test
    public void hashTableTest(){
        AplicatiiHashTable aplicatiiHashTable=new AplicatiiHashTable();
//        aplicatiiHashTable.afisareKey();
//        aplicatiiHashTable.afisareKeyIterator();
//        aplicatiiHashTable.afisareValueIterator();
        aplicatiiHashTable.afisare();
    }

}