package module02.problem01;

public class Fruit {
    private final double pricePerKg;
    private final String nameFruit;
    private final double weight;
    private final double priceFruit;
    private final double purchaseTotal;


    public Fruit(String nameFruit, double weight, double priceFruit, double purchaseTotal) {
        this.nameFruit = nameFruit;
        this.weight = weight;
        this.priceFruit = priceFruit;
        this.purchaseTotal = purchaseTotal;
        this.pricePerKg = this.priceFruit / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + nameFruit);
        System.out.println("Berat: " + weight + "kg");
        System.out.println("Harga: Rp " + priceFruit);
        System.out.println("Jumlah Beli: " + purchaseTotal + "kg");
        System.out.println("Harga Sebelum Diskon: Rp " + this.getPreDiscountPrice());
        System.out.println("Total Diskon : Rp " + this.getDiscountTotal());
        System.out.println("Harga Setelah Diskon  : Rp " + this.getPostDiscountPrice());
        System.out.println("");
    }
    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPreDiscountPrice() {

        return priceFruit / weight * this.purchaseTotal;
    }

    public double getPostDiscountPrice() {

        return getPreDiscountPrice() - getDiscountTotal();
    }
}