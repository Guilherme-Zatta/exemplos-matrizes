import java.util.Arrays;
import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        //Exercício 02 Gerar e escrever uma matriz bidimensional de tamanho 9x7, com números aleatórios entre zero e cem. Ao final, imprimir a média geral dos números da tabela.
            
    // Definindo o tamanho da matriz
    int linhas = 9;
    int colunas = 7;
    int soma =0;
 
    // Criando a matriz
    int[][] matriz =  new int[linhas][colunas];
 
    // Criando um objeto Random para gerar números aleatórios
    Random rand = new Random();
 
    // Preenchendo a matriz com números aleatórios entre 0 e 100
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++){
            matriz[i][j] = rand.nextInt(101); // Gera números aleatórios entre 0 e 100
            soma += matriz[i][j];
        }
    }
   
    // Imprimindo a matriz
    System.out.println("Matriz");
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++){
 
        }
 
        System.out.println();
        System.out.print(Arrays.toString(matriz[i]));
       
       
    }
    // Calculando a média geral
    double media = (double) soma / (linhas * colunas);
    System.out.println("\nMeidia: "+ media);
    }
}
