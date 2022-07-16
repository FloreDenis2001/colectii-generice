package listatest;

import com.company.colectii_impl.Lista;
import com.company.dictionare.Entry;
import com.company.dictionare.SimpleHashTable;
import com.company.modele.Masina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleHashTableTest {
    @Test
    public void testHashTable(){
        Masina x1=new Masina(0, "Audi", 2001, "alb");
        Masina x2=new Masina(13, "Mercedes", 2024, "verde");
        Masina x3=new Masina(2, "Skoda", 2021, "rosu");
        Masina x4=new Masina(3, "Opel", 2014, "negru");

        SimpleHashTable<String,Masina> hashTable= new SimpleHashTable<>();
        hashTable.put("Antonia",x4);
        hashTable.put("Denis",x2);
        hashTable.put("Razvan",x1);
        hashTable.put("Bogdan",x3);

//        System.out.println(hashTable.find("Denis"));
//        hashTable.afisare();
//        hashTable.delete("Antonia");
        System.out.println(hashTable.delete("Antonia"));

    }

}