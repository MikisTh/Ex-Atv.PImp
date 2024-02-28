import java.util.Scanner;

public class q03
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
		float a, b, c,
              delta,         
              sqrtdelta,     
              raiz1,raiz2;   
    
    
    
    System.out.println("Equação do 2º grau: ax² + bx + cx = 0");
    System.out.print("Entre com o valor de a: ");
    a = entrada.nextFloat();
    System.out.print("Entre com o valor de b: ");
    b = entrada.nextFloat();
    System.out.print("Entre com o valor de c: ");
    c = entrada.nextFloat();
        
   
    if(a != 0){
    
      delta = (b*b) - (4*a*c);
      sqrtdelta = (float)Math.sqrt(delta);
      
     if(delta >=0){
      raiz1 = ((-1)*b + sqrtdelta)/(2*a);
      raiz2 = ((-1)*b - sqrtdelta)/(2*a);
      System.out.printf("As raízes são: %.2f e %.2f", raiz1, raiz2);
     }  
      
     else {
      delta = -delta;
      sqrtdelta = (float)Math.sqrt(delta);
      System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
      System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));             
    }            
   }
    else {
     System.out.println("Coeficiente não pode ser zero");
   }
  } 
} 