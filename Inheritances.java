

public class Inheritances {
    
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breathe();
        Shark.fins();
        
    }
}


class Animal {
    String str = "Red";
    // System.out.println(str);
    
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
    
}

class Fish extends Animal{
    void fins(){
        System.out.println("10");
    }

}