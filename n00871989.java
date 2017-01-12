//Nathan Wheeler Data Structures
import java.io.*; // for I/O
import java.util.*;

class n00871989
{
	public static int[] knapSack(int[] items, int target, int first, int size){

		if(target > 0)
		{
			
			for(int i= first; i < items.length; i++)
			{
				
				int [] answer = knapSack(items, target-items[i], i+1, size+1);

				if (answer != null)
				{
					answer[size] = items[i];
					return answer;
				}
			}

			return null;
		}

		else if(target==0)
		{
			int[] temp = new int[size];
			return temp;
		}
		
		else 
			return null;

	}



////////////////////////////////////////////////////////
public static void main(String[] args) throws IOException
{ 
while(true)
{
///The Setup
System.out.print("Enter a capacity and a series of weights. Enter \"stop\" to stop.");
Scanner sc = new Scanner(System.in);
String input;
input = sc.nextLine();
String[] strInputArray = input.split("\\s+");
int capacity;
int[] intInputArray = new int[strInputArray.length - 1];
for(int i = 0; i < intInputArray.length; i++){
intInputArray[i] = Integer.parseInt(strInputArray[i + 1]);
}
capacity = Integer.parseInt(strInputArray[0]);
if (input.equals("stop")){
System.out.println("\"stop\" was entered. Stopping program.");
return;
}

else{
//This is where the main code will go. We now have the capacity and the input array


int[] result = knapSack(intInputArray, capacity, 0, 0);
	    	if(result == null)
	    		System.out.println("No solution");
	    	else
	    		for(int j=0; j < result.length; j++)
	    			System.out.println(result[j]);
//knapsack(capacity, intInputArray);

   
//for(int i = 0; i < intInputArray.length ;i++){



} 
} 

}
}
