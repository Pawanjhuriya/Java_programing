public class Inheritance_multilevel {
  public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breathe();
        Shark.fins();
        Shark.legs();
        
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

class Mammal extends Animal{
    void fins(){
        System.out.println("15");
    }

}

class Fish extends Mammal{
   void legs(){
        System.out.println(" 10");
    }
}