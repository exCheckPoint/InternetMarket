package oop.intenetmarket.model;

import oop.intenetmarket.model.bill.impls.Bill;
import oop.intenetmarket.model.bill.impls.Bills;
import oop.intenetmarket.model.clients.impls.Clients;
import oop.intenetmarket.model.products.impls.*;
import oop.intenetmarket.model.sell.impls.Sell;

import java.util.ArrayList;

/**
 * Created by Admin on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList bills = new ArrayList();
        //clients
        Clients vova = new Clients(1,"Sydorovych","Vova","Valeriyovych","Chernivtsi","+3806257523","excheckpoint@gmail.com");
        Clients stas = new Clients(2,"Verbisliy","Stanislav","Anatoliyovych","Kremenets'","+380634852749","stasverb@mail.ru");
        Clients andriy = new Clients(3,"Perepelytsya","Andriy","Bat'kovych","Chernivtsi","+380673977402","andrperep@yahoo.com");
        Clients bogdan = new Clients(4,"Pupkin","Bogdan","Petrovych","L'viv","+380992863745","pupkin@rambler.ru");
        Clients katya = new Clients(5,"Ivanova","Kateryna","Ivanivna","Kiev","+380671239543","Katyuha@abs.com");
        //products
        Headphone kingston = new Headphone(1, "Kingston Hyper X", 1199);
        Laptop acer = new Laptop(2,"Acer Aspire A15",9999);
        Phone iphone = new Phone(3,"Apple iPhone 5",4499);
        StereoSystem logitech = new StereoSystem(4,"Logitech Z-313",999);
        Television samsung = new Television(5,"Samsung UE-13",4999);
        //sells
        Sell sell1 = new Sell(1,"15.03.2017","16.03.2017",3);
        Sell sell2 = new Sell(2,"25.01.2017","30.01.2017",1);
        Sell sell3 = new Sell(3,"13.12.2016","14.12.2016",2);
        Sell sell4 = new Sell(4,"03.06.2016","06.06.2016",5);
        Sell sell5 = new Sell(5,"31.01.2017","31.01.2017",1);
        //bills
        Bill bill1 = new Bill(vova,kingston,sell1,1);
        Bill bill2 = new Bill(stas,logitech,sell2,2);
        Bill bill3 = new Bill(andriy,acer,sell3,3);
        Bill bill4 = new Bill(bogdan,iphone,sell4,4);
        Bill bill5 = new Bill(katya,samsung,sell5,5);

        bills.add(bill1);
        bills.add(bill2);
        bills.add(bill3);
        bills.add(bill4);
        bills.add(bill5);

        Bills totalIncome = new Bills();
        totalIncome.setBills(bills);

        System.out.println(bill1.getInfo());
        System.out.println(bill2.getInfo());
        System.out.println(bill3.getInfo());
        System.out.println(bill4.getInfo());
        System.out.println(bill5.getInfo());
        System.out.println(totalIncome.totalSumm());

    }
}
