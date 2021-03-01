import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class item{
	private int price;
	private int quantity;
	private int id;
	public item(int id,int price,int quantity){
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId(){
		return this.id;
	}
	public int getPrice(){
		return this.price;
	}
	public int getQuantity(){
		return this.quantity;
	}
}
class product{
	public void remove( HashMap<String, Integer> cartPrice,String name){
		cartPrice.remove(name);
	}
	
	public void genrateBill(HashMap<String, Integer> cartPrice,item [] cart){
		
	    int total = 0;
		System.out.println("name \t quantity \t price");
	
		for(Map.Entry<String, Integer> set : cartPrice.entrySet()){
		System.out.println(set.getKey() +"\t " + cart[set.getValue()].getQuantity()+"\t " + cart[set.getValue()].getPrice());
	    total = total + cart[set.getValue()].getQuantity()*cart[set.getValue()].getPrice();
	}
		System.out.println("total: " + total);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit, code, counter = 0,id = 0,repeat = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the stock limit of cart");
		limit = in.nextInt();
		item [] cart = new item[limit];
		product show = new product();
	    HashMap<String, Integer> cartPrice = new HashMap<String,Integer>();
	    System.out.println("select operation: \n 1. add items \n 2. remove items \n 3. generate bill \n 4. exit press 0");
        while(repeat!=0){
        	try {
        		System.out.println("enter choice");
            	code = in.nextInt();
            	switch(code){
            	case 0:{
            		repeat = 0;
            		break;
            	}
            	case 1:{
            		String name;
            		int price,quant;
            		System.out.println("enter the name ,price and quantity of the item");
            		name  = in.next();
            		price = in.nextInt();
            		quant = in.nextInt();
            		if(cartPrice.containsKey(name)){
            			int tempId = cartPrice.get(name);
            			int tempQuantity = cart[tempId].getQuantity() + quant;
            			cart[tempId] = new item(tempId,price,tempQuantity);
            		}else{
            			cart[counter] = new item(id,price,quant);
            			cartPrice.put(name, id);
            		}
            		

            		counter++;
            		id++;
            		break;
            		
            		
            	}
            	case 2:{
            		String name;
            		System.out.println("enter the name to be removed");
            		name = in.next();
            		show.remove(cartPrice, name);
            		break;
            	}
            	case 3:{
            		show.genrateBill(cartPrice, cart);
            		break;
            	}
            	default:System.out.println("enter int value only");
            	}
            	
            	
            }catch(Exception e){
            	System.out.println("enter int value only");
            }
        	
        }
	}

}
