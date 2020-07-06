package extenso;
import java.util.Scanner;
public class EXTENSO 
{
    public static void main(String[] args) 
    {
        int exit = 1;
        while(exit != 0) //continuar enquanto o comando para sair for diferente de 0
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("escreva um valor de 0 a 999: ");
            int v = sc.nextInt();
            System.out.println(extenso(v));
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        }
    }
    public static String extenso(int v) 
    {
        int u = v / 1 % 10;
        int d = v / 10 % 10;
        int c = v / 100 % 10;

        String[] unidade,dezena,dezenaespecial,centena;
        {  
          unidade        = new String[10];
          dezena         = new String[10];
          dezenaespecial = new String[10];
          centena        = new String[10];
          
          unidade[0] = "";
          unidade[1] = "um";
          unidade[2] = "dois";
          unidade[3] = "três";
          unidade[4] = "quatro";
          unidade[5] = "cinco";
          unidade[6] = "seis";
          unidade[7] = "sete";
          unidade[8] = "oito";
          unidade[9] = "nove";
          
          dezena[0] = "";
          dezena[1] = "dez";
          dezena[2] = "vinte";
          dezena[3] = "trinta";
          dezena[4] = "quarenta";
          dezena[5] = "cinquenta";
          dezena[6] = "sessenta";
          dezena[7] = "setenta";
          dezena[8] = "oitenta";
          dezena[9] = "noventa";
          
          dezenaespecial[0] = "dez";
          dezenaespecial[1] = "onze";
          dezenaespecial[2] = "doze";
          dezenaespecial[3] = "treze";
          dezenaespecial[4] = "quatorze";
          dezenaespecial[5] = "quinze";
          dezenaespecial[6] = "dezesseis";
          dezenaespecial[7] = "dezessete";
          dezenaespecial[8] = "dezoito";
          dezenaespecial[9] = "dezenove";
          
          centena [0] = "";
          centena [1] = "cento";
          centena [2] = "duzentos";
          centena [3] = "trezentos";
          centena [4] = "quatrocentos";
          centena [5] = "quinhentos";
          centena [6] = "seiscentos";
          centena [7] = "setecentos";
          centena [8] = "oitocentos";
          centena [9] = "novecentos";
        }
        if (v == 100) return ("cem");
        if (c != 0 && d == 0 && u == 0) return (centena[c]);
        if (c == 0 && d != 0 && u == 0) return (dezena[d]);
        if (c == 0 && d == 0 && u != 0) return (unidade[u]);
        if (c != 0 && d == 0 && u != 0) return (centena[c]+""+dezena[d]+" e "+unidade[u]);
        if (c != 0 && d != 0 && u != 0) return (centena[c]+" e "+dezena[d]+" e "+unidade[u]);
        if (c != 0 && d != 0 && u == 0) return (centena[c]+" e "+dezena[d]+""+unidade[u]);
        if (v <20 && v>9) return (dezenaespecial[u]);
        else return ("valor inválido!");
    }
}