import java.util.Scanner;
public class Rechner {

        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int auswahl = -1;
            while (auswahl != 0) {
                anzeigenMenu();
                auswahl = leseAuswahl();
                switch (auswahl) {
                    case 1: {
                        System.out.println("Erste Zahl eingeben:");
                        double zahl1 = leseZahl();
                        System.out.println("Zweite Zahl eingeben:");
                        double zahl2 = leseZahl();
                        double ergebnis = Calculator.addition(zahl1, zahl2);

                        System.out.println("Ergebnis: " + ergebnis);
                        break;
                    }
                    case 2: {
                        System.out.println("Erste Zahl eingeben:");
                        double zahl1 = leseZahl();
                        System.out.println("Zweite  Zahl eingeben:");
                        double zahl2 = leseZahl();
                        double ergebnis = Calculator.substraktion(zahl1, zahl2);

                        System.out.println("Ergebnis: " + ergebnis);
                        break;
                    }

                    case 3: {
                        System.out.println("Erste Zahl eingeben:");
                        double zahl1 = leseZahl();
                        System.out.println("Zweite  Zahl eingeben:");
                        double zahl2 = leseZahl();
                        double ergebnis = Calculator.multiplikation(zahl1, zahl2);

                        System.out.println("Ergebnis: " + ergebnis);
                        break;
                    }

                    case 4: {
                        System.out.println("Erste Zahl eingeben:");
                        double zahl1 = leseZahl();
                        System.out.println("Zweite  Zahl eingeben:");
                        double zahl2 = leseZahl();
                        double ergebnis = Calculator.division(zahl1, zahl2);

                        System.out.println("Ergebnis: " + ergebnis);
                        break;
                    }

                    case 0:
                        System.out.println("Programm beendet.");
                        break;
                    default:
                        System.out.println("Ungültige Auswahl!");

                }

            }
            scanner.close ();
        

        
    }

    public static void anzeigenMenu() {
        System.out.println("\n=== RECHNER ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraktion");
        System.out.println("3. Multiplikation");
        System.out.println("4. Division");
        System.out.println("0. Beenden");
        System.out.print("Auswahl: ");

    }

    public static int leseAuswahl() {
        int auswahl = scanner.nextInt();
        return auswahl;

    }

    public static double leseZahl() {
        double zahl = scanner.nextDouble();
        return zahl;

    }
}