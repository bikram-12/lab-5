class binary{  
 public static void binarySearch(int arr[], int f, int l, int k){  
   int m = (f + l)/2;  
   while( f <= l ){  
      if ( arr[m] < k){  
        f = m + 1;     
      }else if ( arr[m] == k ){  
        System.out.println("Element is found at index: " + m);  
        break;  
      }else{  
         l = m - 1;  
      }  
      m = (f + l)/2;  
   }  
   if ( f > l ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int k = 50;  
        int l=arr.length-1;  
        binarySearch(arr,0,l,k);     
 }  
}