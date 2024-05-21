import java.util.*;
public class Main {
    private static Login login  = new Login();
    private static Customer customer = new Customer();
    public static void main(String[] args) {
        while (true) {
            System.out.println(" 1. ĐĂNG NHẬP");
            System.out.println(" 2. ĐĂT HÀNG");
            int firtchoice = new Scanner(System.in).nextInt();
            switch (firtchoice) {
                case 1:
                    login.firt();
                    break;
                case 2:
                    customer.firt();
                    break;
                case 3:
                    return;
            }
        }
    }
}
