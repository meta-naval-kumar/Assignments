class Recursion{
	 public  int hcf(int a, int b) 
	    { 
	        if (a == 0) 
	            return b;  
	        return hcf(b % a, a);  
	    } 
	      
	    
	    public int lcm(int a, int b) 
	    { 
	        return (a / hcf(a, b)) * b; 
	    } 
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 15, b = 20; 
		 Recursion ob = new Recursion();
	        System.out.println("LCM of " + a + 
	                           " and " + b +  
	                      " is " + ob.lcm(a, b)); 
	        System.out.println("HCF of " + a + 
                    " and " + b +  
               " is " + ob.hcf(a, b)); 

	}

}
