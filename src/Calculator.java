public class Calculator {

    public static double addition(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public static double substraktion(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public static double multiplikation(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public static double division(double zahl1, double zahl2) {
        if (zahl2 == 0) {
            IO.println(" Division durch Null ist nicht möglich.");
            return 0;
        }
        return zahl1 / zahl2;
    }

}
