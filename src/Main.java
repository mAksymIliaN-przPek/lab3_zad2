import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaDodatnich = 0;
        int sumaUjemnych = 0;
        int iloscDodatnich = 0;
        int iloscUjemnych = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Podaj liczbę " + i + ": ");
            int liczba = scanner.nextInt();
            if (liczba >= 0) {
                sumaDodatnich += liczba;
                iloscDodatnich++;
            } else {
                sumaUjemnych += liczba;
                iloscUjemnych++;
            }
        }
        System.out.println("Liczba dodatnich: " + iloscDodatnich);
        System.out.println("Suma dodatnich: " + sumaDodatnich);
        System.out.println("Liczba ujemnych: " + iloscUjemnych);
        System.out.println("Suma ujemnych: " + sumaUjemnych);
    }
}