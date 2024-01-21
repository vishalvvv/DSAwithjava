package fundementals;
import java.util.Scanner;
public class Pattern4M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for(i=1;i<=n;i++){
			for(j=n;j>=1;j--){
				if(j!=i)
					System.out.print(j);
				
					else 
						System.out.print("*");
			}
					System.out.println(" ");
				}
	}

}
