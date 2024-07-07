import java.util.Scanner;

public class Order {
    Logic logic = new Logic();
    Menu menu = new Menu();
    BLTM bltm = new BLTM();

    public void menuOrder() {
        while (true) {
            menu.menuCake();
            int orderChoice = new Scanner(System.in).nextInt();
            switch (orderChoice) {
                case 1:
                    orderBltm();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
            }
        }
    }
    public void orderBltm(){

        System.out.println(" Mời bạn chọn size bánh:");
        System.out.println();
    }
}
