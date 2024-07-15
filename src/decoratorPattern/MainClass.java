package decoratorPattern;

public class MainClass {
    public static void main(String[] args) {
        BasePizza pizza=new Margherita();
        BasePizza pizzaWithCheese=new ExtraCheese(pizza);
        BasePizza pizzaWithJalpeenoandCheese=new Jalpeeno(pizzaWithCheese);

        System.out.println(pizzaWithCheese.cost());
        System.out.println(pizzaWithJalpeenoandCheese.cost());
    }
}
