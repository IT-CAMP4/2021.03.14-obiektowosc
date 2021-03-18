public class Main {
    public static void main(String[] args) {
        String s = "ABC";
        int i = 1;
        boolean b = true;
        int[] tab = new int[10];

        Customer mojKlient;
        mojKlient = new Customer();


        Customer mojInnyKlient = new Customer();

        mojKlient.name = "Mateusz";
        mojKlient.surname = "Bereda";
        mojKlient.age = 30;
        mojKlient.pesel = 123123123123L;

        mojInnyKlient.name = "Jan";
        mojInnyKlient.surname = "Kowalski";
        mojInnyKlient.age = 40;
        mojInnyKlient.pesel = 2345234234234L;

        mojKlient.mow();
        mojInnyKlient.mow();

        boolean wynik = mojKlient.isLargerThanTen(11);
        System.out.println(wynik);

        KlasaPostaci mag = new KlasaPostaci();
        mag.sila = 5;
        mag.hp = 100;
        mag.mana = 500;
        mag.nazwa = "Mag";
        mag.zrecznosc = 7;

        KlasaPostaci barbarian = new KlasaPostaci();
        barbarian.nazwa = "asdf";

        System.out.println(mojKlient.dodaj(3.5, 6.7));
        System.out.println(mojKlient.dodaj(5, 4));

        mojKlient.dodaj("abc");

        System.out.println(mojKlient.dodaj(3.5, 6.7));

        mojKlient.dodaj(0.5, 5, 5);
        mojKlient.dodaj(5, 0.5, 5);

        mojKlient.dodaj(5.4, 4);

        System.out.println(barbarian);
    }
}
