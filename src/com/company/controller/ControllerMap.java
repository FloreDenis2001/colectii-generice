package com.company.controller;

import com.company.modele.Masina;
import com.company.modele.Person;

import java.io.File;
import java.util.*;

public class ControllerMap {
    private Map<Person, List<Masina>> masinaMap;
    private List<Person> personList;
    private List<Masina> masinaList;

    public ControllerMap() {
        masinaMap = new Hashtable<>();
        personList = new ArrayList<>();
        masinaList = new ArrayList<>();
        this.load("C:\\Users\\flore\\Desktop\\mycode\\colectii-generice\\src\\com\\company\\res\\masina", "masina");
        this.load("C:\\Users\\flore\\Desktop\\mycode\\colectii-generice\\src\\com\\company\\res\\person", "person");
        this.populateTable();
    }


    public void load(String path, String name) {

        try {
            File f = new File(path);
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                switch (name) {
                    case "person":
                        Person x = new Person(text);
                        personList.add(x);
                        break;

                    case "masina":
                        Masina t = new Masina(text);
                        masinaList.add(t);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void populateTable() {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            List<Masina> masinas = new ArrayList<>();
            for (int j = 0; j < masinaList.size(); j++) {
                if (person.getId() == masinaList.get(j).getPersonId()) {
                    Masina x = masinaList.get(j);
                    masinas.add(x);
                }
            }
            this.masinaMap.put(person, masinas);
        }
    }

    public void afisare(String name) {
        switch (name) {
            case "masina":
                for (Masina x : masinaList) {
                    System.out.println(x);
                }
                break;
            case "person":
                for (Person x : personList) {
                    System.out.println(x);
                }
                break;
        }
    }


    public void showCars(String nume,String prenume){
        List<Masina> carList=this.masinaMap.get(new Person(nume,prenume));
        for(Masina x : carList){
            System.out.println(x);
        }
    }


    public void addCar(String nume,String prenume,Masina t){
        Person x = new Person(nume,prenume);
        List<Masina> carList=this.masinaMap.get(x);
        carList.add(t);
    }

    public void update(int masinaId,String nume,String prenume,String updateCuloare){
        Person t = new Person(nume,prenume);
        List<Masina> carList=this.masinaMap.get(t);
        for(int i=0;i<carList.size();i++){
            if(masinaId==carList.get(i).getId()){
                carList.get(i).setCuloare(updateCuloare);
            }
        }
    }




}
