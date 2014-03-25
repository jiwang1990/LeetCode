
public class ReverseInteger {
	public int reverse(int x) {
		int num = Math.abs(x);
		int result = 0;
		while(num != 0) {
			result = result*10 + num%10;
			num /= 10;
		//	System.out.println(num);
		}
		if(x < 0)
			result = result * (-1);
		return result;
	}
	
	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverse(123));
		System.out.println(obj.reverse(0));
		System.out.println(obj.reverse(-123));
	}
}
