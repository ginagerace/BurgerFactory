public class BurgerFactory{

    public static Burger getBurger(String s){
        if(s.equalsIgnoreCase("bb"))
            return new BasicBurger();
        else if(s.equalsIgnoreCase("sb"))
            return new SalmonBurger();
        else if(s.equalsIgnoreCase("by"))
            return new BeyondBurger();
        else if(s.equalsIgnoreCase("blb"))
            return new BlackbeanBurger();
        else
            return new BasicBurger();
    }

}
