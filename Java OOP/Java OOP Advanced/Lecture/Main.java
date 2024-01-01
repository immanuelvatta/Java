public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.goToWork();
        human.startSleeping();
        Bird crow = new Bird();
        crow.startSleeping();
        Bat bat = new Bat();
        bat.regulateTemperature();
        bat.fly();
        crow.fly();
        crow.land();
        bat.land();
    }
}
