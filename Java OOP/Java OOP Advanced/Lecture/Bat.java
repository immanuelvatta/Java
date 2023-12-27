public class Bat extends Mammal implements Flyable {

    @Override
    public void fly() {
        System.out.printf("The %s can fly\n", this.getClass().getSimpleName());
    }
        
    @Override
    public void land(){
        Flyable.super.land();
        System.out.println("Bat is landing");
    }
}
