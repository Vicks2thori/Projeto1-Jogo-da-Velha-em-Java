import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte[][] tabuleiro = new byte[3][3];

        String[] nomes = bemVindos();
        String nome1 = nomes[0];
        String nome2 = nomes[1];

        exibirTabuleiro(tabuleiro);
    }

    private static String[] bemVindos(){
        System.out.print("Bem vindos! ao:\n----------JOGO-DA-VELHA-EM-JAVA----------\n");
        String nome1, nome2;
        try {
            do {
                System.out.println("Digite o nome do primeiro jogador(X):");
                nome1 = sc.nextLine();

                String erro = nome1.isBlank() ? "Nome não pode ser vázio. Tente novamente:" : ""; //isBlank() verifica se está vazia ou com caracteres de espaço
                System.out.println(erro);
            } while(nome1.isBlank());

            do {
                System.out.println("Digite o nome do segundo jogador(0):");
                nome2 = sc.nextLine();

                String erro = nome2.isBlank() ? "Nome não pode ser vázio. Tente novamente:" : "";
                System.out.println(erro);
            } while(nome2.isBlank());
        } finally {
            sc.close();
        }
        return new String[]{nome1, nome2};
    }

    private static void exibirTabuleiro(byte[][] tabuleiro){
        for (byte[] linha : tabuleiro) {
            for (byte valor : linha) {
                char simbolo = valor == 1 ? 'X' : valor == 2 ? 'O' : ' ';
                System.out.printf("[%c]", simbolo);
            }
            System.out.println();
        }
    }

}