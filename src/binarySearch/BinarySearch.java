package binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int [] ar = {3,5,7,4,8,34,27,23,83,73} ;
            
            Arrays.sort(ar);
         //   System.out.println(Arrays.binarySearch(ar, 8));
          int index=  binarySearch(ar,0,ar.length-1,83);
          System.out.println(index);
	}
	
	public static int binarySearch(int [] a, int first, int last, int key)
	{
		
		if (last >= first) {
		int m = first+(last-first)/2;
		
		System.out.println("middle man - "+m);
		
	
	            if(key == a[m])
				return m;
			if (a[m]>key)
			{
				return binarySearch(a,first,m-1,key);
			}else {
				return binarySearch(a,m+1,last,key);
			}
			
		}
		return -1;
		
	}

}

/*
 * 
 * 
 *    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
 * 
 * 
 */
