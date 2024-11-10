public class Operadores {
   public static void main(String[] args) {
         
    /*Operadores lógicos =  ==  !=  >  <  >=   */

    double soma = 10.5 + 15;
    int subtracao = 100 - 25;
    int multiplicacao = 10 * 30;
    int divisao = 500 / 10;
    int modulo = 18 % 3;
    double resultado = (10 * 7)+(20 / 4);
     /*Contatenar textos usamos tambem o operador logico + */

     String nomeCompleto = "LINGUAGUEM"+"JAVA";
      System.out.println(nomeCompleto);
     /*Resultado LINGUAGEMJAVA */

     String nomeCompleto2 = "LINGUAGUEM"+" "+"JAVA";
      System.out.println(nomeCompleto2);
     /*Resultado LINGUAGEM JAVA */
    
     int numero = 5;
     numero = - numero;
     System.out.println(numero);
     /*para tornar o numero novamente positivo devemos multiplica-lo por -1, já que o + é um operador aritmetico e não funciona para simplesmente torna-lo positivo */
     numero = numero * -1;
     System.out.println(numero);

     numero = ++ numero;
     System.out.println(numero);

     boolean numeroReal = true;
     System.out.println(!numeroReal);/*aqui só faz a modificação em memória, o valor da variavel continua sendo true */
     System.out.println(numeroReal);
     /*para tornar a variavel false seria necessário reatribuir o valor */
     numeroReal = !numeroReal;
     System.out.println(numeroReal);

     /*OPERADOR TERNARIO  ONDE  encontramos <eXPRESSÃO CONDICIONAL>? <CONDIÇÃO CASO SEJA true> : <CONDIÇÃO CASO SEJA false>*/
     int a, b;
     a = 5;
     b = 6;

    /* String resulta = "";
      if (a == b) {
         resulta= "verdadeiro";
         
      }else{
         resulta = "falso";
      }

      System.out.println(resulta);
       */ 
      String resulta = a==b ? "Verdadeiro" :"Falso";
      System.out.println(resulta);


      /*Operadores e &&      ou | */

      boolean condicao1 = true;

      boolean condicao2 = false;

      if (condicao1 && condicao2) {
         System.out.println("As duas condições são verdadeiras!");
      }else{
         System.out.println("Uma das duas condições não é verdadeira");
      }
      
      if (condicao1 || condicao2) {
         System.out.println("Uma das condições são verdadeiras!");
      }
      
      System.out.println("fim");
   }

}
