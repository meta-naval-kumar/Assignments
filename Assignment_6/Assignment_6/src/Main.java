
import java.util.Scanner;

class sparseMatrics{
	
	public int[][] transpose(int [][] matrics,int row ,int column){
		int [][] transpose = new int[row][column];
		for(int i = 0; i < column; i++)
    	{
      	    for(int j = 0; j < row; j++)
            {
               transpose[i][j] = matrics[j][i];
            }
            
        }
		return transpose;
	}
	public boolean symmetric(int  [][] matrics,int rows,int cols){
		  
	      boolean isSymmetric = false;
		  if(rows != cols)
	        {
	            System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
	        }
	        else
	        {
	           isSymmetric = true;
	             
	            for (int i = 0; i < rows; i++)
	            {
	                for (int j = 0; j < cols; j++)
	                {
	                    if(matrics[i][j] != matrics[j][i])
	                    {
	                        isSymmetric = false;
	                        break;
	                    }
	                }
	            }
	             
	        }
	         
	    
	    return isSymmetric;
	}
	
	public int [][] add(int [][] firstArr,int [][] secondArr,int row,int column){
		 
		int [][] res = new int[row][column];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				res[i][j] = firstArr[i][j] + secondArr[i][j];
			}
		}
		
		return res;
		
	}
	
	public int [][] multipy(int [][] firstArr,int [][] secondArr,int row,int col){
		int i,j,k;
		int C[][] = new int[row][col];
		if (row != col) { 
			  
	            System.out.println( 
	                "\nMultiplication Not Possible"); 
	           
	        } else{
	        	 for (i = 0; i < row; i++) { 
	                 for (j = 0; j < col; j++) { 
	                     for (k = 0; k < row; k++) 
	                         C[i][j] += firstArr[i][k] * secondArr[k][j]; 
	                 } 
	             } 
	       
	        }
		return C;
		
		  
	}
	

}
	
	
	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,key;
		Scanner s = new Scanner(System.in);
		sparseMatrics matric = new sparseMatrics();
		
		System.out.println("Select operations:\n 1. return transpose of the matrix \n 2.check whether it is a symmetrical matrix \n 3. add two matrices \n 4. multiply two matrices");
		System.out.println("enter key");
		try{
			key = s.nextInt();
			switch(key){
			case 1: {
				System.out.println("Enter  rows and columns: ");
				int row = s.nextInt();
				int column = s.nextInt();
				int array[][] = new int[row][column];
				System.out.println("Enter elements: ");
				for(i = 0; i < row; i++)
			  	{
			   	    for(j = 0; j < column; j++) 
			     	    {
			        	array[i][j] = s.nextInt();
			        	System.out.print(" ");
			            }
			  	}
				int [][] res = new int[row][column];
				res =  matric.transpose(array, row, column);
				for(i = 0; i < row; i++)
			  	{
			   	    for(j = 0; j < column; j++) 
			     	    {
			        
			        	System.out.print(res[i][j] + " ");
			            }
			   	 System.out.println();
			  	}
				break;
			}
			case 2:{
				System.out.println("Enter total rows and columns: ");
				int row = s.nextInt();
				int column = s.nextInt();
				int array[][] = new int[row][column];
				System.out.println("Enter elements: ");
				for(i = 0; i < row; i++)
			  	{
			   	    for(j = 0; j < column; j++) 
			     	    {
			        	array[i][j] = s.nextInt();
			        	System.out.print(" ");
			            }
			  	}
				System.out.println(matric.symmetric(array, row, column));
				break;
			}
			case 3:{
				int row1,col1,row2,col2;
				
			
				System.out.println("enter the rows and column of first matrics:");
				row1 = s.nextInt();
				col1 = s.nextInt();
				row2 = s.nextInt();
				col2 = s.nextInt();
				int [][] res = new int[row1][col2];
				System.out.println("enter the elements in first array");
				
				int [][] firstArr = new int[row1][col1];
				int [][] secondArr = new int[row2][col2];
				
				for(int k = 0;k<row1;k++)
				{
					for(int l = 0;l<col1;l++){
						firstArr[k][l] = s.nextInt();
					}
				}
				System.out.println("enter the elements in second array");
				for(int m = 0;m<row1;m++)
				{
					for(int n = 0;n<col1;n++){
						firstArr[m][n] = s.nextInt();
					}
				}
				res = matric.add(firstArr, secondArr, row2, col2);
				for(int m = 0;m<row1;m++)
				{
					for(int n = 0;n<col1;n++){
						System.out.print(res[m][n]+ " ");
					}
					System.out.println();
				}
				
			}
			case 4:{
				int row1,col1,row2,col2;
				System.out.println("enter the row and column of first matrix");
				row1 = s.nextInt();
				col1 = s.nextInt();
				System.out.println("enter the row and column of second matrix");
				row2 = s.nextInt();
				col2 = s.nextInt();
				int [][] res = new int[row1][col2];
				int [][] firstArr = new int[row1][col1];
				int [][] secondArr = new int[row2][col2];
				System.out.println("enter the elements in first array");
				for(int k = 0;k<row1;k++)
				{
					for(int l = 0;l<col1;l++){
						firstArr[k][l] = s.nextInt();
					}
				}
				System.out.println("enter the elements in second array");
				for(int m = 0;m<row1;m++)
				{
					for(int n = 0;n<col1;n++){
						secondArr[m][n] = s.nextInt();
					}
				}

				res = matric.multipy(firstArr, secondArr, row1, col2);
				for(int m = 0;m<row1;m++)
				{
					for(int n = 0;n<col1;n++){
						System.out.print(res[m][n]+ " ");
					}
					System.out.println();
				}
				
				
			}
			}
		}catch(Exception e){
			System.out.println("enter int value only");
		}
		
		
		

	}
	}

	
