import java.util.Scanner;
public class Main {
    public static int adunare(int a,int b) {
        return a + b;
    }
    public static int scadere(int a,int b) {
        return a - b;
    }
    public static int inmultire(int a,int b) {
        return a * b;
    }
    public static int impartire(int a,int b) {
        return a / b;
    }

    public static void main(String[] args) {
        operatii ob1 = new operatii();
        operatii ob2 = new operatii();

        ob1.initializare(100,250);
        System.out.println("|| Adunarea ob1: " + adunare(ob1.a,ob1.b));
        System.out.println("|| Scaderea ob1: " + scadere(ob1.a,ob1.b));
        System.out.println("|| Inmultirea ob1: " + inmultire(ob1.a,ob1.b));
        System.out.println("|| Impartirea ob1: " + impartire(ob1.a,ob1.b));

        ob2.initializare(349, 820);
        System.out.println("|| Adunare ob2: " + adunare(ob2.a,ob2.b));
        System.out.println("|| Scadere ob2: " + scadere(ob2.a, ob2.b));
        System.out.println("|| Inmultire ob2: " + inmultire(ob2.a, ob2.b));
        System.out.println("|| Impartire ob2: " + impartire(ob2.a, ob2.b));
    }
}