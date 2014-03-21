import java.util.Scanner;


public class ReverseWord {
    
	public String reverseWords(String s) {
		if (s == null) 
			return null;
		else {
			String reverseWord = "";
			String[] words = s.split(" ");
			if (words.length > 0){
				for(int i = words.length - 1; i >= 0; i--){
					if(!words[i].isEmpty()) {
						if(i == words.length - 1){
							reverseWord = words[i];
						}
						else{
							reverseWord += (" " + words[i]);
						}
					}
				}
			}
			return reverseWord;
		}
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString;
		String reverseString;
		ReverseWord reverseWord = new ReverseWord();
		while(!"".equals(inputString = scanner.nextLine())) {
			reverseString = reverseWord.reverseWords(inputString);
			System.out.println(reverseString);
		}
		reverseString = reverseWord.reverseWords(inputString);
		System.out.println(reverseString);
	}

}
