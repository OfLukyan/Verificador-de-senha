import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a senha");

        int senha = entrada.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = entrada.nextInt();
        }

        System.out.println("Acesso Permitido");

        entrada.close();
    }
}