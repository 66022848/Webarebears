import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TeamA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Christian Era: ");
        int yearOfBirth = scanner.nextInt();

        System.out.print("Software Testing Score: ");
        int score = scanner.nextInt();

        int currentYear = 2018;
        int age = currentYear - yearOfBirth;

        String grade;
        if (score >= 80) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B+";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 65) {
            grade = "C+";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        try {
            FileWriter writer = new FileWriter("C:/Output/Textfile.txt");
            writer.write("Name : " + name + "\n");
            writer.write("Age : " + age + "\n");
            writer.write("Software Testing Grade : " + grade + "\n");
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }                               

        scanner.close();
    }
}
