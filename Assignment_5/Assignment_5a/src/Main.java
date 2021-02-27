import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class inSet{
	private int count = 0;
	public Boolean isMember(int x,int [] list){
		for(int i = 0;i<list.length;i++){
			if(i==x){
				return true;
			}
		}
		return false;
	}
	
	public int size(int [] list){
		return list.length;
		
	}
	public Boolean isSubSet(int [] set,int [] list){
		for(int i=0;i<list.length;i++){
			if(list[i] == set[0]){
				for(int j=0;j<set.length;j++){
					if(list[i] == set[j]){
						count++;
						
					}else{
						count  = 0;
					}
				}
			}
			if(count == set.length){
				return true;
			}
			
		}

		return false;
		
	}
	public int getComplement(int x ){
		return ~x;
	}
	public void union(Integer[] firstArray, Integer [] secondArray){
		HashSet<Integer> set = new HashSet<>(); 
	       
	      set.addAll(Arrays.asList(firstArray));
	       
	      set.addAll(Arrays.asList(secondArray));
	       
	      System.out.println(set);
	      Integer[] union = {};
	    union = set.toArray(union);
	     
	    System.out.println(Arrays.toString(union));
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Integer [] firstArray = new Integer[1000];
		    Integer [] secondArray = new Integer[1000];
		    int [] list = new int[]{1,2,5};
		    int [] subSet = new int[1000];
		    int code,x,subSetSize,complementVar,firstSize,secondSize;
			inSet obj = new inSet();
			Scanner in = new Scanner(System.in);
			
			System.out.println("Select operations:\n 1. isMember \n 2. size \n 3. isSubSet \n 4. getComplement \n 5. union");
			try{
				code = in.nextInt();
				switch(code){
				case 1:{
					System.out.println("Enter the value of x");
					x = in.nextInt();
					System.out.println(obj.isMember(x, list));
					break;
					}
				case 2: {
					System.out.println(obj.size(list));
					break;
				}
				case 3:{
					System.out.println("Enter the subset and size");
					subSetSize = in.nextInt();
					for(int i = 0;i<subSetSize;i++){
						subSet[i] = in.nextInt();
					}
					System.out.println(obj.isSubSet(subSet, list));
					break;
				}
				case 4:
				{
					System.out.println("Enter the value of var");
					complementVar = in.nextInt();
					System.out.println(obj.getComplement(complementVar));
					break;
					
				}
				case 5:{
					System.out.println("enter the size of two array");
					firstSize = in.nextInt();
					secondSize = in.nextInt();
					for(int i = 0;i<firstSize;i++){
						firstArray[i] = in.nextInt();
					}
					for(int j = 0;j<secondSize;j++){
						secondArray[j] = in.nextInt();
					}
					obj.union(firstArray, secondArray);
					break;
				}
				default: System.out.println("you have entered wrong code");
				}
			}catch(Exception e){
				System.out.println("enter only integer value");
			}
			
			
			in.close();
	}

}
