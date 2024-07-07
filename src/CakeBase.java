import com.google.gson.Gson;

import java.util.Scanner;

public class CakeBase {
    protected String name;
    protected String size;
    protected int quantity;
    protected String[] availableSizes = new String[100];
    protected double[] pricePerSize = new double[100];

    public CakeBase(String name, String size, int quantity, String[] availableSizes, double[] pricePerSize) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.availableSizes = availableSizes;
        this.pricePerSize = pricePerSize;
    }

    public CakeBase() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        for (String availableSize : availableSizes) {
            if (availableSize != null && availableSize.equals(size)) {
                this.size = size;
                return;
            }
        }
        throw new IllegalArgumentException("Kích thước không có sẵn");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Số lượng không hợp lệ");
        }
        this.quantity = quantity;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;
    }

    public double[] getPricePerSize() {
        return pricePerSize;
    }

    public void setPricePerSize(double[] pricePerSize) {
        this.pricePerSize = pricePerSize;
    }

    public double getPriceForSize(String size) {
        for (int i = 0; i < availableSizes.length; i++) {
            if (availableSizes[i] != null && availableSizes[i].equals(size)) {
                return pricePerSize[i];
            }
        }
        throw new IllegalArgumentException("Size not available");
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static CakeBase fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CakeBase.class);
    }
}