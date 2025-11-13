import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pralka pralka = new Pralka();
        Odkurzacz odkurzacz = new Odkurzacz();
        Scanner scanner = new Scanner(System.in);
        Bazowa bazowa = new Bazowa();

        System.out.println("Podaj numer prania 1 do 12");
        int n = scanner.nextInt();
        pralka.program(n);
        if (n >= 1 && n <= 12){
            System.out.println("Program został ustawiony");
        }
        else {
            System.out.println("Podano niepoprawny numer programu");
        }
        odkurzacz.on();
        odkurzacz.on();
        odkurzacz.on();
        bazowa.wyswietl("Odkurzacz wyładował się");
        odkurzacz.off();


    }
}