import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		double media=0;
		for(int i=0;  i < 10; i++) {
			
			System.out.print("Informe um valor inteiro: ");
			vetor[i]= sc.nextInt();
			
			
			
			soma= soma + vetor[i];
			
		}
 media = soma / 10;
 
 sc.close();

 
 System.out.println("Os valores Informados foram: "+Arrays.toString(vetor));
 System.out.println("A soma dos valores foi de: "+soma);
 System.out.println("A m�dia dos valores Informados foi de: "+ media);
 
	}

}
