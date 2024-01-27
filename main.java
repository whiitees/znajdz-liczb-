import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbe {

    public static void main(String[] args) {
        zgadnijLiczbe();
    }

    public static void zgadnijLiczbe() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int wylosowanaLiczba = random.nextInt(10) + 1;

        while (true) {
            System.out.print("Zgadnij liczbę od 1 do 10: ");
            int odpowiedz = scanner.nextInt();

            if (odpowiedz == wylosowanaLiczba) {
                System.out.println("Brawo! Zgadłeś!");
                break;
            } else {
                System.out.println("Nieprawidłowa liczba. Spróbuj ponownie.");
            }
        }
    }
}
