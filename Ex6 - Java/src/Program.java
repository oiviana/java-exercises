import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho=0;
		
		System.out.print("Informe o tamanho do vetor desejado (número de posições): ");
		tamanho=sc.nextInt();
		
		
	    String[] vetor = new String[tamanho];
		
            for(int i=0;  i < tamanho; i++) {
			
			System.out.print("Informe valores em texto para o vetor: ");
			vetor[i]= sc.next();
			
            
            }
            sc.close();
            System.out.println("Valores do Array: "+Arrays.toString(vetor));
           

	}

}
