class Wolf {

    void sound(){
        System.out.println("Wolf says : woooooooooooooooooooooo!!!");
    }

}
class Dog extends Wolf {

    void sound(){
        System.out.println("Dog says : wooof");
    }
}
public class MethodOverriding {
  
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.sound();
    }

}