import java.util.Scanner;
public class StrictlyIdentical {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//First i declare the variables for the arrays
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		//Then I create a for loop that allows the user to input only 5 different values
		System.out.println("Enter 5 elements of list1: ");
		for(int i = 0; i<5; i++)
		{
			array1[i] = input.nextInt();
		}
		
		//This second for loop allows the user to input the second set of 5 values
		System.out.println("Enter 5 elements of list2: ");
		for(int i = 0; i<5; i++) 
		{
			array2[i] = input.nextInt();
		}
		
		//This if statement will print out the corresponding statement depending on whether or not array1 equals array2
		if(equals(array1, array2))
		{
			System.out.println("Both arrays are strictly identical.");
			
			} else {
				
			System.out.println("Both arrays are not strictly identical.");

}

}
	//Next I create a method that determines whether the two arrays are exactly identical
	public static boolean equals(int[] array1, int[] array2) 
	{
		//This if statement says if array1 or array2 is equal to null OR if the length of the arrays are NOT equal to each other, it will return false
		if(array1 == null || array2 == null || array1.length != array2.length) 
			return false;
		boolean equal = true;
		
		//This for statement goes through each individual value inputed by the user and checks to see if they match exactly
		for(int i = 0; i<array1.length; i++) 
		{
			if(array1[i] != array2[i]) 
			{
				equal = false;
				break;
			}
		}
		return equal;

}

}