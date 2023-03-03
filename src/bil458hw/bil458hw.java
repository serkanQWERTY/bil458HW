package bil458hw;

import java.util.Scanner;

public class bil458hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // year to be checked
		
	    int year;
	    boolean leap = false;

	    System.out.print("Please Enter a Year!");
	    Scanner sc = new Scanner(System.in);
	    year=sc.nextInt();
	   // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	}
}