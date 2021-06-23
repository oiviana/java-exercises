import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int maiorvalor = 0 ;
            for(int i=0;  i < 10; i++) {
			
			System.out.print("Informe um valor para o vetor: ");
			vetor[i]= sc.nextInt();
			
			if(vetor[i]>maiorvalor) {
				
				maiorvalor=vetor[i];
			
			}
			else {}
			
         
            
            }
            sc.close();
            System.out.println("Valores do Array: "+Arrays.toString(vetor));
            System.out.println("Maior valor do Array: "+maiorvalor);

	}

}
