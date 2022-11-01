package ad211.vietokhin.mycoffeeshop.makingcoffee;

import ad211.vietokhin.mycoffeeshop.makingcoffee.regular.MyRegularCoffeeFactory;

public class CoffeeShop extends Coffee {

    private final MyRegularCoffeeFactory coffeeFactory;

    public CoffeeShop(MyRegularCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Your Coffee! Have a good day!");
        return coffee;
    }

}
