import java.util.Comparator;

public class DogLauncher {
    public static void main(String[] args){
        Dog a = new Dog("Alice", 1);
        Dog b = new Dog("Bob",18);
        Dog c = new Dog("Cat",28);
        Dog[] dogs ={a,b,c};
        System.out.println(Maximizer.max(dogs));
        Dog dog =(Dog) (Maximizer.max(dogs));
        dog.bark();
        Comparator<Dog> nc = Dog.getNameComparator();
        if(nc.compare(a,b)<0){
            b.bark();
        }
    }
}
