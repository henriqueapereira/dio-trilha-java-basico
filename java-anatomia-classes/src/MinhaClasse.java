public class MinhaClasse {
  public static void main(String[] args) {
    
    String primeiroNome = "Henrique";
    String segundoNome = "Pereira";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  // criando um método
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}