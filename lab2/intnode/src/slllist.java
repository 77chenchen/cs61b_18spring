public class slllist{
    public intnode first;
    public slllist(int x){
        first = new intnode(x,null);
    }
    public void addFirst(int x){
        first = new intnode(x,first);
    }
    public int getFirst(){
        return first.item;
    }
    public void addLast(int x){
        intnode p = first;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next = new intnode(x,null);

    }
    public int one_size(){
        intnode p = first;
        int number=0;
        while(p != null){
            number+=1;
            p=p.next;
        }
        return number;

    }
    private static int size(intnode p){
        if(p.next==null){
            return 1;
        }
        return 1+ size(p.next);
    }
    public int size(){
        return size(first);
    }

    public static void main(String[] args){
        slllist L = new slllist(15);
    }
}