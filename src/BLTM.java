import java.util.Scanner;

public class BLTM extends CakeBase {
    public BLTM(String name, String size, int quantity) {
        super(name, size, quantity, new String[] {"Size S", "Size M", "Size L"}, new double[] {400000, 450000, 500000});
    }
    public BLTM() {
    }
    public void chooseSize(String size) {
        super.chooseSize(size);
        System.out.println("Size bạn đã chọn: " + size);
    }
}
