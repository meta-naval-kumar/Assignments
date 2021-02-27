
import java.util.*;
class poly{
	public int evaluate(int [] var,int value){
		return var[0]*(int)Math.pow(value,var[1]);
	}
	public int degree(int [] var){
		return var[1];
	}
	public int[][] addPoly(int [][] array){
		int [][] result = new int[2][2];
		if(array[0][1] == array[1][1]){
			result[0][0] = array[0][0]+array[1][0];
			result[0][1] = array[0][1];
			return result;
		}
		
		return array;
	   
		
	}
	
	public int[] multipyPoly(int [] arr1,int [] arr2){
		int [] result = new int[2];
		result[0] = arr1[0] *  arr2[0];
		result[1] = arr1[1] + arr2[1];
		return result;
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int [] var = new int[2];
        int [][] poly1 = new int[2][2];
        int [] poly3 = new int[2];
		int [] poly4= new int[2];
		int [] mul = new int[2];
        
        int code,value;
        
        poly obj = new poly();
        System.out.println("Select operations:\n 1. evaluate \n 2. degree \n 3. addpoly \n 4.multiplyPoly");
	    System.out.println("enter code");
	    try{
	    	code = in.nextInt();
	    	switch(code){
		    case 1: {
		    	System.out.println("enter the value of var");
		    	value = in.nextInt();
		    	System.out.println(obj.evaluate(var, value));
		    	break;
		    }
		    case 2: {
		    	System.out.println(obj.degree(var));
		    	break;
		    }
		    case 3:{
		    	int [][] res = new int[2][2];
		    	System.out.println("enter the poly variable");
		    	for(int i = 0;i<2;i++){
		    		for(int j = 0;j<2;j++){
		    			poly1[i][j] = in.nextInt();
		    		}
		    	}
		    	res = obj.addPoly(poly1);
		    	for(int k = 0;k<res.length;k++){
		    		for(int l = 0;l<res.length;l++){
		    			if(res[k][k] ==0){
		    				break;
		    			}
		    			System.out.print(res[k][l] + " ");
		    		}
		    	}
		    	break;
		    }
		    case 4:{
		    	System.out.println("enter the polynominals");
		    	for(int i = 0;i<poly3.length;i++){
		    		poly3[i] = in.nextInt();
		    	}
		    	for(int j = 0;j<poly4.length;j++){
		    		poly4[j] = in.nextInt();
		    	}
		    	mul = obj.multipyPoly(poly3,poly4);
		    	for(int k = 0;k<mul.length;k++){
		    		System.out.println(mul[0] + mul[1]);
		    	}
		    	break;
		    }
		    default:System.out.println("pressed wrong key");
		    }
	    }catch(Exception e){
	    	System.out.println("choose integer only");
	    }
	    
	    
	    in.close();
	}

}

