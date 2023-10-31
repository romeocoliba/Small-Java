package com.company;

public class ContBancar {
    private int suma;

    public ContBancar(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) { this.suma = suma;}

    public void adauga(int x) {
       x = suma + x;
       this.suma = x;
    }

    public void extrage(int x) {
        if(suma>=x) {
            x = suma - x;
            this.suma = x;
        } else {
            System.out.println("Eroare: Nu aveti suficienti bani in cont!");
        }
    }

    public void afisare() {
        System.out.println("Utilizatorul are in cont: " + getSuma() + " lei");
    }
}
