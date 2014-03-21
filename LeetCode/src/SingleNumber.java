import java.util.Scanner;


public class SingleNumber {

	public int singleNumber(int[] A) {
		for (int i = 1; i < A.length; i++){
			A[0] = (A[0] ^ A[i]);
		}
		return A[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		SingleNumber sn = new SingleNumber();
		
		if(str == null)
			return;
		else {
			String[] a = str.split(" ");
			if (a.length == 0)
				return;
			else {
				int[] ia = new int[a.length];
				for(int i = 0; i < a.length; i++){
					ia[i] = Integer.parseInt(a[i]);
				}
				System.out.println(sn.singleNumber(ia));
			}
		}
	}

}
