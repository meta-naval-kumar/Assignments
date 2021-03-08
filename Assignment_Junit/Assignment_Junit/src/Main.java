import java.util.Scanner;

class ArrOperation{
	public int  maxMirror(int [] nums) {
		int max = 0;
		try{
			if(nums == null){
				throw new Exception("Assertion error");
			}
			int len = nums.length;
			int count= 0;
			
			for (int i = 0; i < len; i++){
				count=0;
				for (int j = len-1; i + count < len && j > -1; j--){
					if(nums[i+count] == nums[j]){
						count++;
						}
					else{
						if (count > 0){
							max = Math.max(count,max);
								count = 0;
								}
						}
					}
				max = Math.max(count,max);
				}
			
		}catch(Exception e){
			System.out.println(e);
		}
			
		 return max;
	}
	
	public int clumps(int [] arr){
		int count = 0;
		try{
			if(arr == null){
				throw new Exception("Assertion error");
			}
			int max = 0;
			for(int i = 0;i<arr.length;i++){
				if(arr[i] > max){
					max = arr[i];
				}
			}
			int [] freq = new int[max+1];
			for(int j = 0;j<freq.length;j++){
				freq[j] = 0;
			}
			for(int i = 0;i<arr.length;i++){
				int temp = freq[arr[i]];
			    freq[arr[i]]  = temp + 1;
			}
			
			for(int i = 0;i<freq.length;i++){
				if(freq[i] >= 2){
					count++;
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return count;
	}
	
	public int [] solveXY(int [] arr,int x,int y){
		try{
			if(arr == null){
				throw new Exception("Assertion error");
			}
			int totalX = 0,totalY = 0;
			for(int k = 0;k<arr.length;k++){
				if(arr[k] == x){
					totalX++;
				}
				if(arr[k] == y){
					totalY++;
				}
			}
			if(totalX != totalY){
				throw new Exception("Assertion error");
			}
			if(arr[arr.length - 1] == x){
				throw new Exception("Assertion error");
			}
			int temp;
			int [] tempX = new int[10];
			int [] tempY = new int[10];
			int countX = 0,countY = 0;
			for(int i = 0;i<arr.length;i++){
				if(arr[i] == x){
					tempX[countX] = i;
					countX++;
				}
				if(arr[i] == y){
					tempY[countY] = i;
					countY++;
				}
			}
			for(int j = 0;j<2;j++){
				if(arr[tempX[j]+1] != 5){
					temp = arr[tempY[j]];
					arr[tempY[j]] = arr[tempX[j]+1];
					arr[tempX[j]+1] = temp;
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		return arr;
	}

	public int splitArray(int [] arr){
		int sum = 0, tempSum = 0,val = 0;
		try{
			if(arr == null){
				throw new Exception("Assertion error");
			}
			for(int i =0;i<arr.length;i++){
				sum = sum + arr[i];
			}
			if(sum % 2 == 0){
				return -1;
			}else{
				for(int i = 0;i<arr.length;i++){
					if(tempSum == sum/2){
						val = i;
						break;
					}else{
						tempSum  += arr[i];
					}
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return val;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int [] nums = new int[size];
		for(int i = 0;i<size;i++){
			nums[i] = input.nextInt();
		}
		ArrOperation op = new ArrOperation();
		System.out.print("MaxMirror: ");
		System.out.println(op.maxMirror(nums));
		System.out.print("Clumps: ");
		System.out.println(op.clumps(nums));
		System.out.print("splitArray: ");
		System.out.println(op.splitArray(nums));
		System.out.print("SolveXY: ");
		int [] arr = (op.solveXY(nums, 4, 5));
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		input.close();
	}

}
