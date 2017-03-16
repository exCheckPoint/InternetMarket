package oop.intenetmarket.model.bill.impls;

import oop.intenetmarket.model.bill.intefaces.IBills;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Admin on 15.03.2017.
 */
public class Bills implements IBills {
    private ArrayList<Bill> bills;

    public Bills(){}

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public double totalSumm() {
        double sum=0;

        Bill bill;
        for(Iterator var2 = this.bills.iterator();
            var2.hasNext();
            sum += bill.summ()){
            bill = (Bill)var2.next();
        }
        return sum;
    }
}
