import java.util.Scanner;
public class Logic {
    BLTM bltm = new BLTM();
    public void Bltm(){
        Scanner scanner = new Scanner(System.in);
        String name = "Bông lan trứng muối";
        System.out.print("Mời bạn chọn size (S/M/L): ");
        String size = scanner.nextLine();
        System.out.print("Hãy chọn số lượng bạn muốn mua: ");
        int quantity = scanner.nextInt();
        double totalPrice = bltm.calculatePrice();
        System.out.println("Giá của " + quantity + " " + name + " size " + size + " là: " + totalPrice + " VND");
        scanner.close();
    }
    public void Cupcake(){

    }
    public void Cheesecake(){

    }
    public void Muffin(){

    }
    public void Tiramisu(){

    }
}
