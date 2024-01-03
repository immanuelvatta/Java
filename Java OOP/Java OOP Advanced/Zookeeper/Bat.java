public class Bat extends Mammal{

    public Bat(int energy){
        super(energy);
    }

    public void fly(){
        System.out.println("Bat is flying");
        setEnergy(getEnergy()-50);
        displayEnergy();
        System.out.println("Bat is airborne");
    }

    public void eatHumans(){
        System.out.println("Bat is eating HUMANS!!!!");
        setEnergy(getEnergy()+25);
        displayEnergy();
        System.out.println("Bat ate the human!! Bat is extremely satisfied");
    }

    public void attackTown(){
        System.out.println("Bat is attacking the nearby Town!!!");
        setEnergy(getEnergy()-100);
        displayEnergy();
        System.out.println("Oh, the humanity!! Someone call the heroes!!");
    }
}
