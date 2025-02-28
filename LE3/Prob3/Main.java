public class Main {
    public static void main(String[] args) {
        Swimmable[] ducks = { new RubberDuck(), new WoodenDuck(), new RedHeadDuck(), new LakeDuck() };

        for (Swimmable duck : ducks) {
            duck.swim();
        }

        Quackable[] quackers = { new RubberDuck(), new RedHeadDuck(), new LakeDuck() };

        for (Quackable quacker : quackers) {
            quacker.quack();
        }

        Flyable[] flyers = { new RedHeadDuck(), new LakeDuck() };

        for (Flyable flyer : flyers) {
            flyer.fly();
        }
    }
}
