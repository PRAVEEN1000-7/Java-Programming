class Human {
    // Private data (cannot be accessed directly)
    private String Name; 
    private int Age;

    // Public setter methods
    public void setName(String name){
        Name = name;
       
    }
    public void setAge(int age){
        Age = age;
       
    }

    // Public getter method
    public String getName(){
        return Name;
       
    }
    public int getAge(){
        return Age;      
    }


}
public class EncapsulationExample {
    
    public static void main(String[] args) {
        
        Human H = new Human();
        H.setName("Prav");
        H.setAge(18);

        System.out.println("Name :"+H.getName());
        System.out.println("age :"+H.getAge());

    }
}
