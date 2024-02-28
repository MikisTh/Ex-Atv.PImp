import java.util.Scanner;

public class q01
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int volume;
		System.out.println("Insira um valor inteiro para o volume:");
		volume = input.nextInt();
		
		if (volume <= 0) {
		   System.out.println("Min Volume");
		} 
		
		else if (volume > 0 && volume <= 25) {
		   System.out.println("Low Volume");
		} 
		
		else if (volume >= 25 && volume <= 75) {
		   System.out.println("Medium Volume"); 
		} 
		
		else if (volume > 75 || volume < 100) {
		   System.out.println("High Volume");  
		} 
		
		else if (volume >= 100) {
		    System.out.println("Max Volume"); 
		}
		
		
	}
}
