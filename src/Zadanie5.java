import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dlugosc_rzedu;
        int okratowanie;
        int odstep;
        System.out.println("Podaj długość rzędu w metrach: ");
        dlugosc_rzedu = scanner.nextInt();
        System.out.println("Podaj ilośc miejsca zajmowanego przez okratowanie: ");
        okratowanie = scanner.nextInt();
        System.out.println("Podaj odległość między sadzonkami w metrach:");
        odstep = scanner.nextInt();
        double liczba_sadzonek = (dlugosc_rzedu-2*okratowanie)/odstep;
        System.out.println(liczba_sadzonek);
    }
}
