class Car {
    String color;
    void drive(){
        System.out.println("the "+color+" car is driving.");
    }
}

class StackandHeap {
    public static void main(String[] args) {
        
        int speed = 100;     // stored in stack
        Car mycar = new Car();      // myCar (reference) is in Stack, object is in Heap
        mycar.color = "red"; // Setting property (Heap object)
        mycar.drive();   // Accessing method from object in Heap
    }
}