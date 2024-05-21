import java.util.Scanner;

public class Login {
    Menu menu = new Menu();
    Acount acount = new Acount();
    public void firt(){
//        Scanner scanner = new Scanner(System.in);
        acount.input();
        boolean loggedIn = false;
        do{
            System.out.println("Nhập tên đăng nhập: ");
            String nameAcount = new Scanner(System.in).nextLine();
            System.out.println(" Nhập mật khẩu: ");
            String passAcount = new Scanner(System.in).nextLine();
            if (nameAcount.equals(acount.getUsername()) && passAcount.equals(acount.getPassWord())) {
                System.out.println("Đăng nhập thành công. Chào mừng bạn đến vơi MIA CAKE!");
                menu.acount();
            } else {
                System.out.println(" Tên đăng nhập hoặc mật khẩu không đúng, mời bạn nhập lại.");
            }
        }while(true);
    }

}
