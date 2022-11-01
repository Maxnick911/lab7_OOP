package ad211.vietokhin.mycoffeeshop;

import ad211.vietokhin.mycoffeeshop.makingcoffee.CoffeeShop;
import ad211.vietokhin.mycoffeeshop.makingcoffee.CoffeeType;
import ad211.vietokhin.mycoffeeshop.makingcoffee.moon.MyMoonCoffeeFactory;
import ad211.vietokhin.mycoffeeshop.makingcoffee.regular.MyRegularCoffeeFactory;
import ad211.vietokhin.mycoffeeshop.makingcoffee.sun.MySunCoffeeFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Regular Space coffee");
        MyRegularCoffeeFactory regularCoffeeFactory = new MyRegularCoffeeFactory();
        CoffeeShop regularCoffeeShop = new CoffeeShop(regularCoffeeFactory);
        System.out.println("One Regular Jupiter Coffee");
        regularCoffeeShop.orderCoffee(CoffeeType.JUPITER_COFFEE);

        System.out.println("Moon Space coffee");
        MyMoonCoffeeFactory moonCoffeeFactory = new MyMoonCoffeeFactory();
        CoffeeShop moonCoffeeShop = new CoffeeShop(moonCoffeeFactory);
        moonCoffeeShop.orderCoffee(CoffeeType.MARS_COFFEE);


        System.out.println("Sun Space coffee");
        MySunCoffeeFactory sunCoffeeFactory = new MySunCoffeeFactory();
        CoffeeShop sunCoffeeShop = new CoffeeShop(sunCoffeeFactory);
        sunCoffeeShop.orderCoffee(CoffeeType.URANUS_COFFEE);
    }
}