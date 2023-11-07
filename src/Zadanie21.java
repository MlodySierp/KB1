import java.util.Random;
import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] kolory = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        String[] wylosowane = new String[10];
        int zgadniete=0;
        for(int i=0;i<10;i++){
            int randomowe = random.nextInt(kolory.length);
            wylosowane[i]=kolory[randomowe];
            System.out.println("Podaj wylosowany kolor: ");
            String twojwybor = scanner.next();
            if(twojwybor.equals(wylosowane[i])){
                System.out.println("Gratulacje zgadłeś");
                zgadniete += 1;
            } else{
                System.out.println("Niestety nie zgadłeś");
            }
        }
        System.out.println("Zgadłeś: " + zgadniete);
    }
}
