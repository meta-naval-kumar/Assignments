package assignment2;
import java.util.*;

class cal{
	public int[] convertHexa(String value1,String value2){
		int[] decimalValue = new int[2];
	    decimalValue[0] = Integer.parseInt(value1,16);
	    decimalValue[1] = Integer.parseInt(value2,16);
		return decimalValue;
	}
	public String add(String value1,String value2){
		int[] values = convertHexa(value1,value2);
		int addition = values[0] + values[1];
		return Integer.toHexString(addition);
	}
	public String sub(String value1,String value2){
		int[] values = convertHexa(value1,value2);
		int Subtraction = values[0] - values[1];
		return Integer.toHexString(Subtraction);
	}
	public String mul(String value1,String value2){
		int[] values = convertHexa(value1,value2);
		int multiplication = values[0] * values[1];
		return Integer.toHexString(multiplication);
	}
	public String div(String value1,String value2){
		int[] values = convertHexa(value1,value2);
		int divide = values[0] / values[1];
		return Integer.toHexString(divide);
	}
	public Boolean compareEqualtiy(String value1,String value2){
		int comp = value1.compareTo(value2);
		if(comp==0){
			return true;
		}else{
			return false;
		}
	}
	public Boolean compareGreatorThen(String value1,String value2){
		int comp = value1.compareTo(value2);
		if(comp>0){
			return true;
		}else{
			return false;
		}
	}
	public Boolean compareLessThen(String value1,String value2){
		int comp = value1.compareTo(value2);
		if(comp<0){
			return true;
		}else{
			return false;
		}
	}
	public int hexaTODecimal(String value1){
		int dec = Integer.parseInt(value1,16);
		return dec;
	}
	
	public String decimalTohexa(int value1){
		return Integer.toHexString(value1);
	}
}


public class hexaCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal ob = new cal();
		System.out.println("select no to perform operation");
		System.out.println("1.addition \n 2.substration \n 3. multiplication \n 4. divide \n 5. EqualtityComparision \n 6.greatorThen \n 7.lessThen \n 8. hexaToDecimal \n 9. decimalTohexa");
        Scanner in = new Scanner(System.in);
        try{
        	int code = in.nextInt();
        	switch(code){
            case 1:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println("addition " + ob.add(val1, val2));
            	break;
            }
            case 2:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println("sub " + ob.sub(val1, val2));
            	break;
            }
            case 3:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println("mul " + ob.mul(val1, val2));
            	break;
            }
            case 4:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println("divide " + ob.div(val1, val2));
            	break;
            }
            case 5:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println( ob.compareEqualtiy(val1, val2));
            	break;
            }
            case 6:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println(ob.compareGreatorThen(val1, val2));
            	break;
            }
            case 7:{
            	String val1 = in.next();
            	String val2 = in.next();
            	System.out.println(ob.compareLessThen(val1, val2));
            	break;
            }
            case 8:{
            	String val1 = in.next();
            	System.out.println(ob.hexaTODecimal(val1));
            	break;
            }
            case 9:{
            	int val1 = in.nextInt();
            	System.out.println(ob.decimalTohexa(val1));
            	break;
            }
            default: System.out.println("please enter the no between 1 to 9");
            }
        }catch(Exception e){
        	System.out.println("enter integer value");
        }
        in.close();
        
	}

}
