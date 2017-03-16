package oop.intenetmarket.model.products.impls;

import oop.intenetmarket.model.products.interfaces.IProducts;

/**
 * Created by Admin on 13.03.2017.
 */
public abstract class Products implements IProducts {
    // Товари (Код товару, Назва, Ціна, Одиниця виміру).
    private int codeProduct;
    private String nameProduct;
    private double priceProduct;

    public Products() {
    }

    public Products(int codeProduct, String nameProduct, double priceProduct) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getInfo(){
        return "Code Product: "+getCodeProduct()+"\n"+
        "Name Product: "+getNameProduct()+"\n"+
        "Price Product: "+getPriceProduct()+"\n";
    }
}
