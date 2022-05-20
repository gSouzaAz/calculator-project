package Fundamentos.Operadores;

import java.util.Scanner;

public class X_DesafioCalculadora {
 public static void main (String[] args) {
	 Scanner entry = new Scanner (System.in);
	 
	 System.out.println("Type the first number:");
	 String num1 = entry.nextLine();
	 double rNum1 = Double.parseDouble(num1);
	 
	 System.out.println("Type the second number:");
	 String num2 = entry.nextLine();
	 double rNum2 = Double.parseDouble(num2);
	 
	 System.out.println("Which count do you want to do?"+"\nExemples:"+"\nTo add, type 'add'"+"\nTo subtract, type 'subtract'"+
	 "\nTo count of times, type 'times'"+"\nTo division, type 'division'");
	 String option = entry.nextLine();
	 
	 entry.close();
	 
	 switch (option) {
	 case "add": System.out.println("The result is: "+ (rNum1 + rNum2));
	 break;
	 case "subtract": System.out.println("The result is: "+ (rNum1 - rNum2));
	 break;
	 case "times": System.out.println("The result is: "+ (rNum1 * rNum2));
	 break;
	 case "division": System.out.println("The result is: "+ (rNum1 / rNum2));
	 break;
	 default: System.out.println("There's no option like that one.");
	 }
 }
}
