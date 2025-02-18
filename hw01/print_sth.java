public class print_sth{
	public static void main(String[] args){
		int col = 0;
		int row = 0;
		int SIZE = 5;
		while(row < SIZE){
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
}

