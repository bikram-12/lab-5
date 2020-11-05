public class linear{
	public static int search(int [] a, int x)
	{
		int z = a.length;
		for(int i =0; i<z; i++){
			if(a[i]==x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int []a= {2,5,6,7,0};
		int x=2;
		int display= search(a,x);
		if(display==-1){
			System.out.print("element not found");
		}
		else{
			System.out.print("the element found");
		}
	}
}