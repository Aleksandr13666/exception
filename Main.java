import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello and welcome! Напишите свои Ф.И.О., " +
                "дату рождения, номер телефона и пол, разделяя пробелом. Пример Ф И О 12131989 8916916916 М");
        int birth;
        long number;

        String surname = sc.next();
        System.out.println("Фамилия: " + surname);
        String name = sc.next();
        System.out.println("Имя: " + name);
        String pname = sc.next();
        System.out.println("Отчество: " + pname);
        try {
            birth = sc.nextInt();
            System.out.println("Дата рождения: " + birth);
        } catch (InputMismatchException e) {
            System.out.println("неверный формат возраста.");
            return;
        }
        try {
            number = sc.nextLong();
            System.out.println("номер телефона: " + number);
        } catch (InputMismatchException e) {
            System.out.println("неверный формат номера телефона.");
            return;
        }

        String gender = sc.next();
        System.out.println("Пол: " + gender);
        try {
            String myFile = (surname + ".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
            writer.write("Фамилия: " + surname + " Имя: " + name + " Отчество: " + pname + " Дата_рождения: " + birth + " Номер_телефона: " + number + " Пол: " + gender);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}