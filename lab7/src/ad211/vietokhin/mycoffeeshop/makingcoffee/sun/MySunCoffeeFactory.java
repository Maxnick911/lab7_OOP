package ad211.vietokhin.mycoffeeshop.makingcoffee.sun;

import ad211.vietokhin.mycoffeeshop.makingcoffee.Coffee;
import ad211.vietokhin.mycoffeeshop.makingcoffee.CoffeeType;
import ad211.vietokhin.mycoffeeshop.makingcoffee.regular.MyRegularCoffeeFactory;

public class MySunCoffeeFactory extends MyRegularCoffeeFactory {

    @Override
    public Coffee createCoffee(CoffeeType type){
        Coffee coffee = null;

        switch(type) {
            case JUPITER_COFFEE:
                System.out.println("One Sun Jupiter Coffee");
                coffee = new SunJupiterCoffee();
                break;
            case MARS_COFFEE:
                System.out.println("One Sun Mars Coffee");
                coffee = new SunMarsCoffee();
                break;
            case EARTH_COFFEE:
                System.out.println("One Sun Earth Coffee");
                coffee = new SunEarthCoffee();
                break;
            case URANUS_COFFEE:
                coffee = new SunUranusCoffee();
                System.out.println("One Sun Uranus Coffee");
                break;
        }
        return coffee;
    }
}
