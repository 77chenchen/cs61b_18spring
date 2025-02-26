public class ALList<Item> {
    public Item[] items;
    public int size;
    public ALList(){
         items = (Item[])new Object[8];
         size=0;
    }
    public void increaseSize(int newSize){
        Item[] array = (Item[])new Object[newSize];
        System.arraycopy(items,0,array,0,size);
        items=array;

    }
    public void addLast(Item i){
        if(size==items.length){
            increaseSize(size*2);
        }
        items[size]=i;
        size+=1;
    }
    public Item getLast(){
        return items[size-1];
    }

}
