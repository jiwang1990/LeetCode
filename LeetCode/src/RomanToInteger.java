import java.util.HashMap;


public class RomanToInteger {
	public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInt = new HashMap<Character, Integer>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
        if(s == null || s.length() == 0)
            return 0;
        int result = 0;
        Character previousChar = null;
        Character currentChar = null;
        for(int i = 0; i < s.length(); i++){
            currentChar = s.charAt(i);
            if(previousChar == null || romanToInt.get(previousChar).compareTo(romanToInt.get(currentChar)) >= 0)
                result += romanToInt.get(currentChar);
            else{
                result = result - 2*romanToInt.get(previousChar) + romanToInt.get(currentChar);
            }
            previousChar = currentChar;
        }
        return result;
    }
}
