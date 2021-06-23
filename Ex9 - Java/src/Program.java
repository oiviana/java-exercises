
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho=0;
		long potencia=0;
		System.out.print("Informe o tamanho do vetor desejado (número de posições): ");
		tamanho=sc.nextInt();
		
		
	    long[] vetor = new long[tamanho];
		
            for(int i=0;  i < tamanho; i++) {
			
            potencia = 2 ^ i ;
          
			vetor[i]= potencia;
			
            
            }
            sc.close();
            System.out.println("Valores do Array: "+Arrays.toString(vetor));
           

	}

}
