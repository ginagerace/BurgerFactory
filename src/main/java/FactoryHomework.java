
public class FactoryHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Factory Design Pattern HW!");

		Burger order = new Avocado(new FriedEgg(new GrilledOnions(BurgerFactory.getBurger("blb"))));
		double cost = order.makeBurger();
		System.out.println("Total: $" + cost);
	}

}
