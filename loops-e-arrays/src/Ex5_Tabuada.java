import java.util.Scanner;

public class Ex5_Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numeroInformado;
//  int numeroSeq = 0;

    System.out.print("Qual tabuada você deseja saber: ");
    numeroInformado = scan.nextInt();

    System.out.println("**Tabuada do "+numeroInformado +"**");
    /*
    do{
      
      System.out.println(numeroInformado +" X "+numeroSeq +" = "+(numeroInformado*numeroSeq));
      numeroSeq++;
    } while(numeroSeq < 11);
     */

    for(int i = 1; i <= 10; i++) {
      System.out.println("   "+numeroInformado +" X "+i +" = "+(numeroInformado*i));
    }
  }
}

/*
Desenvolva uma gerador de tabuada, capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10. O usuario deve informar de qual número ele deseja ver a tabuada. A saida deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/