public class BlackbeanBurger implements Burger{

    private double cost = 6.50;

    @Override
    public double makeBurger() {
        System.out.println("Black Bean Burger $6.50");
        return cost;
    }

}
