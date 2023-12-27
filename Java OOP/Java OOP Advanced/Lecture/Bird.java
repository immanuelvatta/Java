public class Bird extends Avian implements Flyable{

    @Override
    public void fly() {
        System.out.printf("%s can fly\n", this.getClass().getSimpleName());
    }
    
}
