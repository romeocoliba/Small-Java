package com.company;

public class ContBancarExtins extends ContBancar{

    int dobinda;

    public ContBancarExtins(int suma, int dobinda) {
        super(suma);
        this.dobinda = dobinda;
    }

    public int getDobinda() {
        return dobinda;
    }

    public void setDobinda(int dobinda) { this.dobinda = dobinda;}

    public int procente() {
        int suma = getSuma();
        int r, x = dobinda; // procentele
        r = (suma / 100) * x;
        return r;
    }

    public void adaugaDobindaLunara() {
        int suma = getSuma();
        int r, x = dobinda; // procentele
        r = (suma / 100) * x;
        suma = suma + r;
        setSuma(suma);
    }

    public void afisare() {
        System.out.println("Utilizatorul are in cont: " + getSuma() + " lei");
        System.out.println("Dobinda lunara: " + procente() + " lei");
    }

}
