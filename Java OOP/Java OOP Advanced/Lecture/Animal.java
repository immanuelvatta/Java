public class Animal {

    private boolean sleeping = false;

    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }

    public boolean isSleeping() {
        return sleeping;
    }
}
