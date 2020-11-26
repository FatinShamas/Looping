package looping;
import java.util.*;
public class ExerciseLoop {

	public static void main(String[] args) {
		
	//For Loop 1
	System.out.println("FOR LOOP");
	System.out.println("1.");
	int max = 5;
	for (int n = 1; n <= max; n++) {
		 System.out.println(n);
	}
	System.out.println();
		
	//while Loop 1.
	System.out.println("WHILE LOOP");
	System.out.println("1.");
	int i = 1, n= 5;
	while (i <= n) {
		System.out.println(i);
		i++;
	}
	System.out.println();
		
	//For Loop 2
    System.out.println("FOR LOOP");	
	System.out.println("2.");
	int total = 25;
	for (int number = 1; number <= (total / 2); number++) {
	    total = total - number;
	    System.out.println(total + " " + number);
	}
	System.out.println();
	
	//While Loop 2
    System.out.println("WHILE LOOP");	
    System.out.println("2.");
    int Total = 25, num = 1;
    while (num <= (Total/2)) {
    	Total = Total - num;
    	System.out.println(Total + " " + num);
    	num++;
    
    }
    System.out.println();
   
    //For Loop 3.
    System.out.println("FOR LOOP");	
    System.out.println("3.");
	for (int x = 1; x <= 2; x++) {
	    for (int j = 1; j <= 3; j++) {
	        for (int k = 1; k <= 4; k++) {
	            System.out.print("*");
	        }
	        System.out.print("!");
	    }
	    System.out.println();
	}
	System.out.println();
	
	//While Loop 3.
	System.out.println("WHILE LOOP");
	System.out.println("3.");
	int x =1;
	while (x <= 2) {
		x++;
		int j =1;
		while (j <= 3) {
			j++;
			int k =1;
			while (k <= 4) {
				k++;
				System.out.print("*");
			}
			 System.out.print("!");
		}
		System.out.println();
	}
	System.out.println();
	
	//For Loop 4
	System.out.println("FOR LOOP");
	System.out.println("4.");
	int number = 4;
	for (int count = 1; count <= number; count++) {
	    System.out.println(number);
	    number = number / 2;
	}
	System.out.println();
	
	//While Loop 4
	System.out.println("WHILE LOOP");
	System.out.println("4.");
	int num1 =4;
	int count =1;
	while (count <= num1) {
		count++;
		System.out.println(num1);
		num1 = num1 /2;
		
	}


	
	}
}

	

    	
    
	


	
	
   
	




