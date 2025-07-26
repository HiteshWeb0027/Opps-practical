import java.util.Scanner;

public class bitwise_opr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("NOT " +(~a));
		System.out.println("AND " +(a&b));
		System.out.println("OR " +(a|b));
		System.out.println("Exculsive " +(a^b));
		System.out.println("Shift Right " +(a>>1));
		System.out.println("Shift Left " +(a<<1));
		System.out.println("AND assignment " +(a&=b));
		System.out.println("OR assignment " +(a|=b));
		System.out.println("exculsive assignment " +(a^=b));
		System.out.println("right shift assignment " +(a>>=b));
		System.out.println("left shift assignment " +(a<<=b));
		
	}
}
