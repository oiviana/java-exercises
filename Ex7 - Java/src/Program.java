import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[20];
		double negativos =0;
		double positivos =0;
	
		for(int i=0;  i < 20; i++) {
			
			System.out.print("Informe um valor real para o vetor: ");
			vetor[i]= sc.nextDouble();
			
			if (vetor[i]<0) {
				
			negativos = negativos + vetor[i];	
				
			}
			else {
				
				positivos = positivos + vetor[i];
			}
			
			
			
		
			
		}

 
 
sc.close();
 
System.out.println("Array Completo: "+Arrays.toString(vetor));
System.out.println("Soma dos Negativos: "+negativos);
System.out.println("Soma dos Positivos: "+positivos);

			
	

}
}