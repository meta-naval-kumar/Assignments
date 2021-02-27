package assignment3;
import java.util.*;

public class jobScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no of process");
		int n = in.nextInt();
		int pid[] = new int[n];
		int arrivalT[]  = new int[n];
		int burstT[] = new int[n];
		int completeT[] = new int[n];
		int turnAroundT[] = new int[n];
		int waitingT[] = new int[n];
		int temp;
		float averageWt = 0,averageTa = 0;
		
		for(int i = 0;i < n; i++){
			System.out.println("enter process " + (i+1)+ " arrival time:");
			arrivalT[i] = in.nextInt();
			System.out.println("enter process " + (i+1)+ " burst time:");
			burstT[i] = in.nextInt();
		}
		
		for(int i = 0;i < n; i++){
			for(int j=0;j<n-(i+1);j++){
				if(arrivalT[j]>arrivalT[j+1]){
					temp = arrivalT[j];
					arrivalT[j] = arrivalT[j+1];
					arrivalT[j+1] = temp;
					temp = burstT[j];
					burstT[j] = burstT[j+1];
					burstT[j+1] = temp;
					temp = pid[j];
					pid[j] = pid[j+1];
					pid[j+1] = temp;
				}
			}
		}
		
		for(int i = 0;i<n;i++){
			if(i == 0){
				completeT[i] = arrivalT[i] + burstT[i];
			}else{
				if(arrivalT[i]>completeT[i-1]){
					completeT[i] = arrivalT[i] + arrivalT[i];
					
				}else{
					completeT[i] = completeT[i-1] + burstT[i];
				}
				turnAroundT[i] = completeT[i] - arrivalT[i];
				waitingT[i] = turnAroundT[i] - burstT[i];
				averageWt += waitingT[i];
				averageTa  += turnAroundT[i];
				
			}
			System.out.println("\npid  arrival brust complete turn waiting");
			for(int j =0;j<n;j++){
				System.out.println(pid[j] + "  \t" + arrivalT[j] + "\t" + completeT[j]+ "\t" + turnAroundT[j] + "\t" + waitingT[j]);
			}
			in.close();
			System.out.println("\n average waiting time:" + (averageWt/n));
			System.out.println("average turnaround time:" +(averageTa/n));
		}
		}
          
	}


