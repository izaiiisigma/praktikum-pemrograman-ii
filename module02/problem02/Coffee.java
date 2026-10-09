package module02.problem02;

import java.util.Locale;

public class Coffee {
    private String name;
    private String size;
    private double price;
    private String customer;

    public void printInfo() {
        Locale.setDefault(Locale.US);

        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTax() {
        double taxRate = 0.11;
        return price * taxRate;
    }
}