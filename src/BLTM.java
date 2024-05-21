import java.util.Scanner;

public class BLTM extends CakeBase {

    public BLTM(String name, String size, int quantity, String[] availableSizes, double[] pricePerSize) {
        super(name, size, quantity, new String[] {"Size S", "Size M", "Size L"}, new double[] {400000, 450000, 500000});
    }

    public void displayAvailableSizes() {
        System.out.println("Available BLTM sizes:");
        for (int i = 0; i < availableSizes.length; i++) {
            System.out.println("- " + availableSizes[i] + ": $" + pricePerSize[i]);
        }
    }

    public void chooseSize() {
        Scanner scanner = new Scanner(System.in);
        String chosenSize;
        boolean validSize = false;

        while (!validSize) {
            displayAvailableSizes(); // Sử dụng phương thức từ lớp cha
            System.out.print("Mời bạn chọn size bánh: ");
            chosenSize = scanner.nextLine();
            for (String size : availableSizes) {
                if (size.equalsIgnoreCase(chosenSize)) {
                    validSize = true;
                    break;
                }
            }
            if (!validSize) {
                System.out.println("Mời bạn chọn lại size");
            }
        }
        System.out.println("Bạn đã chọn size " + this.size);
        double price = getPriceForSize(this.size);
        System.out.println("Giá của size bạn đã chọn là : " + price);
    }
}
