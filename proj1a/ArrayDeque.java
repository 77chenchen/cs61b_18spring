public class ArrayDeque <T>{
    private T []item;
    private int size;
    private int first,last;
    public ArrayDeque(){
        size=0;
        item = (T[])new Object[8];
        first=4;
        last=5;
    }
    public void increaseSizeofDequeFront(){
        int biggerSize = (int)(item.length*1.5);
        int increasedSize = biggerSize - size;
        T[] array = (T[]) new Object[biggerSize];
        System.arraycopy(item,0,array,increasedSize,size);
        first=first+increasedSize;
        last=last+increasedSize;
        item= array;
    }
    public void addFirst(T i){
        if(first<0){
            increaseSizeofDequeFront();
        }
        item[first]=i;
        first-=1;
        size++;
    }
    public void increaseSizeofDequeLast(){
        int biggerSize = (int)(item.length*1.5);
        int sizeIncreased = biggerSize - size;
        T[] array = (T[])new Object[biggerSize];
        System.arraycopy(item,first+1,array,first+1,size);
        item= array;
    }
    public void addLast(T i){
        if(last == item.length){
            increaseSizeofDequeLast();
        }
        item[last]=i;
        last++;
        size++;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
     public void print(){
        for(int i=first+1;i<last;i++){
            System.out.print(item[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
     }
     public T get(int index){
        if(index<0||index>=size){
            return null;
        }
        return item[first+index+1];
     }
     public void shrinkSize(){
        int frontEmpty = first + 1 ;
        int lastEmpty = item.length - last;
        int oldFirst = first;
        int shrinkFront = frontEmpty/2 ;
        int shrinkLast = lastEmpty/2;
        first = first - shrinkFront;
        last = last - shrinkFront;
        int new_length= item.length - shrinkFront - shrinkLast;
        T[] array  = (T[]) new Object[new_length];
        System.arraycopy(item,oldFirst+1,array,first+1,size);
        item=array;
     }
     public T removeFirst(){
        if(first+1==last){
            return null;
        }
        first++;
        T oldFirst = item[first];
        item[first] = null;
        size--;
        double usage_rate = (1.0*size)/item.length;
        if(usage_rate<0.25&&item.length>16){
            shrinkSize();
        }
        return oldFirst;
     }
     public T removeLast(){
        if(size==0){
            return null;
        }
        T oldLast = item[last-1];
        last--;
        size--;
         double usage_rate = (1.0*size)/item.length;
         if(usage_rate<=0.25&&item.length>16){
             shrinkSize();
         }
        return oldLast;
     }

}
