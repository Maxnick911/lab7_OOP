package ad211.vietokhin.mycoffeeshop.makingcoffee.regular;

import ad211.vietokhin.mycoffeeshop.makingcoffee.Coffee;
import ad211.vietokhin.mycoffeeshop.makingcoffee.CoffeeType;

public class MyRegularCoffeeFactory {

    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch(type) {
            case JUPITER_COFFEE:
                System.out.println("One Jupiter Coffee");
                coffee = new JupiterCoffee();
                break;
            case MARS_COFFEE:
                System.out.println("One Mars Coffee");
                coffee = new MarsCoffee();
                break;
            case EARTH_COFFEE:
                System.out.println("One Earth Coffee");
                coffee = new EarthCoffee();
                break;
            case URANUS_COFFEE:
                System.out.println("One Uranus Coffee");
                coffee = new UranusCoffee();
        }
        return coffee;
    }
}
