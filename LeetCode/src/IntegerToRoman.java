
public class IntegerToRoman {
	public String intToRoman(int num) {
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String result = new String();
        for(int i = 0; i < number.length; i++){
            if(num >= number[i]){
                result += symbol[i];
                num -= number[i];
                i--;
            }
        }
        return result;
    }
}
