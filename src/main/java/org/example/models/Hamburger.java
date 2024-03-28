package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private double addition1Price;
    private String addition1Name;
    private double addition2Price;
    private String addition2Name;
    private double addition3Price;
    private String addition3Name;
    private double addition4Price;
    private String addition4Name;

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price + addition4Price + addition3Price + addition2Price + addition1Price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public Hamburger(double price) {
        this.price = price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name; this.addition1Price = addition1Price; return addition1Name + " " + addition1Price;
    }

    public String addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name; this.addition2Price = addition2Price; return addition2Name + " " + addition2Price;
    }

    public String addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name; this.addition3Price = addition3Price; return addition3Name + " " + addition3Price;
    }

    public String addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name; this.addition4Price = addition4Price; return addition4Name + " " + addition4Price;
    }

    public void itemizeHamburger() {
        System.out.println(name + " " + meat + " " + price + " " + breadRollType + " " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name + " " + (price + addition1Price + addition2Price + addition3Price + addition4Price));
    }
}
