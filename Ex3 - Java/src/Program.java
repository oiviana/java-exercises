import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vetor1 = new double[15];
		double[] vetor2 = new double[15];
		double[] vetorsoma = new double[15];
	
		for(int i=0;  i < 15; i++) {
			
			System.out.print("Informe um valor real para o vetor 1: ");
			vetor1[i]= sc.nextDouble();
			
			System.out.print("Informe um valor real para o vetor 2: ");
			vetor2[i]= sc.nextDouble();
			
			vetorsoma[i]= vetor1[i] + vetor2[i];
			
		
			
		}

 
 
sc.close();
 
System.out.println("Array Resultante: "+Arrays.toString(vetorsoma));

			
	

}
}
	