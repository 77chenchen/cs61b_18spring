import java.util.Comparator;
public class Dog implements Comparable<Dog> {
    private String name;
    private int size;
    public Dog(String n , int s){
        name = n;
        size = s;
    }
    public void bark(){
        System.out.println(this.name+"says: bark");
    }
    //* return negative number if this dog's size is less than the dog d */
    public int compareTo(Dog d){
        return this.size-d.size;
    }
    public static class NameComparator implements Comparator<Dog>{
        public int compare(Dog g,Dog d){
            return g.name.compareTo(d.name);
        }
    }
    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }
}