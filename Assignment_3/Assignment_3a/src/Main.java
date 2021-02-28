import java.util.*;
class stringManipulation{
	public int compare(String s1,String s2){
		int flag = 0;
		for(int i = 0;i<s1.length();i++){
			if(s1.charAt(i) == s2.charAt(i)){
				flag = 1;
			}else{
				flag = 0;
				break;
			}
		}
		return flag;
	}
	public char [] reverse(String s){
		char [] rev = new char[20];
		for(int i = s.length()-1;i>=0;i--){
			rev[s.length() - i-1] = s.charAt(i);
		}
		return rev;
	}
	
	public char [] toUpper(String s){
		char [] res = new char[20];
		int numVal;
		for(int i = 0;i<s.length();i++){
			numVal = (int)s.charAt(i) - 32;
			res[i] = (char)numVal;
		}
		return res;
		
	}
	public int [] largest(String s){
		int [] count = new int[10];
		int j = 0,inc =0;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i) == ' '){
				count[j] = inc;
				inc = 0;
				j++;
			}
			inc++;
		}
		return count;
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code;
		stringManipulation ob = new stringManipulation();
		Scanner in = new Scanner(System.in);
		System.out.println("select operations: \n 1. compareString \n 2. reverse \n 3. convert to upperLetter \n 4. largest word");
		try{
			code = in.nextInt();
			switch(code){
			case 1:{
				String s1,s2;
				System.out.println("enter the strings");
				s1 = in.next();
				s2 = in.next();
				System.out.println(ob.compare(s1, s2));
				break;
				}
			case 2: {
				char [] res  = new char[20];
				int size;
				String s;
				System.out.println("enter the size and  string");
				size = in.nextInt();
				s = in.next();
				res = ob.reverse(s);
				for(int i = 0;i<size;i++){
					System.out.println(res[i]);
				}
				break;
				}
			case 3: {
				char [] res   = new char[20];
			    int size;
			    String name;
			    System.out.println("enter the size and name");
			    size = in.nextInt();
			    name = in.next();
			    res = ob.toUpper(name);
			    for(int i = 0;i<size;i++){
					System.out.println(res[i]);
				}
			    break;
				}
			case 4:{
				int [] res = new int[20];
				String para;
				para = in.next();
				res = ob.largest(para);
				int max = 0;
				for(int i = 0;i<res.length;i++){
					if(res[i] > max){
						max = res[i];
					}
				}
				System.out.println(max);
				break;
			}
			default:{
				System.out.println("you have entered wrong key");
			}
			}
		}catch(Exception e){
			System.out.println("use integer value only");
		}
		
		
	
	}

}
