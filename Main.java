


package labtech;

import labtech.ReversePolishStack;

public class Main {

	public static void main(String[] args) {
 
		ReversePolishStack stack = new ReversePolishStack();
		String firstOne = "2 5 * 4 + 3 2 * 1 + / ";
		while(!firstOne.isEmpty()) {
			String currentChar = String.valueOf(firstOne.charAt(0));
			//removing first char
			firstOne = firstOne.substring(1, firstOne.length());
			if(currentChar.contains(" ")) 
				continue;
		    if("+".contains(currentChar) || "-".contains(currentChar) || "/".contains(currentChar) || "*".contains(currentChar) ) 
		    	stack.push(stack.operate(currentChar).toString());
		    else
		    	stack.push(currentChar);
		}
		System.out.println(stack.pop());
	}

}
