package com.company.controller;

import com.company.modele.Masina;
import com.company.modele.Person;

import java.util.Hashtable;
import java.util.Map;

public class ControllerMap {
    private Map<Person, Masina> masinaMap;

    public ControllerMap() {
        masinaMap = new Hashtable<>();
        
    }
}
