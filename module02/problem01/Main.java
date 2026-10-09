package module02.problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 0.4, 7000, 40);
        Fruit mango = new Fruit("mangga", 0.2, 3500, 15);
        Fruit avocado = new Fruit("alpukat", 0.25, 10000, 12);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}