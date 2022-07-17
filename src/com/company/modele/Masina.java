package com.company.modele;

import com.company.comparatori.Exemplu;

public class Masina implements Comparable<Masina>, Exemplu {

    private int id;
    private String marca;
    private int an;
    private String culoare;

    public Masina(int id, String marca, int an, String culoare) {
        this.id = id;
        this.marca = marca;
        this.an = an;
        this.culoare = culoare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }


    @Override
    public String toString() {
        String text = "Id :" + this.id + "\n";
        text += "Marca : " + this.marca + "\n";
        text += "An : " + this.an + "\n";
        text += "Culoare : " + this.culoare + "\n";

        return text;
    }


    @Override
    public boolean equals(Object o) {
        return this.an== ((Masina) o).getAn();
    }



    @Override
    public int compareTo(Masina o) {
        if (this.an > o.getAn()) {
            return 1;
        } else if (this.an < o.getAn()) {
            return -1;
        } else {
            return 0;
        }
    }


}
