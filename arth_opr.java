import java.util.*;
public class arth_opr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int pos_inc = a++;
		int pre_inc = ++a;
		int pos_dec = a--;
		int pre_dec = --a;
		System.out.println("pre_inc " +pre_inc);
		System.out.println("pos_inc " +pos_inc);
		System.out.println("pre_dec " +pre_dec);
		System.out.println("pos_dec " +pos_dec);
	}
}
