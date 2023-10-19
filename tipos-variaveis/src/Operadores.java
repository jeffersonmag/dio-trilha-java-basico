public class Operadores {
    public static void main(String[] args) {
        String nomeCurso = "LINGUAGUEM " + "JAVA";
        System.out.println(nomeCurso);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); //31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); //1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); //1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); //1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); //13

        int positivo = +5; //operador unitario positivo
        int negativo = -5; //operador unitario negativo

        int valor = 10;

        int incremento = ++valor; //operador unitario incremento antes
        int decremento = -- valor; //operador unitario decremento antes

        incremento = valor++; //operador unitario incremento depois
        decremento = valor--; //operador unitario decremento depois


    }

}
