import java.util.*;
public class numberofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); {
			double n=sc.nextDouble();
			double K = Math.floor(Math.log10(n) + 1);
			System.out.print(K);
		}

	}

}
