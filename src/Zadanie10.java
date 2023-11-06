import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            Scanner scanner = new Scanner(System.in);
            int liczba;
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextInt();
            System.out.println(liczba);
        }
    }
}
