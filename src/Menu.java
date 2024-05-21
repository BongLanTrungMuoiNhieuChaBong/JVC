import java.util.Scanner;

public class Menu {
    Logic logic = new Logic();
    public void acount(){
        int acountChoice = new Scanner(System.in).nextInt();
        System.out.println("1. Kiểm tra số bánh tồn kho. ");
        System.out.println("2. Quản lý khách hàng. ");
        System.out.println("3. kiểm tra doanh thu. ");
        while (true){
            switch (acountChoice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }
    public void order(){
        System.out.println("-------Menu-------");
        System.out.println("1. Bông lan trứng muối");
        System.out.println("2. Bánh Cupcake");
        System.out.println("3. Bánh Muffin");
        System.out.println("4. Bánh Tiramisu");
        System.out.println("5. Bánh Cheesecake");
        System.out.println("6. Thoát ");
        int orderChoice = new Scanner(System.in).nextInt();
        while (true) {
            switch (orderChoice) {
                case 1:
                    logic.Bltm();
                    break;
                case 2:
                    logic.Cupcake();
                    break;
                case 3:
                    logic.Muffin();
                    break;
                case 4:
                    logic.Tiramisu();
                    break;
                case 5:
                    logic.Cheesecake();
                    break;
                case 6:
                    return;
            }
        }
    }
}
