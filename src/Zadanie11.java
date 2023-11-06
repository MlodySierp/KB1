import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ponownie;
        System.out.println("Czy wykonać operację?");
        ponownie = scanner.next();
        do {
            if (ponownie.equals("tak")) {
                int liczba1;
                System.out.println("Podaj liczbę:");
                liczba1 = scanner.nextInt();
                int liczba2;
                System.out.println("Podaj liczbę:");
                liczba2 = scanner.nextInt();
                int dodawanie = liczba1 + liczba2;
                System.out.println("Wynik to " + dodawanie);
                System.out.println("Wykonać ponownie?");
                ponownie = scanner.next();
            } else { break;}

        }while(ponownie.equals("tak"));
    }
}
