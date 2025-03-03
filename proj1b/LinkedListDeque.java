public  class  LinkedListDeque<Item> implements Deque<Item>{
    public class LinkedList{
        public LinkedList first;
        public LinkedList next;
        public Item item;
        public LinkedList(){
            first = null;
            next = null;
            item = null;
        }
        public Item get_Index(int Index){
            if (Index == 0) {
                return this.item;
            }
            return this.next.get_Index(Index - 1);
        }
    }
    public int size;
    public LinkedList Sentinel;
    public LinkedListDeque(){
        Sentinel = new LinkedList();
        Sentinel.first = Sentinel;
        Sentinel.next = Sentinel;
        size = 0;
    }
    @Override
    public void addFirst(Item i){
        LinkedList rest = Sentinel.next;
        LinkedList L = new LinkedList();
        L.item = i;
        L.first = Sentinel;
        L.next = rest;
        Sentinel.next = L;
        rest.first = L;
        size++;
    }
    @Override
    public void addLast(Item i){
        LinkedList L = new LinkedList();
        L.item = i;
        LinkedList oldLast = Sentinel.first;
        oldLast.next = L;
        L.first = oldLast;
        L.next = Sentinel;
        Sentinel.first = L;
        size++;
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void printDeque(){
        for(int i = 0; i < size;i ++){
            System.out.print(get(i));
            System.out.print(" ");
        }
        System.out.print("\n");

    }

    @Override
    public Item removeFirst(){
        if(size==0){
            return null;
        }else{
            Item i= Sentinel.next.item;
            Sentinel.next=Sentinel.next.next;
            Sentinel.next.first=Sentinel;
            size-=1;
            return i;
        }
    }
    @Override
    public Item removeLast(){
        if(size==0){
            return null;
        }else{
            Item i= Sentinel.first.item;
            Sentinel.first=Sentinel.first.first;
            Sentinel.first.next=Sentinel;
            size-=1;
            return i;
        }
    }
    @Override
    public Item get(int index){
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
    @Override
    public Item getRecursive(int index){
        if(size==0||index>size){
            return null;
        }
        return Sentinel.next.get_Index(index);
    }
}
