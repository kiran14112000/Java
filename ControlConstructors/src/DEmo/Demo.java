package DEmo;

import java.util.Scanner;   
public class Demo {
	public static void main(String[] args) {
		
/// CONDITIONAL CONTROLL CONSTRANTS (or) SELLECTION STATEMENTS
                 // simple if		
		
		
	/*  Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Percentage");
		int marks=scan.nextInt();
		if(marks>90)
		{
			System.out.println("Welcome to Techclub");
		}  */
		
		
		
		         // if else
		
		
	 /* Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Age");
		int Age=scan.nextInt();
 		if(Age>18)
		{
			System.out.println("You are Eleigable for voting");
		}
		else
		{
			System.out.println("You are not Eleigable for voting");
		}  */
		
		
		
		
		         // else if ladder
		
		
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("Enter The marks");
		int marks=scan.nextInt();
 		if(marks<50)
 		{
 			System.out.println("D Grade");
 		}
 		else if(marks>=50 && marks<60)
 		{
 			System.out.println("C Grade");
 		}
 		else if(marks>=60 && marks<70)
 		{
 			System.out.println("B Grade");
 		}
 		else if(marks>=70 && marks<80)
 		{
 			System.out.println("A Grade");
 		}
 		else 
 		{
 			System.out.println("A+ Grade");
 		} */	
		
	
		
		
      
	            // switch
	
/*  Scanner scan=new Scanner(System.in);
	System.out.println("Enter + or - or * or /");
	char opt=scan.next().charAt(0);
	switch(opt)
	{
	case '+':
		System.out.println("Addition Operator");
		break;
	case '-':
		System.out.println("Subtraction Operator");
		break;
	case '*':
		System.out.println("Multiplication Operator");
		break;
	case '/':
		System.out.println("Division Operator");	
		break;
	default :
		System.out.println("Enter proper Character");
	}  */

		
		
		
/// LOOPING CONTROLL CONSTRANTS
		
		
		             // For Loop
		
		
	/*	
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}  
		  */
		
		
		
		
		
		             // While Loop
		
	/*	
		int energylevel=8;
		while(energylevel>=1)
		{
			System.out.println("Kodman is fighting and energy level is " + energylevel);
			energylevel--;
		}  
		   */
		
		
		
		
		
		            // do While Loop
		
	/*	
		Scanner scan=new Scanner(System.in);
		int pageno=100;
		boolean board=true;
		int i=1;
		do
		{
			System.out.println("Kodman read page "+i);
			i++;
			System.out.println("Do you want to continue ?");
			board=scan.nextBoolean();
	}while(board);
	               */
		
		
		
		
		
/// JUMPING CONTRIL CONSTRUCT
		
		          // BREAK
	/*	
		for(int i=1;i<=5;i++)
		{
			System.out.println("i = " + i);
			break;
		}
		System.out.println("Out of Construct");
		        */
		
		
		
		
		
		
		         // CONTINUE
		
		/*
		for(int i=1;i<=5;i++)
		{
			System.out.println("i = " + i);
			if(i==3)
			{
			continue;
		    }
		System.out.println("KodNest");
		}
		System.out.println("Out of construct");
		        */
		
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("i = " + i);
			if(i==3)
			{
				System.out.println("omkar");
			    break;
		    }
			else
			{
		      System.out.println("Prahllad");
		    }
			System.out.println("KodNEst");
		}
		System.out.println("Out of construct");
		        
  }   
}
