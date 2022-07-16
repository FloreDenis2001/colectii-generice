package listatest;

import com.company.dictionare.HashTable;
import com.company.modele.Masina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {
    @Test
    public void hashTableTest() {
        Masina x1 = new Masina(0, "Audi", 2001, "alb");
        Masina x2 = new Masina(13, "Mercedes", 2024, "verde");
        Masina x3 = new Masina(2, "Skoda", 2021, "rosu");
        Masina x4 = new Masina(3, "Opel", 2014, "negru");

        HashTable<String, Masina> hashTable = new HashTable<>();
        hashTable.put("Denis", x2);
        hashTable.put("Razvan", x3);
        hashTable.put("Bogdan", x1);
        hashTable.put("Marian", x4);

        System.out.println(hashTable.find("Razvan"));
//        hashTable.remove("Denis");
//        hashTable.print();

//        System.out.println( hashTable.get("Denis"));
    }
}