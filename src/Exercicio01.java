import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Exercício 01 - Cadastro de usuários Desenvolver um programa que simule uma agenda de cadastro pessoal com nome, endereço, código postal, bairro e telefone de dez pessoas. 
        //Ao final, o programa deve apresentar seus elementos dispostos em ordem alfabética ascendente a partir do elemento (campo) nome.
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*Exercício 01
         - Cadastro de usuários Desenvolver um programa que simule uma agenda de cadastro pessoal
          com nome,
          endereço,
          código postal,
          bairro e
          telefone
          de dez pessoas.
          Ao final, o programa deve apresentar seus elementos dispostos em ordem alfabética ascendente a partir do elemento (campo) nome.
          */
          Scanner scanner = new Scanner(System.in);
          // Array bidimensional - 10 linhas - 5 colunas
          String[][] matriz_2d = new String[10][5];
          // Percorrro a matriz no sentido da linha (vertical)
          for (int i = 0; i < matriz_2d.length; i++) {
            System.out.printf("\n\n\nCadastro usuário %d \n\n", i + 1);
            // Ler nome e atribuir para coluna nome -> 0
            System.out.println("Informe o nome: ");
            matriz_2d[i][0] = scanner.nextLine();
     
            // Ler endereço e atribuir para coluna endereço -> 1
            System.out.println("Informe o endereço: ");
            matriz_2d[i][1] = scanner.nextLine();
           
            // Ler código postal e atribuir para coluna código postal -> 2
            System.out.println("Informe o código postal: ");
            matriz_2d[i][2] = scanner.nextLine();
     
            // Ler bairro e atribuir para coluna bairro -> 3
            System.out.println("Informe o bairro: ");
            matriz_2d[i][3] = scanner.nextLine();
           
            // Ler telefone e atribuir para coluna telefone -> 4
            System.out.println("Informe o telefone: ");
            matriz_2d[i][4] = scanner.nextLine();
     
          }
          // Ordenar os dados da matriz a partir da coluna nome (índice 0)
         
          // Mostrar a matriz ordenada (Arrays.deepToString(matriz_2d))
          System.out.println(Arrays.deepToString(matriz_2d));
     
          scanner.close();
 
    }
   
}