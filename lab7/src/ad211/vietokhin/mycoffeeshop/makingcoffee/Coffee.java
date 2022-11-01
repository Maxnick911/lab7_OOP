package ad211.vietokhin.mycoffeeshop.makingcoffee;

public abstract class Coffee {

    final private int timer = 3;

    public void grindCoffee(){
        System.out.println("Grinding coffee...");
        for(int i = 0; i < timer; i++) {
            System.out.println(i + 1 + "...");
        }
    }
    public void makeCoffee(){
        System.out.println("Making coffee...");
        for(int i = 0; i < timer; i++) {
            System.out.println(i + 1 + "...");
        }
    }
    public void pourIntoCup(){
        System.out.println("Pouring coffee...");
        for(int i = 0; i < timer; i++) {
            System.out.println(i + 1 + "...");
        }
    }
}
