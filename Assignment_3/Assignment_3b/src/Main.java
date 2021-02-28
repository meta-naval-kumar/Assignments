import java.io.*;
import java.util.*;
class marksheet{
	/**
	 * find the average of grades
	 * @param grades array to add all the grades
	 * @param n no of grades 
	 * @return average of grades
	 * @throws ArithmeticException
	 */
	public float average(float [] grades,int n) throws ArithmeticException {
		float total = 0;
		for(int i = 0;i<n;i++){
			total = total + grades[i];
		}
		return total/n;
	}
	/**
	 * find the maximum grade
	 * @param grades array to search,and find the maximum grade
	 * @param n no of grades added
	 * @return maximum grade
	 * @throws ArithmeticException
	 */
	public float maximum(float [] grades, int n) throws ArithmeticException {
		float max = 0;
		for(int i = 0;i<n;i++){
			if(grades[i] > max){
				max = grades[i];
			}
		}
		return max;
	}
	/**
	 * find the minimum grade
	 * @param grades array to search,and find the minimum  grade
	 * @param n no of grades added
	 * @return minimum grade
	 * @throws ArithmeticException
	 */
	public float minmun(float [] grades, int n) throws ArithmeticException {
		float min = grades[0];
		for(int i = 1;i<n;i++){
			if(grades[i] < min){
				min = grades[i];
			}
		}
		return min;
	}
	
	/**
	 * find the percentage of no of students passed
	 * @param grades array to search,require to get all the grade more r equal to 40
	 * @param n no of grades added
	 * @return percentage of student passed
	 * @throws ArithmeticException
	 */
	public float percentage(float [] grades,int n) throws ArithmeticException {
		int count = 0;
		for(int i = 0;i<n;i++){
			if(grades[i]>=40.0){
				count++;
			}
		}
		float per = (float)count/n;
		return per * 100;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,code;
		Scanner in = new Scanner(System.in);
		marksheet grade = new marksheet();
		System.out.println("enter the no of students");
		n = in.nextInt();
		float [] grades = new float[n];
		System.out.println("enter the grades of students \n");
		for(int i = 0;i<n;i++){
			grades[i] = in.nextFloat();
		}
		System.out.println("select operation: \n 1. average \n 2. maximum \n 3. minimum \n 4. percentage ");
        try{
        	code = in.nextInt();
        	switch(code){
        	case 1:{
        		System.out.println(grade.average(grades, n));
        		break;
        	}
        	case 2:{
        		System.out.println(grade.maximum(grades, n));
        		break;
        	}
        	case 3:{
        		System.out.println(grade.minmun(grades, n));
        		break;
        	}
        	case 4:{
        		System.out.println(grade.percentage(grades, n) + "%");
        		break;
        	}
        	default: System.out.println("you have entered wrong key");
        	}
        }catch(Exception e){
        	System.out.println("enter int value only");
        }
	}

}
