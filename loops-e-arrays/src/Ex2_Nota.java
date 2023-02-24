import java.util.Scanner;

public class Ex2_Nota {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    
    System.out.print("Nota: ");
    nota = scan.nextInt();

    while(nota < 0 || nota > 10) {
      System.out.print("Nota Inválida! Digite novamente: ");
      nota = scan.nextInt();
    }
    System.out.println("Sua nota é: "+nota);
  }
}

/*
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo até
 * que o usuario informe um valor válido
 */
