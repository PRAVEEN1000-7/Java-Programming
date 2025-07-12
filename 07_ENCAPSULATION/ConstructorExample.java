class Human {

    String Name;
    int Age;

    public Human(){               // default constructor
        this.Name = "mortal";    
        this.Age = 20;
    }
    public Human(String Name ,int Age){ // parameterized constructor
        this.Name = Name;
        this.Age = Age;
    }

}

public class ConstructorExample {

    public static void main(String[] args) {

        Human H = new Human();
        System.out.println(H.Name +" : "+ H.Age);
        Human H1 = new Human("Robin",18);
        System.out.println(H1.Name +" : "+ H1.Age);
        
    }

}
