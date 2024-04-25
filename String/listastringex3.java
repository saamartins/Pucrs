import java.util.Scanner;
public class numeroindeterminado{
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        System.out.println ("digite sua palavra ou SAIR para encerrar"); 
        String palavras= entrada.nextLine();
       
        while (palavras !="SAIR" ) {
        palavras = entrada.nextLine();
        int quantvogais = 0;
         for(int i=0; i<palavras.length(); i++){
               char vogal = palavras.charAt(i);
              if (vogal == 'a' || vogal=='i'|| vogal=='o'|| vogal=='e'|| vogal== 'u' || vogal=='A'||vogal== 'E'|| vogal=='I'|| vogal== 'O'|| vogal== 'U'){
                  
                  quantvogais++;
            }
         }
         
         System.out.println (" numero de vogais =  " + quantvogais);
         
         
         
    }
 }
}