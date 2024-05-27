import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
Implementar o exercício 14 da lista 1 (algoritmo Boundary‐fill).
Use uma matriz de inteiros para representar a imagem. Quando o programa iniciar
gere uma matriz de tamanho NxM como X  áreas de “cores” diferentes. N, M e X são
inteiros positivos lidos.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de colunas: ");
        int x = sc.nextInt();
        System.out.println();
        System.out.print("Numero de linhsa: ");
        int y = sc.nextInt();
        System.out.println();
        System.out.print("Numero de cores diferentes: ");
        int n = sc.nextInt();
        System.out.println();
        int[][] m = criaMatriz(new int[x][y],n);

        soutMatriz(m);
        System.out.print("Qual pixel deseja aplicar o boundaryfill? (coordenada x) : ");
        x = sc.nextInt();
        System.out.println();
        System.out.print("Qual pixel deseja aplicar o boundaryfill? (coordenada y) : ");
        y = sc.nextInt();
        System.out.println();
        System.out.print("Qual nova cor? ");
        int cor = sc.nextInt();
        m = boundaryfill(m,x,y,cor,m[x][y]);
        soutMatriz(m);

    }
    static void soutMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                boolean a=true;
                //LIMITADO A CINCO CORES PARA VALOR DE N
                /*
                a = false;
                https://unicode.org/emoji/charts/full-emoji-list.html
                if (matriz[i][j]==0){
                    System.out.print("\uD83E\uDDE1 ");
                } else if (matriz[i][j]==1) {
                    System.out.print("\uD83D\uDC9B ");
                }else if (matriz[i][j]==2){
                    System.out.print("\uD83D\uDC9A ");
                }else if (matriz[i][j]==3){
                    System.out.print("\uD83D\uDC99 ");
                }else if (matriz[i][j]==4){
                    System.out.print("\uD83D\uDC9C ");
                }else if (matriz[i][j]==5){
                    System.out.print("\uD83D\uDDA4 ");
                }
                */
                if(a){
                    System.out.print(matriz[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] criaMatriz(int[][] matriz, int n) {
        Random a = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = a.nextInt(n);
            }
        }
        return matriz;
    }
    static int[][] boundaryfill(int[][] m, int x, int y, int cor, int cor_antiga) {
        if (x < 0 || x == m.length || y < 0 || y == m[0].length) {
            return m;
        } else {
            if (m[x][y] == cor_antiga) {
                m[x][y] = cor;
                m = boundaryfill(m, x + 1, y, cor, cor_antiga);
                m = boundaryfill(m, x - 1, y, cor, cor_antiga);
                m = boundaryfill(m, x, y - 1, cor, cor_antiga);
                m = boundaryfill(m, x, y + 1, cor, cor_antiga);
                return m;
            } else {
                return m;
            }
        }
    }
}