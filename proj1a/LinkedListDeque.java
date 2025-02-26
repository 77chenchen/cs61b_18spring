public class LinkedListDeque <T>{
    private class LinkedList{
        public LinkedList first,next;
        public T item;
        public LinkedList(){
            first=null;
            next=null;
            item=null;
        }
        public T get_item(int index){
            if(index==0){
                return this.item;
            }
            return this.next.get_item(index-1);
        }
    }
    private int size;
    private LinkedList Sentinel;
    public LinkedListDeque(){
        Sentinel = new LinkedList();
        Sentinel.first=Sentinel;
        Sentinel.next=Sentinel;
        size =0;
    }
    public void addFirst(T item){
        LinkedList rest=Sentinel.next;
        LinkedList L= new LinkedList();
        L.item=item;
        L.first=Sentinel;
        L.next=rest;
        Sentinel.next=L;
        rest.first=L;
        size = size +1;
    }
    public void addLast(T item){
        LinkedList before=Sentinel.first;

        LinkedList L = new LinkedList();

        L.item = item;
        L.first = before;
        L.next=Sentinel;

        before.next=L;
        Sentinel.first=L;

        size+=1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        LinkedList printingList = Sentinel.next;
        while(printingList!=Sentinel){
            System.out.print(printingList.item);
            System.out.print(" ");
            printingList=printingList.next;
        }
        System.out.print("\n");
    }
    public T removeFirst(){
        if(size==0){
            return null;
        }else{
            T i= Sentinel.next.item;
            Sentinel.next=Sentinel.next.next;
            Sentinel.next.first=Sentinel;
            size-=1;
            return i;
        }
    }
    public T removeLast(){
        if(size==0){
            return null;
        }else{
            T i= Sentinel.first.item;
            Sentinel.first=Sentinel.first.first;
            Sentinel.first.next=Sentinel;
            size-=1;
            return i;
        }
    }
    public T get(int index){
        if(size==0||index>size){
            return null;
        }else{
            LinkedList temp = Sentinel;
            while(index>0){
                index-=1;
                temp=temp.next;
            }
            return temp.next.item;
        }
    }
    public T getRecursive(int index){
        if(size==0||index>size){
            return null;
        }
        return Sentinel.next.get_item(index);
    }
}
