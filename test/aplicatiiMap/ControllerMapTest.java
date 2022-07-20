package aplicatiiMap;

import com.company.controller.ControllerMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerMapTest {

    @Test
    public void controllerTest(){
        ControllerMap controllerMap=new ControllerMap();
        controllerMap.afisare("masina");
        controllerMap.showCars("Salajean","Sabina");
    }

}