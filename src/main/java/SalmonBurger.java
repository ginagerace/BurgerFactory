public class SalmonBurger implements Burger{

    private double cost = 6.50;

    @Override
    public double makeBurger() {
        System.out.println("Salmon Burger $6.50");
        return cost;
    }

}
