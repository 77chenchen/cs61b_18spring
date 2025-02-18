public class print_any {
	public static void drawTriangle(int N){
		int col = 0;
                int row = 0;
                while(row < N){
                        col=0;
                        while(col<=row){
                                if(col==row){
                                        System.out.println("*");
                                }else{
                                        System.out.print("*");
                                }
                                col=col+1;
                        }
                        row=row+1;
		}
	}
	public static void main(String[] args){
		drawTriangle(10);
	}
}

