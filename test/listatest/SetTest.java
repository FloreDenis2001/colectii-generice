package listatest;

import com.company.colectii_impl.Set;
import com.company.modele.Masina;
import org.junit.jupiter.api.Test;

class SetTest {

    @Test
    public void setTest(){
        Set<Masina> masinaSet = new Set<>();
        masinaSet.addList(new Masina(0, "Audi", 2013, "alb"));
        masinaSet.addList(new Masina(20, "Bugatti", 2022, "negru"));
        masinaSet.addList(new Masina(30, "Volvo", 2007, "verde"));
        masinaSet.addList(new Masina(14, "Dacia", 2016, "galben"));
        masinaSet.addList(new Masina(2, "Mercedes", 2021, "rosu"));

        System.out.println("///////////////////////////");
        masinaSet.addPozitie(0,new Masina(100, "BMW", 2021, "rosu"));
        masinaSet.addSfarsit(new Masina(200, "Alfa Romeo", 2015, "verde"));
        System.out.println(masinaSet.pozitieAdaugareObiect(new Masina(200, "Alfa Romeo",2008, "verde")));
        masinaSet.afisare();
    }

}