
public class StringToInteger {
	public int atoi(String str) {
        if(str == null || str.length() == 0)
            return 0;
        double number = 0;
        int flag = 1;
        int i;
        for(i = 0; i < str.length() && str.charAt(i) == ' ';i++);
        str = str.substring(i);
        if(str.charAt(0) == '-'){
            flag = -1;
            str = str.substring(1);
        }
        else if(str.charAt(0) == '+'){
            flag = 1;
            str = str.substring(1);
        }
        
        for(i = 0;i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                number = number*10 + (str.charAt(i) - '0');
            }
            else
                break;
        }
        number = number * flag;
        if(number > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(number < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            
        return (int) number;
    }
}
