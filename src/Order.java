import java.util.Scanner;

public class Order {
    Logic logic = new Logic();
    Menu menu = new Menu();
    public void menuOrder() {
        while (true) {
            menu.menuCake();
            int orderChoice = new Scanner(System.in).nextInt();
            switch (orderChoice) {
                case 1:

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
}
