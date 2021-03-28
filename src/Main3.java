public class Main3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Kwadrat k1 = new Kwadrat(5);
        Kwadrat k2 = new Kwadrat(5);

        System.out.println("Kwadrat pierwszy:");
        System.out.println(k1.bok);
        System.out.println(k1.pole);
        System.out.println(k1.obw);

        System.out.println("Kwadrat drugi:");
        System.out.println(k2.bok);
        System.out.println(k2.pole);
        System.out.println(k2.obw);

        k1.uzupelnijDane(3);
        k2.uzupelnijDane(5);
        Kwadrat kopia = k1.copy();
        System.out.println(k1 == k2);

        Kwadrat k3 = new Kwadrat(5);
        Kwadrat k4 = k3;

        System.out.println(k3 == k4);

        String s1 = "Mateusz";
        String s2 = new String("Mateusz");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(k1.equals(k2));
    }
}
