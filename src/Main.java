public class Main {
    public static void main(String[] args) {
        byte[][] tabuleiro = new byte[3][3];
        exibirTabuleiro(tabuleiro);
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