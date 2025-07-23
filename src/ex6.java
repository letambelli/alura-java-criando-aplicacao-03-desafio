import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para que seu fatorial seja calculado: ");
        int numero = leitura.nextInt();
        int numeroDecaindo = numero;
        int fatorial = 1;

        while (numeroDecaindo > 1) {
            fatorial = fatorial * numeroDecaindo;
            numeroDecaindo = numeroDecaindo - 1;
        }

        System.out.println("O fatorial de " + numero + " é igual a " + fatorial);
    }
}
