import java.util.*;

class area{
	public double triangle(double width,double height){
		return 0.5*width*height;
	}
	public double rectangle(double width,double height){
		return width*height;
	}
	public double square(double width){
		return width*width;
	}
	public double circle(double radius){
		return 3.14 * radius * radius;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area shape = new area();
		Scanner in = new Scanner(System.in);
		int code;
		System.out.println("select operation: \n 1. area of triange \n 2. area of rectange \n 3. area of square \n 4. area of circle");
        try{
        	code = in.nextInt();
        	switch(code){
        	case 1:{
        		double width,height;
        		System.out.println("enter the widht and height");
        		width = in.nextDouble();
        		height = in.nextDouble();
        		System.out.println(shape.triangle(width, height));
        		break;
        	}
        	case 2:{
        		double width,height;
        		System.out.println("enter the widht and height");
        		width = in.nextDouble();
        		height = in.nextDouble();
        		System.out.println(shape.rectangle(width, height));
        		break;
        	}
        	case 3:{
        		double width;
        		System.out.println("enter the widht ");
        		width = in.nextDouble();
        		System.out.println(shape.square(width));
        		break;
        	}
        	case 4:{
        		double radius;
        		System.out.println("enter the radius");
        		radius = in.nextDouble();
        		System.out.println(shape.circle(radius));
        		break;
        	}
        	default:System.out.println("enter wrong key");
        	}
        	
        }catch(Exception e){
        	System.out.println("enter int value only");
        }
	}

}
