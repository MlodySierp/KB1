import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        System.out.println("Podaj liczbę:");
        liczba = scanner.nextInt();
        if(liczba==1){
            System.out.println("I");

        } else if (liczba==2) {
            System.out.println("II");
        } else if (liczba==3) {
            System.out.println("III");
        } else if (liczba==4) {
            System.out.println("IV");
        } else if (liczba==5) {
            System.out.println("V");
        }  else if (liczba==6) {
            System.out.println("VI");
        } else if (liczba==7) {
            System.out.println("VII");
        } else if (liczba==8) {
            System.out.println("VIII");
        } else if (liczba==9) {
            System.out.println("IX");
        } else if (liczba==10) {
            System.out.println("X");
        } else {
            System.out.println("Podałeś złą liczbę!");
        }
    }
}
