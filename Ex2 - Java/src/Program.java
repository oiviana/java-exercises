import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[10];
		double soma = 0;
		double media=0;
		for(int i=0;  i < 10; i++) {
			
			System.out.print("Informe um valor real: ");
			vetor[i]= sc.nextDouble();
			
			
			
			soma= soma + vetor[i];
			
		}
 media = soma / 10;
 
 
sc.close();
 
System.out.println("Os valores Informados foram: "+Arrays.toString(vetor));
 System.out.println("A soma dos valores foi de: "+soma);
 System.out.println("A média dos valores Informados foi de: "+ media);
			
	

}
}
	