import java.util.Scanner;
import java.util.*;
import java.lang.*;

 

class GetInputFromUser

{

 public static void main(String args[])

 {

 int arraySize; // Size of the Array

 

 Scanner in = new Scanner(System.in);

 

 // get the size of the array

 System.out.println("what is the size of your arrays?");

 arraySize = in.nextInt();

 System.out.println("You entered integer "+arraySize);

 

 // Filling the arrays

 int[] arrayA = new int[arraySize];

  System.out.println("Please fill the first array: ");

 for(int j=0; j<arraySize; j++)

	 arrayA[j]=in.nextInt();

 

// Testing that the elements are filling the array

// System.out.println("Array A elements are: ");

// for(int i=0; i<arraySize; i++)

// System.out.println(arrayA[i]+",");

 

 int[] arrayB = new int[arraySize];

 

 System.out.println("Please fill the second array: ");

 for(int j=0; j<arraySize; j++)

	 arrayB[j]=in.nextInt();

 System.out.println("The " + arraySize+"th largest number is: "+conqueredValue(arrayA, arrayB, arraySize));
 


 }


public static int conqueredValue(int[] arrayA, int[] arrayB, int arraySize) 
{
	// base case
	if(arraySize == 1)
	{
		if (arrayA[0] > arrayB[0])
			return arrayA[0];
		else
			return arrayB[0];
	}
	else
	{
		 int middleValue = arraySize/2;
		 int newSize;
		 
		 if(arraySize%2==0)
		 {
			 newSize = arraySize/2;
		 }
		 else
		 {
			 newSize = arraySize/2+1;
		 }
		 

		 int[] dividedArrayA = new int[newSize];

		 int[] dividedArrayB = new int[newSize];
		 
		 if(arrayA[middleValue] > arrayB[middleValue])
		 {
			 for(int i = 0; i<newSize; i++)
			 {
				 dividedArrayA[i]= arrayA[i];
			 }
			 for(int i = 0; i<newSize; i++)
			 {
				 dividedArrayB[i] = arrayB[i+middleValue];
			 }
		 }
		 else
		 {
			 for(int i = 0; i<newSize; i++)
			 {
				 dividedArrayA[i]= arrayA[i+middleValue];
			 }
			 for(int i = 0; i<newSize; i++)
			 {
				 dividedArrayB[i] = arrayB[i];
			 }
		 }
		 return conqueredValue(dividedArrayA, dividedArrayB, newSize);
	}
}
	
}


