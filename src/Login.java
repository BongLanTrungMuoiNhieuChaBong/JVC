import java.util.Arrays;
import java.util.Scanner;

public class Login {
    Acount acount = new Acount();
    Logic logic = new Logic();
    public void firt(){
        BLTM bltm = new BLTM();
        Logic logic1 = new Logic();
        logic1.Bltm11();
        System.out.println(Arrays.toString(bltm.pricePerSize));
        System.out.println(Arrays.toString(bltm.availableSizes));
        acount.input();
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Nhập tên đăng nhập:");
            String nameAccount = scanner.nextLine();
            System.out.println("Nhập mật khẩu:");
            String passAccount = scanner.nextLine();
            while (true) {
            if (nameAccount.equals(acount.getUsername()) && passAccount.equals(acount.getPassWord())) {
                System.out.println("Đăng nhập thành công. Chào mừng bạn đến với MIA CAKE!");
                logic.account();
                break;
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng, mời bạn nhập lại.");
            }
            break;
        }
    }
}

