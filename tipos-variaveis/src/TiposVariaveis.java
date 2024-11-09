public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2.500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;/*Aqui entende-se que em algum momento esse numero curto 2 que é short pode ser ultrapassado de seu limite, para isso usamos o cast, mas  não é comum */

        int numero = 1;

        numero = 10;

        final double PI = 3.14;

        /*Toda variavel que seja constante deve-se usar final, tipo e o nome da variavel em letra maiúscula */

        



    }
}
