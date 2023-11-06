import java.util.Random;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int saldo=0;
        do{
            System.out.println("Podaj kwote wejsciowa");
            int kwota = scanner.nextInt();
            if (kwota<=0){
                System.out.println("Podaj kwote wieksza od zera");
                continue;
            }

            String[] pola = {"Wiśnie", "Pomarańcze", "Śliwki", "Dzwonki", "Melony", "Bary"};
            String[] wylosowane = new String[3];
            for(int i=0;i<3;i++){
                int randomowe = random.nextInt(pola.length);
                wylosowane[i]=pola[randomowe];
                System.out.println(wylosowane[i] + " ");
            }
            System.out.println();
            if(wylosowane[0].equals(wylosowane[1]) && wylosowane[1].equals(wylosowane[2])){
                int wygrana = kwota*3;
                saldo+=wygrana;
                System.out.println("Gratulacje wygrałeś " + wygrana + " złotych");
            } else if (wylosowane[0].equals(wylosowane[1]) || wylosowane[1].equals(wylosowane[2]) || wylosowane[0].equals(wylosowane[2])) {
                int wygrana=kwota*2;
                saldo+=wygrana;
                System.out.println("Gratulacje wygrałeś " + wygrana + " złotych");
            } else {
                System.out.println("Niestety przegrałeś");
            }
            System.out.println("Obecnie masz " + saldo + " złotych");
            System.out.println("Grasz ponownie?");
            String ponownie = scanner.next();
            if(!ponownie.equalsIgnoreCase("tak")){
                break;
            }
        }while(true);
        System.out.println("Dziękujemy za grę twoje saldo wynosi " + saldo + " złotych");



    }
}

