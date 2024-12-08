public class Abstractclassoop {
    public static void main(String[] args) {
       Horse h = new Horse();
       Cow c = new Cow();
       h.eat();
       h.walks(); 
       c.eat();
       c.walks();
    }
}

abstract class Animal {
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walks();
    //depends on Aniaml 

    
}

class Horse extends Animal{
    void walks(){
        System.out.println("Hoese walk on 4 legs");
    }
}

class Cow extends Animal{
    void walks(){
        System.out.println("Cow Walk on 2 legs");
    }
}

