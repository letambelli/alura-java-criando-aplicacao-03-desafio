import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Digite sua opção: ");
        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual o tamanho do lado do quadrado em metros?");
                double ladoQuadrado = leitura.nextDouble();
                double areaQuadrado = Math.pow(ladoQuadrado, 2);
                System.out.println("Área do quadrado: " + areaQuadrado + "m²");
            case 2:
                System.out.println("Qual o raio do círculo em metros?");
                double raioCirculo = leitura.nextDouble();
                double areaCirculo = (3.14 * Math.pow(raioCirculo, 2));
                System.out.println("Área do círculo: " + areaCirculo + "m²");
        }

    }
}
