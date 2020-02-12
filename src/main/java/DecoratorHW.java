
public class DecoratorHW {

	public static void main(String[] args) {
		Burger order = new Avocado(new FriedEgg(new GrilledOnions(new BasicBurger())));
		double cost = order.makeBurger();
		System.out.println("Total: $" + cost);
	}

}
