import java.util.Scanner;

public class q02 {

  public static void main(String[] args) {
    Scanner dado;
    dado = new Scanner(System.in);
    int a, b, c;

System.out.printIn("Digite o valor de a:\n");
 a = dado.nextInt();
 
System.out.printIn("Digite o valor de b:\n");
 b = dado.nextInt();

 System.out.printIn("Digite o valor de C:\n");
 c = dado.nextInt();

if((a < b) && (a < c)){
    if (b < c) {
         System.out.printIn("A ordem é:"+ c +" >= "+ b +" >= "+ a);
        } else {
        System.out.printIn("A ordem é:"+ a +" >= "+ b + " >= "+ c);
    }
    
}
if((b < a) && (b < c)){
    if (a < c) {
         System.out.printIn("A ordem é:"+ c +" >= "+ a +" >= "+ b);
        } else {
        System.out.printIn("A ordem é:"+ b +" >= "+ a + " >= "+ c);
    }
    
}
if((c < b) && (c < a)){
    if (b < a) {
         System.out.printIn("A ordem é:"+ a +" >= "+ b +" >= "+ c);
        } else {
        System.out.printIn("A ordem é:"+ c +" >= "+ b + " >= "+ a);
    }
    
}

  }
}



