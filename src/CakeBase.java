import java.util.Scanner;

public class CakeBase {
    protected String name;
    protected String size;
    protected int quantity;
    protected String[] availableSizes;
    protected double[] pricePerSize;

    // Constructor
    public CakeBase(String name, String size, int quantity, String[] availableSizes, double[] pricePerSize) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.availableSizes = availableSizes;
        this.pricePerSize = pricePerSize;
    }
    public void chooseSize(String size) {
        this.size = size;
        System.out.println("Mời bạn chọn size: " + size);
        String size = new Scanner(System.in).nextLine();
    }
    public void chooseQuantity(int quantity) {
        System.out.println("Số lượng bạn cần mua: " + quantity);
        int quantity = new Scanner(System.in).nextInt();
    }

    public void displayAvailableSizes() {
        System.out.println("Available sizes for " + this.name + ":");
        for (int i = 0; i < availableSizes.length; i++) {
            System.out.println("- " + availableSizes[i] + ": $" + pricePerSize[i]);
        }
    }

    // Phương thức để lấy giá cho kích thước cụ thể
    public double getPriceForSize(String size) {
        for (int i = 0; i < availableSizes.length; i++) {
            if (availableSizes[i].equalsIgnoreCase(size)) {
                return pricePerSize[i];
            }
        }
        return -1; // Giá trị không hợp lệ nếu size không tồn tại
    }

    // Phương thức tính giá tổng
    public double calculateTotalPrice() {
        double pricePerUnit = getPriceForSize(this.size);
        return pricePerUnit * this.quantity;
    }
}