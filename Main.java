public class Main {
    public int first;
    public Main rest;
    public Main(int f, Main r){
        first = f;
        rest = r;
    }
    //* use recursion to compute size */
    public int size(){
        if(rest==null){
            return 1;
        }
        return 1+this.rest.size();
    }
    //*do not use recursion*/
    public int interactsize(){
        Main p= this;
        int num_size=0;
        while(p != null){
            num_size+=1;
            p=p.rest;
        }
        return num_size;
    }

    public static void main(String[] args) {
        Main L =  new Main(15,null);
        L = new Main(10,L);
        L = new Main(5,L);
        System.out.println(L.size());
        System.out.println(L.interactsize());
    }
}