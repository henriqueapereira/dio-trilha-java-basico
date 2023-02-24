import java.util.Scanner;

public class Ex6_Fatorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numeroInformado;
    System.out.print("Qual número você deseja saber o fatorial: ");
    numeroInformado = scan.nextInt();
    int multiplicacao = 1;

    System.out.println("O fatorial de "+numeroInformado +" é: ");
    
    for (int i = numeroInformado; i >= 1; i--) {
      multiplicacao = multiplicacao * i;
      
    }

    System.out.println(multiplicacao);
    
    
  }
}

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario.
Ex: 5!=120
*/
