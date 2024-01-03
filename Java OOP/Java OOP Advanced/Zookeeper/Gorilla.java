public class Gorilla extends Mammal {

    public Gorilla(){
        super();
    }
    
    public void throwSomething(){
        System.out.println("Gorilla is throwing something");
        setEnergy(getEnergy()-5);
        displayEnergy();
        System.out.println("Gorilla has thrown something!!");
    }

    public void eatBanana(){
        System.out.println("Gorilla is eating a banana");
        setEnergy(getEnergy()+10);
        displayEnergy();
        System.out.println("Gorilla has eaten a banana!! Gorilla looks satisfied");
    }

    public void climb(){
        System.out.println("Gorilla is climbing");
        setEnergy(getEnergy()-10);
        displayEnergy();
        System.out.println("Gorilla has climbed a tree!");
    }
}
