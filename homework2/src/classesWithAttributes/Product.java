/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesWithAttributes;

/**
 *
 * @author eray_
 */
public class Product {

    public Product() {
        System.out.println("Ürün oluşturuldu");
    }

    private int id;
    private String name;
    private String renk;

    public Product(int id, String name, String renk, String description, double price, int stockAmount) {
        System.out.println("Ürün oluşturuldu");
        this.id = id;
        this.name = name;
        this.renk = renk;
        this.kod = kod;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    private String kod;
    private String description;
    private double price;
    private int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + this.id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

}
