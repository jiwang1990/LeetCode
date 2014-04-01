/**
 * @author ChenBin
 */
import java.util.Stack;


public class RPN {
	public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        Integer result = 0;
        int operand1, operand2;
        for(String token : tokens) {
        	if(token.equals("+")){
        		operand2 = Integer.parseInt(stack.pop());
        		operand1 = Integer.parseInt(stack.pop());
        		result = operand1 + operand2;
        		stack.push(result.toString());
        	}else if(token.equals("-")){
        		operand2 = Integer.parseInt(stack.pop());
        		operand1 = Integer.parseInt(stack.pop());
        		result = (operand1 - operand2);
        		stack.push(result.toString());
        	}else if(token.equals("*")){
        		operand2 = Integer.parseInt(stack.pop());
        		operand1 = Integer.parseInt(stack.pop());
        		result = (operand1 * operand2);
        		stack.push(result.toString());
        	}else if(token.equals("/")){
        		operand2 = Integer.parseInt(stack.pop());
        		operand1 = Integer.parseInt(stack.pop());
        		result = (operand1 / operand2);
        		stack.push(result.toString());
        	}else{
        		stack.push(token);
        	}
        		
        }
		return Integer.parseInt(stack.pop());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
		System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
	}

}
