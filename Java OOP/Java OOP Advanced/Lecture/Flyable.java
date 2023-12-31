public interface Flyable {
    
    public abstract void fly();

    public default void land(){
        System.out.printf("The %s is landing \n", this.getClass().getSimpleName());
    }
}
