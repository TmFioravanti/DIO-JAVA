public class Documentacao {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /** este comando serve para documentar métodos e classes, normalmente é utilizado em cima da classe ou método que se quer documentar, não substitui as convenções e boas práticas.
         */

         
    }
    /** serve para que seja estudado a matéria do dia
     */
    public void estudar(){

    }
    /** Serve apenas para eu lembrar do comando que gera uma documentação das classes e métodos do meu projeto
     */
    public void documentacaoJavaDoc(){

        String codigo =" javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ..docs src*.java";
            System.out.println(codigo);
    }
}
