public class slllist{
    public intnode first;
    public slllist(int x){
        first = new intnode(x,null);
    }
    public static void main(String[] args){
        slllist L = new slllist(15);
    }
    public void addFirst(int x){
        first = new intnode(x,first);
    }
    public int getFirst(){
        return first.item;
    }
}