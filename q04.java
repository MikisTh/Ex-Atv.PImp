import java.util.Scanner;

public class q04
{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        
		System.out.print("Informe sua data de nascimento para saber seu signo");

        System.out.print("Informe o dia");
        dia = input.nextInt(2);

		System.out.print("Informe o mês");
        mes = input.nextInt(2);
	   
	    System.out.print("Informe o ano para saber se é bissexto");
        ano = input.nextInt(4);
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.print(ano + " eh bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.print(ano + " O ano eh bissexto.");
        } else{
            System.out.print(ano + " O ano nao e um ano bissexto");
        }

        switch(mes) {		
            case 1: 
              // janeiro
              if ((dia>=21&&mes==1)||(dia<=19&&mes==2)) {
                System.out.println("Aquario");
            } else
                System.out.println("");				
              break;
              case 2: 
              // Fevereiro
              if ((dia>=19&&mes==2)||(dia<=20&&mes==3)) {
                System.out.println("Peixes");
            } else
                System.out.println("");				
              break;
              case 3: 
              // Março
              if ((dia>=21&&mes==3)||(dia<=20&&mes==4)) {
                System.out.println("Aries");
            } else
                System.out.println("");				
              break;
              case 4: 
              // Abril
              if ((dia>=20&&mes==4)||(dia<=20&&mes==5)) {
                System.out.println("Touro");
            } else
                System.out.println("");				
              break;
              case 5: 
              // Maio
              if ((dia>=21&&mes==5)||(dia<=21&&mes==6)) {
                System.out.println("Gemeos");
            } else
                System.out.println("");				
              break;
              case 6: 
              // Junho
              if ((dia>=22&&mes==6)||(dia<=22&&mes==7)) {
                System.out.println("Cancer");
            } else
                System.out.println("");				
              break;
              case 7: 
              // Julho
              if ((dia>=23&&mes==7)||(dia<=22&&mes==8)) {
                System.out.println("Leao");
            } else
                System.out.println("");				
              break;
              case 8: 
              // Agosto
              if ((dia>=23&&mes==8)||(dia<=22&&mes==9)) {
                System.out.println("Virgem");
            } else
                System.out.println("");				
              break;
              case 9: 
              // Setembro
              if ((dia>=23&&mes==9)||(dia<=22&&mes==10)) {
                System.out.println("Libra");
            } else
                System.out.println("");				
              break;
              case 10: 
              // Outubro
              if ((dia>=23&&mes==10)||(dia<=21&&mes==11)) {
                System.out.println("Escorpiao");
            } else
                System.out.println("");				
              break;
              case 11: 
              // Novembro
              if ((dia>=22&&mes==11)||(dia<=21&&mes==12)) {
                System.out.println("Sagitario");
            } else
                System.out.println("");				
              break;

              case 12: 
              // Dezembro
              if ((dia>=22&&mes==12)||(dia<=19&&mes==01)) {
                System.out.println("Capricornio");
            } else
                System.out.println("");				
              break;

            
          }

        if (){

        }
    }
}
