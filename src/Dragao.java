import java.util.Scanner;

public class Dragao {
    public static void main(String[] args) {
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);
        System.out.print("Informe e quantidade de casos: ");
        casos = ler.nextInt();

        for (int i = 0; i < casos; i++) {

            System.out.print("Informe o poder de luta: ");
            poderDeLuta = ler.nextInt();

            if (poderDeLuta <= 8000) {
                System.out.println("Inseto!");

            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
}
