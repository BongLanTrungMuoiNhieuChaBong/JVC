import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Logic {
    Menu menu = new Menu();

    Cupcake cupcake = new Cupcake();
    Cheesecake cheesecake = new Cheesecake();
    Tiramisu tiramisu = new Tiramisu();
    Muffin muffin = new Muffin();
//    List<Product> products = new ArrayList<>();

    public void order() {
        while (true) {
            menu.menuCake();
            int orderChoice = new Scanner(System.in).nextInt();
            switch (orderChoice) {
                case 1:
                    Bltm();
                    break;
                case 2:
                    Cupcake();
                    break;
                case 3:
                    Muffin();
                    break;
                case 4:
                    Tiramisu();
                    break;
                case 5:
                    Cheesecake();
                    break;
                case 6:
                    return;
            }
        }
    }

    public void Bltm() {
        BLTM bltm = new BLTM();
        bltm.setName("Bông lan trứng muối");
        bltm.setAvailableSizes(new String[]{"Size S", "Size M", "Size L"});
        bltm.setPricePerSize(new double[]{400000, 450000, 500000});

    }

    public void Cupcake() {
        cupcake.setName(" Cupcake");
        cupcake.setAvailableSizes(new String[]{"Size S", "Size M", "Size L"});
        cupcake.setPricePerSize(new double[]{350000, 450000, 550000});
    }

    public void Cheesecake() {
        cheesecake.setName(" Cheesecake");
        cheesecake.setAvailableSizes(new String[]{"Size S", "Size M", "Size L"});
        cheesecake.setPricePerSize(new double[]{399000, 499000, 599000});
    }

    public void Muffin() {
        muffin.setName("Muffin");
        muffin.setAvailableSizes(new String[]{"Size S", "Size M", "Size L"});
        muffin.setPricePerSize(new double[]{359000, 459000, 559000});
    }

    public void Tiramisu() {
        tiramisu.setName(" Tiramisu");
        tiramisu.setAvailableSizes(new String[]{"Size S", "Size M", "Size L"});
        tiramisu.setPricePerSize(new double[]{259000, 459000, 659000});

    }

    public void account() {
        menu.menuAcount();
        int acountChoice = new Scanner(System.in).nextInt();
        while (true) {
            switch (acountChoice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    menu.menuCake();
                    break;
                case 3:
//                    listOfPproducts();
                    break;
                case 4:
                    return;
            }
        }
    }

    public void addProduct() {

        Scanner scanner = new Scanner(System.in);
        String continueInput = "yes";  // Start the loop by default
        try {
            while (!continueInput.equalsIgnoreCase("no")) {
                System.out.print("Nhập số lượng sản phẩm: ");
                int productCount = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < productCount; i++) {
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    List<Size> sizes = new ArrayList<>();
                    System.out.print("Nhập số lượng size cho sản phẩm: ");
                    int sizeCount = scanner.nextInt();
                    scanner.nextLine();
                    for (int j = 0; j < sizeCount; j++) {
                        System.out.print("Nhập size sản phẩm: ");
                        String size = scanner.nextLine();
                        System.out.print("Nhập giá cho size này: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        sizes.add(new Size(size, price));
                    }
                }
                System.out.print("Bạn có muốn nhập thêm sản phẩm mới không? (yes/no): ");
                continueInput = scanner.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}
