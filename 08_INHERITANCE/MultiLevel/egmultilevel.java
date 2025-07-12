class Animal {
    void eat(){
        System.out.println("every animal : can eat foods.");
    }
}

class Wolf extends Animal {
    void sound(){
        System.out.println("wolf says : wooooooooooooooooooo!!!");
    }
}

class Dog extends Wolf {
    void Dogsound(){
        System.out.println("dog says : woof!!!");
    }
}

public class egmultilevel {
    public static void main(String [] args){

        Dog puppy = new Dog();
        puppy.Dogsound();
        puppy.sound();
        puppy.eat();
    }
}