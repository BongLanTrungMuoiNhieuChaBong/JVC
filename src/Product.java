import java.util.List;
import java.util.Scanner;

public class Product {
    private String name;
    private List<Size> sizes;


    public Product(String name, List<Size> sizes) {
        this.name = name;
        this.sizes = sizes;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
    public void displaySizesAndPrices() {
        System.out.println("Tên sản phẩm: " + name);
        for (Size size : sizes) {
            System.out.println("Size: " + size.getSize() + ", Giá: " + size.getPrice());
        }
    }
    String title;
    double pricee;
    String sizee;

    public Product(String title, double pricee, String sizee) {
        this.title = title;
        this.pricee = pricee;
        this.sizee = sizee;
    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPricee() {
        return pricee;
    }

    public void setPricee(double pricee) {
        this.pricee = pricee;
    }

    public String getSizee() {
        return sizee;
    }

    public void setSizee(String sizee) {
        this.sizee = sizee;
    }


}
