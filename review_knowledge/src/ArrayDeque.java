public class ArrayDeque<T> {
    private int size;
    private int first,next;
    private T[] item;
    public ArrayDeque(){
        item =(T[]) new Object[8];
        first = 4;
        next = 5 ;
        size = 0 ;
    }
    public void increaseSizeFront(){
        int biggerSize = (int) (item.length * 1.5);
        T[] L = (T[]) new Object[biggerSize];
        int increaseSize = biggerSize - item.length;
        System.arraycopy(item,0,L,increaseSize,size);
        item = L;
        first = first+increaseSize;
        next = next+increaseSize;
    }
    public void addFirst(T i){
        if(first<0){
            increaseSizeFront();
        }
        item[first] = i;
        first--;
        size++;
    }
    public T get(int index){
        if(index < 0 || index > size){
            return null;
        }
        return item[first+index+1];
    }
    public int size(){
        return size;
    }
    public void increaseSizeBack(){
        int biggerSize = (int) (item.length * 1.5);
        T[] L = (T[]) new Object[biggerSize];
        int increasedSize = biggerSize - item.length;
        System.arraycopy(item,first+1,L,first+1,size);
        item = L;
    }
    public void addLast(T i){
        if(next >= item.length){
            increaseSizeBack();
        }
        item[next]=i;
        next++;
        size++;
    }
    public void printDeque(){
        for(int i=first+1;i<next;i++){
            System.out.print(item[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
    }

}