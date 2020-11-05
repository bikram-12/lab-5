public class key
{
	public static void main(String [] args)
	{
		int [] a={6,7,8,4,3,1,2,9,0,5};
		int z= a.length;
		int R = 10; 
		int [] aux = new int[a.length];
		int[] count = new int[R+1];

		for (int i =0; i<z; i++){
			count [a[i] +1]++;
		}

		for(int r =0; r<R; r++){
			count[r+1] += count[r];
		}
		for(int i = 0; i<z; i++){
			aux[count[a[i]]++] = a[i];
		}
		for(int i=0; i<z; i++){
			a[i] = aux[i];
		}
		for (int i = 0; i<z;i++){
			System.out.print(" "+a[i]);
		}
		System.out.print(" ");

	}
}