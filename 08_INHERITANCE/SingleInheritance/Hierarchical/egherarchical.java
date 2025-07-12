class Animal {
    void eat(){
        System.out.println("every animal : can eat foods.");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("dog says : woof!!!");
    }
}

class Wolf extends Animal {
    void wolfsound(){
        System.out.println("wolf says : wooooooooooooooooooo!!!");
    }
}

public class egherarchical {
    public static void main(String [] args){

        Wolf babywolf = new Wolf();
        Dog puppy = new Dog();

        babywolf.wolfsound();
        babywolf.eat();
        puppy.sound();
        puppy.eat();
    }
}