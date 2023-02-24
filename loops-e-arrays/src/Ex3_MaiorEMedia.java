import java.util.Scanner;

public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int maior = 0;
    int count = 0;
    int soma = 0;
    
    
    do {
      System.out.print("Numero: ");
      numero = scan.nextInt();
      
      soma = soma + numero;

      if (numero > maior) maior = numero;

      count++;
      
    } while(count < 5);    

    System.out.println("A soma dos números é: "+soma);
    
    int media = soma / 5;
    System.out.println("A média é: "+media);

    System.out.println("O maior número é: "+maior);
  }
}

/*
Faça um programa que leia 5 números e informe o maior número e a 
média desses números
*/
