class Animal {
    void eat(){
        System.out.println("every aimals can eat foods.");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("dog says : woof!!!");
    }
}

public class egSingleInheritance {
    public static void main(String [] args){

        Dog puppy = new Dog();

        puppy.sound();
        puppy.eat();
    }
}