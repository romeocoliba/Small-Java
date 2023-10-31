import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner readerText = new Scanner(System.in);
        Scanner readerNum = new Scanner(System.in);

        System.out.println("Cati Studenti doriti sa introduceti ?");
        System.err.print("> ");
        int num = readerNum.nextInt();

        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println();
            System.out.print("Name : ");
            String name = readerText.nextLine();
            System.out.print("Surname : ");
            String surname = readerText.nextLine();
            System.out.print("Age : ");
            int age = readerNum.nextInt();
            System.out.print("Faculty : ");
            String faculty = readerText.nextLine();
            System.out.print("Number of Matrix : ");
            String num_matrix = readerText.nextLine();

            students[i] = new Student(name, surname, age, faculty, num_matrix);
        }

        int counter = 0;

        for (int i = 0; i < students.length; i++) {
            String currentName = students[i].getName();
            if (currentName.equals("Ion")) {
                counter++;
            }
        }

        System.out.println("Studenti cu numele Ion sunt : " + counter);

    }
}
