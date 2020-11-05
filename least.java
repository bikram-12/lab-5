public class least
{
	public static void sort(int w)
	{
		String [] a={"c","d","f","a"};
		int z=a.length;
		int R = 256;
		String[] aux = new String [z];
		for(int d=w-1; d>=0; d--)
		{
			int[] count = new int[R+1];
		
		for(int i=0; i<z; i++){
			count[a[i].charAt(d) + 1]++;
		}
		for (int r= 0; r<R; r++){
			count[r+1] += count[r];
		}
		for (int i =0; i<z; i++){
			aux[count[a[i].charAt(d)]++]=a[i];
		}
		for(int i =0; i<z; i++){
			a[i] = aux[i];
		}
		for (int i = 0; i<z;i++){
			System.out.print(" "+a[i]);
		}
		System.out.print(" ");

	}


	}
	public static void main(String [] args)
	{
     sort(1);
	}
}
