public class BeyondBurger implements Burger{

    private double cost = 6.50;

    @Override
    public double makeBurger() {
        System.out.println("Beyond Burger $6.50");
        return cost;
    }

}
