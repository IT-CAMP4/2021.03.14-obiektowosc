public class Customer {
    String name;
    String surname;
    int age;
    long pesel;



    void mow() {
        System.out.println("Mówię !!");
    }

    int dodaj(int skaldnikPierwszy, int skladnikDrugi) {
        int wynik = skaldnikPierwszy + skladnikDrugi;
        return wynik;
    }

    double dodaj(double a, double b) {
        return a + b;
    }

    void dodaj() {

    }

    void dodaj(double a, int b, int c) {

    }

    void dodaj(int a, double b, int c) {

    }

    void dodaj(int a, double b) {

    }

    void dodaj(String a) {

    }

    boolean isLargerThanTen(int liczba) {
        if(liczba > 10) {
            return true;
        } else {
            return false;
        }
    }
}
