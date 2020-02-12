import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FactoryTest {

    @Test
    void testInitBasicBurger() {
        Burger order = BurgerFactory.getBurger("bb");
        assertEquals("BasicBurger", order.getClass().getName(), "did not initialize proper object");
    }

    @Test
    void testInitSalmonBurger() {
        Burger order = BurgerFactory.getBurger("sb");
        assertEquals("SalmonBurger", order.getClass().getName(), "did not initialize proper object");
    }

    @Test
    void testInitBeyondBurger() {
        Burger order = BurgerFactory.getBurger("by");
        assertEquals("BeyondBurger", order.getClass().getName(), "did not initialize proper object");
    }

    @Test
    void testInitBlackbeanBurger() {
        Burger order = BurgerFactory.getBurger("blb");
        assertEquals("BlackbeanBurger", order.getClass().getName(), "did not initialize proper object");
    }

    @Test
    void testInitDefault() {
        Burger order = BurgerFactory.getBurger("xx");
        assertEquals("BasicBurger", order.getClass().getName(), "did not initialize proper object");
    }

    @Test
    void testInitNoInput() {
        Burger order = BurgerFactory.getBurger("");
        assertEquals("BasicBurger", order.getClass().getName(), "did not initialize proper object");
    }

    @Test
    void testNoToppings() {
        Burger order = BurgerFactory.getBurger("by");
        double cost = order.makeBurger();
        assertEquals(6.5, cost, "wrong cost");
    }

    @Test
    void test1topping() {
        Burger order = new Bacon(BurgerFactory.getBurger("by"));
        double cost = order.makeBurger();
        assertEquals(8.5, cost, "wrong cost");
    }

    @Test
    void test2toppings() {
        Burger order = new RoastedPeppers(new GrilledOnions(BurgerFactory.getBurger("sb")));
        double cost = order.makeBurger();
        assertEquals(10.5, cost, "wrong cost");
    }

    @Test
    void test3toppings() {
        Burger order = new Avocado(new FriedEgg(new GrilledOnions(BurgerFactory.getBurger("blb"))));
        double cost = order.makeBurger();
        assertEquals(12.5, cost, "wrong cost");
    }

}
