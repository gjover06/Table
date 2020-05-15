import java.util.Scanner;

public class Table{
	public static void main(String[] args){
			 
			System.out.println("What is the x and y variable for line 1");
			Scanner keyboard = new Scanner(System.in);
			double x=keyboard.nextDouble();
			double y=keyboard.nextDouble();
			double minone= Math.min(x,y);
			
			System.out.println("What is the x and y variable for line 2");
			double line2x=keyboard.nextDouble();
			double line2y=keyboard.nextDouble();
			double mintwo=Math.min(line2x,line2y);
			
			System.out.println("What are the x and y variable for line 3");
			double line3x=keyboard.nextDouble();
			double line3y=keyboard.nextDouble();
			double minthree=Math.min(line3x,line3y);
			
			System.out.println("What are the x and y variable for line 4");
			double line4x=keyboard.nextDouble();
			double line4y=keyboard.nextDouble();
			double minfour=Math.min(line4x,line4y);
			
			System.out.println("What are the x and y variable for line 5");
			double line5x=keyboard.nextDouble();
			double line5y=keyboard.nextDouble();
			double minfive=Math.min(line5x,line5y);
			
			
	System.out.println("x       y         Min(x,y)");
	System.out.println("--------------------------");
	System.out.println("10      5"+"      "+minone);
	System.out.println("13     23"+"      "+mintwo);
	System.out.println(line3x+"  "+line3y+"  "+minthree);
	System.out.println(line4x+"   "+line4y+"  "+minfour);
	System.out.println(line5x+"    "+line5y+"  "+minfive);
	}//end main
	}// end Table