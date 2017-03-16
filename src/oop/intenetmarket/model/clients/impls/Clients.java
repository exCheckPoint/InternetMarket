package oop.intenetmarket.model.clients.impls;

import oop.intenetmarket.model.clients.interfaces.IClients;
import oop.intenetmarket.model.products.impls.Products;
import oop.intenetmarket.model.sell.impls.Sell;

/**
 * Created by Admin on 10.03.2017.
 */
public class Clients implements IClients {
//Клієнти (Код клієнта<-, Прізвище, Ім’я, По батькові, Адреса, Телефон, e-mail, Ознака постійного клієнта).
    int codeClient;
    private String surnameClient;
    private String nameClient;
    private String middleNameClient;
    private String adressClient;
    private String phoneNumberClient;
    private String emailClient;
    private Sell sell;
    private Products products;
   /* boolean regClient = false;*/

    public Clients(int codeClient, String surnameClient, String nameClient, String middleNameClient, String adressClient, String phoneNumberClient, String emailClient/*, boolean regClient*/) {
        this.codeClient = codeClient;
        this.surnameClient = surnameClient;
        this.nameClient = nameClient;
        this.middleNameClient = middleNameClient;
        this.adressClient = adressClient;
        this.phoneNumberClient = phoneNumberClient;
        this.emailClient = emailClient;
       /* this.regClient = regClient;*/
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public String getSurnameClient() {
        return surnameClient;
    }

    public void setSurnameClient(String surnameClient) {
        this.surnameClient = surnameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getMiddleNameClient() {
        return middleNameClient;
    }

    public void setMiddleNameClient(String middleNameClient) {
        this.middleNameClient = middleNameClient;
    }

    public String getAdressClient() {
        return adressClient;
    }

    public void setAdressClient(String adressClient) {
        this.adressClient = adressClient;
    }

    public String getPhoneNumberClient() {
        return phoneNumberClient;
    }

    public void setPhoneNumberClient(String phoneNumberClient) {
        this.phoneNumberClient = phoneNumberClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

 /*   public boolean isRegClient() {
        return regClient;
    }

    public void setRegClient(boolean regClient) {
        this.regClient = regClient;
    }*/

 /*   @Override
    public int discont(boolean regClients) {
        if(sell.getNumber()*products.getPriceProduct()>=5000){
            regClients=true;
        }
        else regClients=false;
        return 0;
    }*/
    //Клієнти (Код клієнта<-, Прізвище, Ім’я, По батькові, Адреса, Телефон, e-mail, Ознака постійного клієнта).
    public String getInfo(){
        return "Code Client: "+getCodeClient()+"\n"+
        "-------------------------------------\n"+
        "Surname Client: "+getSurnameClient()+"\n"+
        "Name Client: "+getNameClient()+"\n"+
        "Middle Name Client: "+getMiddleNameClient()+"\n"+
        "Adress Client: "+getAdressClient()+"\n"+
        "Phone Number Client: "+getPhoneNumberClient()+"\n"+
        "Email Client: "+getEmailClient()+"\n"+
        "-------------------------------------\n";
       /* "Regular Client(Have 2% discont): "+isRegClient()+"\n";*/
    }
}
