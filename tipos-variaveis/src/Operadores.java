public class Operadores {

    public static void main(String[] args) {
    String concatenacao = "?";
    
    concatenacao = 1+1+1+"1";
    
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    
    System.out.println(concatenacao);
    
    concatenacao = 1+"1"+1+"1";
    
    System.out.println(concatenacao);
    
    concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);
    
    concatenacao = "1"+(1+1+1);


    int numero = 5;

    numero = -numero;

    System.out.println(numero);
    
    numero = numero * -1;

    System.out.println(numero);
    
    String nomeUm = "THAMIRES";
    String nomeDois = new String("THAMIRES");

    System.out.println(nomeUm.equals(nomeDois));

    int numero1 = 1;
    int numero2 = 2;
    
    boolean simNao = numero1 == numero2;

    if(numero1 < numero2){
        System.out.println("a nossa condicao é verdadeira");
    }

    System.out.println("numeroUm é igual a numeroDois? " + simNao);
   
    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente a numeroDois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior a numeroDois? " + simNao);


    }
}