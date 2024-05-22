import java.util.Scanner;

public class CakeBase {
    protected String name;
    protected String size;
    protected int quantity;
    protected String[] availableSizes = new String[100];
    protected double[] pricePerSize =  new double[100];

    public CakeBase(String name, String size, int quantity, String[] availableSizes, double[] pricePerSize) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.availableSizes = availableSizes;
        this.pricePerSize = pricePerSize;
    }

    public CakeBase() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }

    public double[] getPricePerSize() {
        return pricePerSize;
    }

    public void setPricePerSize(double[] pricePerSize) {
        this.pricePerSize = pricePerSize;
    }
    public void chooseSize(String size) {
        this.size = size;
        System.out.println("Mời bạn chọn size : " + size);
    }
    public double calculatePrice() {
        double price = 0;
        for (int i = 0; i < availableSizes.length; i++) {
            if (availableSizes[i].equalsIgnoreCase(size)) {
                price = pricePerSize[i];
                break;
            }
        }
        return price * quantity;
    }
    public void displaySizesAndPrices() {
        System.out.println("Kích thước và giá bạn đã chọn:");
        for (int i = 0; i < availableSizes.length; i++) {
            System.out.println(availableSizes[i] + ": " + pricePerSize[i] + " VND");
        }
    }
}