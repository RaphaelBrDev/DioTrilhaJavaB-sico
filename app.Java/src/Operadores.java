public class Operadores {

    public static void main (String [] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1);

        System.out.println(concatenacao);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        numero = numero + 2;


        System.out.println( ++ numero);

        System.out.println( numero --);
        System.out.println( numero );

        boolean variavel = true;

        System.out.println(!variavel);

        String resultado = "";

        int a, b;

        a = 6;
        b = 6;

        if (a==b)
            resultado = "verdadeiro";
        else resultado = "falso";

        String resultadoNovo = a==b ? "Verdadeiro" : "falso";

        System.out.println(resultadoNovo);

    }
}
