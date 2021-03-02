import java.util.*;


class Search{
	public int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }  
	
	public int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
 
            if (arr[mid] == x) 
                return mid; 
  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
   
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search ob = new Search();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements in array");
		int size = in.nextInt();
		int [] LinearArr = new int[size];
		System.out.println("enter the elements");
		for(int i = 0;i<size;i++){
			LinearArr[i] = in.nextInt();
		}
		System.out.println("enter the key");
		int key = in.nextInt();
		System.out.println(ob.linearSearch(LinearArr, key));
		System.out.println("enter the no of elements in array");
		int size2 = in.nextInt();
		System.out.println("enter the elemnts");
		int [] BinaryArr = new int[size2];
		for(int j = 0;j<size2;j++){
			BinaryArr[j] = in.nextInt();
		}
		System.out.println("enter the key");
		int key1 = in.nextInt();
		System.out.println(ob.binarySearch(BinaryArr, 0, size2-1, key1));
		

	}

}
