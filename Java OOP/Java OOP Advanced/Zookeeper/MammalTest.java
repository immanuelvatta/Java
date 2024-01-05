public class MammalTest {
    
    public static void main(String[] args) {
        
        Gorilla gorilla = new Gorilla();
        gorilla.throwSomething();
        gorilla.eatBanana();
        gorilla.climb();
        System.out.println("Gorilla's final energy reading recorded:" );
        gorilla.displayEnergy();
        System.out.println("------------");
        Bat bat = new Bat(300);
        bat.fly();
        bat.attackTown();
        bat.eatHumans();
        bat.attackTown();
        bat.eatHumans();
        bat.attackTown();
        bat.fly();

        System.out.println("Bat's final energy reading recorded:" );
        bat.displayEnergy();
        

    }
}
