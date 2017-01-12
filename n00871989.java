import java.io.*; // for I/O
import java.util.*;

class n00871989
{
  //Sums the array
   public static int sumArray(int[] array){
   int sum = 0;
   for (int i = 0; i<array.length; i++){
	sum += array[i];
   }
   return sum;
	}
   
//Knapsack function
public static int[] knapsack(int capacity, int[] ar){
  
    if ( ar.length == 0 ) {
    return ar;
        }
        
  

int[] nar = new int[ar.length-1];
System.arraycopy(ar, 1, nar, 0, nar.length);
int sum = sumArray(ar); // sum of ar is 37
if(sum == capacity){
   System.out.print("Equal to");
	return  ar;
}
//Base Case



int first = ar[0];
int newWeight = capacity - first;

//First item is too small
if (first < capacity){
System.out.print(first);
System.out.print("Less than");
System.out.print(capacity);
knapsack(newWeight, nar);
}
else if (first > capacity){
System.out.print(first);
System.out.print("Greater than");
System.out.print(capacity);
knapsack(capacity, nar);
}

System.out.print(Arrays.toString(ar));

return ar;
}
//

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



int result[] = knapsack(capacity, intInputArray);

   
//for(int i = 0; i < intInputArray.length ;i++){



} 
} 

}
}
