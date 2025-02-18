public class max_array{
	public static int max(int[] m){
		int max_num=0;
		int len=m.length;
		int i=0;
		while(i<len){
			if(m[i]>max_num)
			{
				max_num=m[i];
			}
			i=i+1;
		}
		return max_num;
	}
	public static void main(String[] args){
		int[] numbers = new int[]{1,2,3,4};
		System.out.println(max(numbers));
	}

}
