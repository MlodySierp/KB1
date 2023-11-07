import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int liczba = random.nextInt(100)+1;
        int proby = 0;
        do{
            System.out.println("Podaj liczbę: ");
            int twojaliczba = scanner.nextInt();
            if (twojaliczba>liczba){
                System.out.println("Za duża liczba");
                proby += 1;
            } else if (twojaliczba<liczba) {
                System.out.println("Za mała liczba");
                proby += 1;
            } else{
                System.out.println("Zgadłeś!");
                proby += 1;
                System.out.println("Liczba prób: " + proby);
                break;
            }
        }while(true);
    }
}
