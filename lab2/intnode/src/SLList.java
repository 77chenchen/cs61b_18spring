public class SLList {
    public static class Intnode {
        public int item;
        public Intnode next;

        public Intnode(int i, Intnode n) {
            item = i;
            next = n;
        }
    }
    int size;
    public Intnode Sentinel;
    public SLList(){
        Sentinel = new Intnode(63,null);
        size=0;
    }
    public SLList(int x){
        Sentinel = new Intnode (63,null);
        Sentinel.next = new Intnode (x,Sentinel.next);
        size=1;
    }
    public void addFirst(int x){
        Sentinel.next = new Intnode(x,Sentinel.next);
        size=size+1;
    }
    public int getFirst(){
        return Sentinel.next.item;
    }
    public void addLast(int x){
        Intnode p = Sentinel;
        while(p.next != null){
            p=p.next;
        }
        p.next = new Intnode(x,null);
        size=size+1;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args){
        SLList L= new SLList();
        L.addLast(10);
        L.addFirst(4);
        System.out.println(L.size());
    }


}
