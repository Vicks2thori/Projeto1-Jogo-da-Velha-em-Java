import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte[][] tabuleiro = new byte[3][3];

        String[] nomes = bemVindos();
        String nome1 = nomes[0];
        String nome2 = nomes[1];
        char simboloComeca = primeiraJogada(nomes);
        alternanciaJogadores(simboloComeca, tabuleiro, nomes);
    }

    private static void alternanciaJogadores(char simboloComece, byte[][] tabuleiro, String[] nomes){
        byte primeiroJogador = (byte)(simboloComece == 'X' ? 1 : 2);
        final byte MAXIMOJOGADASSEMVITORIA = 8;
        boolean jogadaValida = false;
        short posicao;
        String erro = "Valor inserido inválido. Digite apenas um numero inteiro de 1-9.";

        for (short i = 1; i <= MAXIMOJOGADASSEMVITORIA; i++){
            if (primeiroJogador == (byte)1){
                if (i % 2 != 0){
                    do{
                        try {
                            System.out.printf("Jogador %s digite a %d° posição(X): ", nomes[0], i);
                            posicao = sc.nextShort();
                            jogadaValida = validacaoJogada(posicao, tabuleiro, (byte)1);
                            erro = !jogadaValida ? "Valor inserido inválido. Digite apenas um numero inteiro de 1-9." : "";
                            System.err.println(erro);
                        } catch (InputMismatchException e){
                            sc.nextLine();
                            System.err.println(erro);
                        }
                    } while (!jogadaValida);
                    exibirTabuleiro(tabuleiro);
                }else {
                    do{
                        try {
                            System.out.printf("Jogador %s digite a %d° posição(O): ", nomes[1], i);
                            posicao = sc.nextShort();
                            jogadaValida = validacaoJogada(posicao, tabuleiro, (byte)2);
                            erro = !jogadaValida ? "Valor inserido inválido. Digite apenas um numero inteiro de 1-9." : "";
                            System.err.println(erro);
                        } catch (InputMismatchException e){
                            sc.nextLine();
                            System.err.println(erro);
                        }

                    } while (!jogadaValida);
                    exibirTabuleiro(tabuleiro);
                }
            }else {
                if (i % 2 != 0) {
                    do {
                        try {
                            System.out.printf("Jogador %s digite a %d° posição(O): ", nomes[1], i);
                            posicao = sc.nextShort();
                            jogadaValida = validacaoJogada(posicao, tabuleiro, (byte) 2);
                            erro = !jogadaValida ? "Valor inserido inválido. Digite apenas um numero inteiro de 1-9." : "";
                            System.err.println(erro);
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            System.err.println(erro);
                        }

                    } while (!jogadaValida);
                    exibirTabuleiro(tabuleiro);
                } else {
                    do {
                        try {
                            System.out.printf("Jogador %s digite a %d° posição(X): ", nomes[0], i);
                            posicao = sc.nextShort();
                            jogadaValida = validacaoJogada(posicao, tabuleiro, (byte) 1);
                            erro = !jogadaValida ? "Valor inserido inválido. Digite apenas um numero inteiro de 1-9." : "";
                            System.err.println(erro);
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            System.err.println(erro);
                        }

                    } while (!jogadaValida);
                    exibirTabuleiro(tabuleiro);
                }
            }
        }

    }

    private static boolean validacaoJogada(short posicao, byte[][] tabuleiro, byte usuario){
        boolean jogadaValida;
        jogadaValida = posicao >=1 && posicao <=9;
        byte linha = (byte) (posicao >= 1 && posicao <=3 ? 0 : posicao >= 4 && posicao <=6 ? 1 : 2);
        byte coluna = (byte) (linha == 0 ? posicao -1 : linha == 1 ? posicao - 4 : posicao - 7);

        if (jogadaValida){
            jogadaValida = tabuleiro[linha][coluna] != 1 && tabuleiro[linha][coluna] != 2;
            if(jogadaValida){
                tabuleiro[linha][coluna] = usuario;
            }
        }

        return jogadaValida;
    }

    private static char primeiraJogada(String[] nomes) {
        int numeroAleatorio = (int)Math.floor(Math.random() * 10) + 1; //gera um numero de 1-10 e converte para int (nativo double)
        System.out.println("O sistema irá gerar um numero de 1-10, cada usuário deve informar um numero, quem chegar mais próximo inicia a partida!");
        int numero1 = 0, numero2 =0;
        String erro = "Valor inserido inválido. Digite apenas um numero inteiro de 1-10.";
        boolean numero1Valido = false, numero2Valido = false;

        do {
            try {
                do {
                    System.out.printf("Digite um numero inteiro usuário %s (X):\n", nomes[0]);
                    numero1 = sc.nextInt();

                    erro = numero1 >= 1 && numero1 <= 10 ? "" : erro;
                    System.err.println(erro);
                } while (numero1 > 10 || numero1 < 1);
                numero1Valido = true;
            } catch (InputMismatchException e) {
                sc.nextLine(); // Limpa o buffer com a entrada inválida
                System.err.println(erro);
            }
        } while (!numero1Valido);

        do {
            try {
                do {
                    System.out.printf("Digite um numero inteiro usuário %s (O):\n", nomes[1]);
                    numero2 = sc.nextInt();

                    erro = numero2 >= 1 && numero2 <= 10 ? "" : erro;
                    System.err.println(erro);
                } while (numero2 > 10 || numero2 < 1);
                numero2Valido = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.err.println(erro);
            }
        } while (!numero2Valido);

        return numeroAleatorio - numero1 < numeroAleatorio - numero2 ? 'X' : 'O';
    }

    private static String[] bemVindos(){
        System.out.print("Bem vindos! ao:\n----------JOGO-DA-VELHA-EM-JAVA----------\n");
        String nome1, nome2;
        String erro;

        do {
            System.out.println("Digite o nome do primeiro jogador(X):");
            nome1 = sc.nextLine();

            erro = nome1.isBlank() ? "Nome não pode ser vázio. Tente novamente:" : ""; //isBlank() verifica se está vazia ou com caracteres de espaço
            System.out.println(erro);
        } while(nome1.isBlank());

        do {
            System.out.println("Digite o nome do segundo jogador(0):");
            nome2 = sc.nextLine();

            erro = nome2.isBlank() ? "Nome não pode ser vázio. Tente novamente:" : "";
            System.out.println(erro);
        } while(nome2.isBlank());
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