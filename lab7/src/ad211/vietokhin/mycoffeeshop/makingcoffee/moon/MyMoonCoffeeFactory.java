package ad211.vietokhin.mycoffeeshop.makingcoffee.moon;

import ad211.vietokhin.mycoffeeshop.makingcoffee.Coffee;
import ad211.vietokhin.mycoffeeshop.makingcoffee.CoffeeType;
import ad211.vietokhin.mycoffeeshop.makingcoffee.regular.MyRegularCoffeeFactory;

public class MyMoonCoffeeFactory extends MyRegularCoffeeFactory {

    @Override
    public Coffee createCoffee(CoffeeType type){
        Coffee coffee = null;

        switch(type) {
            case JUPITER_COFFEE:
                System.out.println("One Moon Jupiter Coffee");
                coffee = new MoonJupiterCoffee();
                break;
            case MARS_COFFEE:
                System.out.println("One Moon Mars Coffee");
                coffee = new MoonMarsCoffee();
                break;
            case EARTH_COFFEE:
                System.out.println("One Moon Earth Coffee");
                coffee = new MoonEarthCoffee();
                break;
            case URANUS_COFFEE:
                System.out.println("One Moon Uranus Coffee");
                coffee = new MoonUranusCoffee();
                break;
        }
        return coffee;
    }
}
