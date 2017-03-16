package oop.intenetmarket.model.bill.impls;

import oop.intenetmarket.model.bill.intefaces.IBill;
import oop.intenetmarket.model.clients.impls.Clients;
import oop.intenetmarket.model.products.impls.Products;
import oop.intenetmarket.model.sell.impls.Sell;

/**
 * Created by Admin on 13.03.2017.
 */
public class Bill implements IBill{
    private Clients clients;
    private Products products;
    private Sell sell;
    private int idCodeBill;

    public Bill(Clients clients, Products products, Sell sell, int idCodeBill) {
        this.clients = clients;
        this.products = products;
        this.sell = sell;
        this.idCodeBill = idCodeBill;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Sell getSell() {
        return sell;
    }

    public void setSell(Sell sell) {
        this.sell = sell;
    }

    public int getIdCodeBill() {
        return idCodeBill;
    }

    public void setIdCodeBill(int idCodeBill) {
        this.idCodeBill = idCodeBill;
    }

    public boolean discont(){
        if(sell.getNumber()*products.getPriceProduct()>=5000){return true;}
        else {return false;}
    }

    public double summ(){
        if(discont()){
            return Math.round(0.98*sell.getNumber()*products.getPriceProduct());
        }
        else{
            return Math.round(sell.getNumber()*products.getPriceProduct());
        }
    }

    public String getInfo(){
        return "Id Code Bill: "+getIdCodeBill()+"\n"+
                clients.getInfo()+products.getInfo()+sell.getInfo()+"Regular client(Have 2% discont):"+discont()+"\n"+
                "-------------------------------------\n"+
                "Price bill: "+summ()+"\n"+
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";

    }
}
