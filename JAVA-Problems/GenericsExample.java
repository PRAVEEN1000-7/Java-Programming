class Box<T> {
    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}

class Product<T,U>{

    T name;
    U price;

    public void setProduct(T name,U price){
        this.name = name;
        this.price = price;
    }

    public String getProduct(){
        return name+" : "+price;
    }
}

public class GenericsExample {

    public static void main(String[] args) {
        
        // generic : single type parameter and type argument
        Box<String> thing = new Box<>();
        thing.setItem("guitar");
        System.out.println(thing.getItem());

        //generic : multiple type parameter and type argument
        Product<String,Double> product = new Product<>();
        product.setProduct("IPhone",90.50);
        System.out.println(product.getProduct());

    }
}