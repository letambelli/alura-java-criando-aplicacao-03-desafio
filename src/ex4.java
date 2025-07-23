import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número para saber sua tabuada: ");
        int numero = leitura.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
