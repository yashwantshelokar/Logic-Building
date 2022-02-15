package Star;

import java.util.Scanner;

public class StringManipulation
{
  public static void main(String[] args)
  {
	   Scanner sc = new Scanner(System.in);
		System.out.println("please enter your array size");

		int size = sc.nextInt();
	    int arr[] = new int[size];
  
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println("insert your element");

			int element = sc.nextInt();
			arr[i]=element;

     }
      for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
  
  }
}
