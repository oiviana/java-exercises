package calculadoramatrizes;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CalculadoraMatrizes {
       public static boolean preenchidaA=false;
       public static boolean preenchidaB=false;
      public static void main(String[] args) {
        int linhas=0, colunas=0,linhas2=0, colunas2=0, opcao=0;
        limpaConsole();
        System.out.println("Bem vindo à calculadora de Matrizes do Viana!");
        System.out.println("Primeiramente, vamos definir as dimensões das matrizes \n");
        
               do{
                System.out.println("Informe o número de linhas da primeira matriz: ");
                Scanner sc = new Scanner(System.in);
                linhas = sc.nextInt();
            }
            while(linhas<=0);
            do{
                System.out.println("Informe o número de colunas da primeira matriz: ");
                Scanner sc = new Scanner(System.in);
                colunas = sc.nextInt();
            }
            while(colunas<=0);
            
                 do{
                System.out.println("Informe o número de linhas da segunda matriz: ");
                Scanner sc = new Scanner(System.in);
                linhas2 = sc.nextInt();
            }
            while(linhas2<=0);
            do{
                System.out.println("Informe o número de colunas da segunda matriz: ");
                Scanner sc = new Scanner(System.in);
                colunas2 = sc.nextInt();
            }
            while(colunas2<=0);
            double[][] matrizA = new double[linhas][colunas];
            double[][] matrizB = new double[linhas2][colunas2];
            double[][] aux = new double[linhas2][colunas2];
        
    limpaConsole();
   do{
    exibirOpcoesMenu();
    opcao = capturaOpcao();
       switch (opcao){
            
            case 1:
                preencheMatriz("Matriz A",matrizA);
                System.out.println("");
                preenchidaA = true;
              
                break;
            case 2: 
                System.out.println("");
                preencheMatriz("Matriz B",matrizB);
                System.out.println("");
                preenchidaB = true;
              
                break;
            case 3:
                 System.out.println("");
                 exibirMatriz(matrizA, "Matriz A");
                 System.out.println("");
                break;
            case 4:
               System.out.println("");
               exibirMatriz(matrizB, "Matriz B");
               System.out.println("");
         
                break;
            case 5: 
                System.out.println("");
                trocaMatrizes(matrizA,matrizB,aux,linhas,linhas2,colunas,colunas2);
                System.out.println("");
                break;
            case 6: 
                System.out.println(""); 
                somarMatrizes(matrizA,matrizB,linhas,linhas2,colunas,colunas2);
                System.out.println("");
                break;
            case 7:
                System.out.println("");   
                subtrairMatrizes(matrizA, matrizB,linhas,linhas2,colunas,colunas2);
                System.out.println("");
                break;
            case 8: 
                System.out.println("");   
                multMatrizes(matrizA, matrizB);
                System.out.println("");
                break;
            case 9:
                System.out.println("");
                multConstante("Matriz A", matrizA);
                System.out.println("");
                break;
            case 10: 
                System.out.println("");
                multConstante("Matriz B", matrizB);
                System.out.println("");
                break;
            case 11:
                System.out.println("");
                somaElementos("Matriz A",matrizA);
                System.out.println("");
                break;
            case 12: 
                System.out.println("");
                somaElementos("Matriz B",matrizB);
                System.out.println("");
                break;
            case 13: 
                System.out.println("");
                somaLinha("Matriz A", matrizA ,linhas);
                System.out.println("");
                break;
            case 14: 
                System.out.println("");
                somaLinha("Matriz B", matrizB ,linhas2);
                System.out.println("");
                break;
                 case 15: 
                System.out.println("");
                somaColuna("Matriz A", matrizA ,colunas);
                System.out.println("");
                break;
                 case 16: 
                System.out.println("");
                somaColuna("Matriz B", matrizB ,colunas2);
                System.out.println("");
                break;
                  case 17:
                limpaConsole();  
                System.out.println("Obrigado por utilizar a calculadora de matrizes! ");
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida!");
            }}while(opcao != 17); 
    }   
         private static void exibirOpcoesMenu() {
        // Exibir uma lista de opções
        System.out.println("Agora, escolha uma opção da calculadora: \n");
        System.out.println("1.Preencher a Matriz A");
        System.out.println("2.Preencher a Matriz B");
        System.out.println("3.Exibir a Matriz A");
        System.out.println("4.Exibir a Matriz B");
        System.out.println("5.Trocar as Matrizes");
        System.out.println("6.Somar as Matrizes");
        System.out.println("7.Subtrair as Matrizes");
        System.out.println("8.Multiplicar as Matrizes");
        System.out.println("9.Multiplicar a Matriz A por uma constante");
        System.out.println("10.Multiplicar a Matriz B por uma constante");
        System.out.println("11.Somar os elementos da Matriz A");
        System.out.println("12.Somar os elementos da Matriz B");
        System.out.println("13.Somar uma linha da matriz A");
        System.out.println("14.Somar uma linha da matriz B");
        System.out.println("15.Somar uma coluna da matriz A");
        System.out.println("16.Somar uma coulna da matriz B");
        System.out.println("17.Encerrar Programa");
    }     
        public static int capturaOpcao() {
        int opcao;    
        System.out.print("Digite o número da opção desejada: ");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();        
        return opcao; 
    }
        private static void limpaConsole() {
           for (int i = 0; i < 40; ++i)  
           System.out.println();
         }  
   
        public static void preencheMatriz(String nomematriz,double [][] mat) {
        Scanner tecl = new Scanner(System.in);
        for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
                System.out.printf("Posição[%d][%d] da "+nomematriz+": ", l, c);
                mat[l][c] = tecl.nextInt();
                
            }
        } 
    }
        public static void exibirMatriz(double [][] mat,String nomematriz) {
            System.out.println(nomematriz+":");   
        for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat[l][c]+" ");
            }System.out.println(" ");
        }
    }
        public static void trocaMatrizes(double [][] mat,double [][] mat2,double [][] matauxiliar,Integer lin,Integer lin2,Integer col,Integer col2) {
            if(lin==lin2&&col==col2){
            for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
             matauxiliar[l][c] = mat[l][c];
             mat[l][c] = mat2[l][c];
             mat2[l][c] = matauxiliar[l][c];
            }
        }System.out.println("Matriz A (Trocada)");
          for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat[l][c]+" ");
            }System.out.println(" ");
        }
          System.out.println("Matriz B (Trocada)");
          for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat2[l][c]+" ");
            }System.out.println(" ");
        }
    }else{System.out.println("Essa operação só é permitida com matrizes de tamanhos iguais!");}}
        
        public static void somarMatrizes(double [][] mat,double [][] mat2,Integer lin,Integer lin2,Integer col,Integer col2){
          if(lin==lin2&&col==col2){
          System.out.println("A soma das Matrizes");
          for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
             mat[l][c] = mat[l][c]+mat2[l][c];
             System.out.print(mat[l][c]+" ");
            }System.out.println(" ");    
        }
    } else{System.out.println("Essa operação só é permitida com matrizes de tamanhos iguais!");}
   }
        public static void subtrairMatrizes(double [][] mat,double [][] mat2,Integer lin,Integer lin2,Integer col,Integer col2){
          if(lin==lin2&&col==col2){ 
          System.out.println("A subtração das Matrizes");
          for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
             mat[l][c] = mat[l][c]-mat2[l][c];
             System.out.print(mat[l][c]+" ");
            }System.out.println(" ");    
        }}else{System.out.println("Essa operação só é permitida com matrizes de tamanhos iguais!");}
    }
        public static void multMatrizes(double [][] mat,double [][] mat2){
          System.out.println("A multiplicação das Matrizes");
          for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
             mat[l][c] = mat[l][c]*mat2[l][c];
             System.out.print(mat[l][c]+" ");
            }System.out.println(" ");    
        }
    }  
             
        public static void multConstante(String nomematriz, double [][] mat){
            Scanner sc = new Scanner(System.in);
            int cons;
            System.out.println("Informe um valor para multiplicar a "+nomematriz+": ");
            cons = sc.nextInt();
            System.out.println("A multiplicação da "+nomematriz+" por "+cons+" fica:");
              for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
             mat[l][c] = mat[l][c]*cons;
             System.out.print(mat[l][c]+" ");
            }System.out.println(" ");    
        } 
    }
        public static void somaElementos(String nomematriz, double [][] mat){
            Scanner sc = new Scanner(System.in);
            int total=0;
          for (int l = 0; l < mat.length; l++) { 
            for (int c = 0; c < mat[0].length; c++) {
               total+= mat[l][c];     
            }    
        } System.out.println("A soma dos Elementos da "+nomematriz+" fica: "+total);
    }
        public static void somaLinha(String nomematriz, double [][] mat,Integer lin){
            Scanner sc = new Scanner(System.in);
            int somalinha=0;
            int linhateste=0;
            System.out.println("Qual linha da "+nomematriz+" você deseja somar? ");
            linhateste = sc.nextInt();
            if(linhateste >= 0 && linhateste < lin){
            for (int c = 0; c < mat[0].length; c++) {
                somalinha+= mat[linhateste][c];
            } System.out.println("A soma da linha "+linhateste+" da "+nomematriz+" é igual a: "+somalinha);    
         
       }   else{System.out.println("A "+nomematriz+" não possui esse valor de linha!");}
    }
        public static void somaColuna(String nomematriz, double [][] mat,Integer col){
            Scanner sc = new Scanner(System.in);
            int somacoluna=0;
            int coluna=0;
            System.out.println("Qual coluna da "+nomematriz+" você deseja somar? ");
            coluna = sc.nextInt();
            if(coluna >= 0 && coluna < col){
            for (int c = 0; c < mat.length; c++) {
                somacoluna+= mat[c][coluna];
            } System.out.println("A soma da coluna "+coluna+" da "+nomematriz+" é igual a: "+somacoluna);    
         
       }   else{System.out.println("A "+nomematriz+" não possui esse valor de coluna!");}
    }
}
