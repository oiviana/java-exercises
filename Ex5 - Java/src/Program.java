import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int menorvalor =700000000;
		int posicao = 0;
            for(int i=0;  i < 10; i++) {
			
			System.out.print("Informe um valor para o vetor: ");
			vetor[i]= sc.nextInt();
			
			if(vetor[i]<menorvalor) {
				
				menorvalor=vetor[i];
			    posicao = i;
			}
			else {}
			
           
            
            }
            sc.close();
            System.out.println("Valores do Array: "+Arrays.toString(vetor));
            System.out.println("Menor valor do Array: "+menorvalor);
            System.out.println("Posição do valor: "+posicao);

	}

}
