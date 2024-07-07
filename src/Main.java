import com.google.gson.Gson;

import java.util.*;
public class Main {
    private static Login login  = new Login();
    private static Customer customer = new Customer();
    List<Product> dataList = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
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
                    Customer customer1 = new Customer();
                    Gson gson = new Gson();
                    String json = gson.toJson(customer1);
                    break;
                case 3:
                    return;
            }
        }
    }

}
