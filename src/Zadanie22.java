import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        System.out.println("Podaj liczbę:");
        int podana = scanner.nextInt();
        if(podana>0) {
            for (int i = 1; i <= podana; i++) {
                liczba += i;
            }
        } else{
            System.out.println("Błędna liczba!");
        }
        System.out.println(liczba);
    }
}
