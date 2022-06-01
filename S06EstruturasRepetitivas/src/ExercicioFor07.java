import java.util.Scanner;

public class ExercicioFor07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		int x = sc.nextInt();
		
		for (int i=1; i<=x;i++) {
			int q = i*2;
			int c = i*3;					
			System.out.printf("%d %d %d%n",i,q,c);			
		}		
		sc.close ();
	}
}
