import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é positivo ou negativo: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado < 0){
            System.out.println("O número é negativo.");
        } else if (numeroDigitado == 0) {
            System.out.println("O número é neutro.");
        } else {
            System.out.println("O número é positivo.");
        }
    }
}
