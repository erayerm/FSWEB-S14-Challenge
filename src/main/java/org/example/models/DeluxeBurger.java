package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }
    public DeluxeBurger(){
        super(19.10);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String addHamburgerAddition1(String name, double price) {
        return "\nDeluxe Burger için yeni malzeme eklenemez.";
    }

    @Override
    public String addHamburgerAddition2(String name, double price) {
        return "\nDeluxe Burger için yeni malzeme eklenemez.";
    }

    @Override
    public String addHamburgerAddition3(String name, double price) {
        return "\nDeluxe Burger için yeni malzeme eklenemez.";
    }

    @Override
    public String addHamburgerAddition4(String name, double price) {
        return "\nDeluxe Burger için yeni malzeme eklenemez.";
    }
}
