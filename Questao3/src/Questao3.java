import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva uma mensagem com sentimento.\n:-) para divertido.\n:-( para chateado.");
        String fraseUsuario = entrada.next();


        String divertido = ":-)";
        String chateado = ":-(";

        if ((fraseUsuario.contains(divertido)) && fraseUsuario.contains(chateado)) {
            System.out.println("Neutro");
        }if (fraseUsuario.contains(divertido)) {
           System.out.println("Divertido");
       }if (fraseUsuario.contains(chateado)) {
            System.out.println("Chateado");
       }
    }
}


