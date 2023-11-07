import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> lista = new Vector<Integer>();
        do{
            System.out.println("Podaj liczbę: ");
            int podana = scanner.nextInt();
            if(podana!=-99){
                System.out.println(podana);
                lista.add(podana);
            } else {

                break;
            }
        }while(true);
        System.out.println(lista);
        int najwieksza = Collections.max(lista);
        int najmniejsza = Collections.min(lista);
        System.out.println("Najwieksza liczba to: " + najwieksza + "\n" + "Najmniejsza liczba to: " + najmniejsza);
    }
}