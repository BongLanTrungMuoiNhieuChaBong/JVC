import java.util.Scanner;

public class Customer {
    Menu menu = new Menu();
    public void firt (){
        System.out.println("Tên khách hàng:");
        String name = new Scanner(System.in).nextLine();
        System.out.println(" Địa chỉ đặt hàng: ");
        String address = new Scanner(System.in).nextLine();
        System.out.println(" Số điện thoại người nhận:");
        int numphone = new Scanner(System.in).nextInt();
        System.out.println("Đăng nhập thành công. Chào mừng bạn đến với MIA Cake.");
        menu.order();
    }
}
