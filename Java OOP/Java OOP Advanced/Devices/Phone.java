public class Phone extends Device {
    
    public void makeCall(){
        System.out.println("Making a phone call.");
        setBattery(-5);
        status();
    }

    public void playGame(){
        System.out.println("Playing a game.");
        setBattery(-20);
        status();
    }
    
    public void charge(){
        System.out.println("Charging the phone.");
        setBattery(50);
        status();
    }

}
