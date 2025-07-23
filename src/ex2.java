import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite mais um número: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero < segundoNumero) {
            System.out.println("O primeiro numero é menor que o segundo.");
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("Os dois números são iguais.");
        } else {
            System.out.println("O primeiro número é maior que o segundo.");
        }
    }
}
