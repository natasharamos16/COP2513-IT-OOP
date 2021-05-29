//Create a program that evaluates postfix expressions
//Created by Natasha Ramos-Gomez
//April 9, 2019
//USF COP2513

//importing java packages
import java.util.*;

public class tokenFix {
	public static void main(String[] args) {
		
		//statement used to display and check the expressions
		if (args.length != 1) {
				System.out.println(" Usage: tokenFix \"Expression\"");
				System.exit(1);
		}
		try {
				System.out.println(observingTheExpression(args[0]));
		}
		catch (Exception ex) {
				System.out.println("Invalid Expression: " + args[0]);//statement used to print out message of error
		}
		
	}
	public static int observingTheExpression(String notation) throws Exception{
		
		//creating the stack to store the operands
		Stack<Integer> stackOps = new Stack<>();
		
		notation = emptySpot(notation);
		
		//statement to release operands and operators
		String[] coins = notation.split(" ");
		
		//statement used to evalute the tokens
		for (String coin: coins) {
				if (coin.length() == 0)
						continue;//statement used to continue through the loop
				else if(coin.charAt(0) == '+' || coin.charAt(0) == '-'||
									  coin.charAt(0) == '/' || coin.charAt(0) =='*') {
							 passingOps(stackOps, coin.charAt(0));//statement used to process all the ops on the top stack
		
				}
			    else if (Character.isDigit(coin.charAt(0))) {
			    	stackOps.push(Integer.parseInt(coin));
			    }
			    else
			    		throw new Exception("Invalid Expression:  ");
		}
		return stackOps.pop();
	
	}
	//statement used to process and applies to all opperands in stack
    public static void passingOps(Stack<Integer> stackOps, char op) {
    	int ops1 = stackOps.pop();
    	int ops2 = stackOps.pop();
    	
    	switch (op) {
    			case '+': stackOps.push(ops2 + ops1); break;
    			case '-': stackOps.push(ops2 - ops1); break;
    			case '/': stackOps.push(ops2 / ops1); break;
    			case '*': stackOps.push(ops2 * ops1);
    	}
    }
    //statement used to fill out empty spaces with operators
    public static String emptySpot (String n) {
    		String result = "";
    		
    		for (int i = 0; i < n.length(); i++) {
    				if (n.charAt(i) == '+' || n.charAt(i) == '-' || 
    						n.charAt(i) == '/' || n.charAt(i) == '*')
    					result += " " + n.charAt(i) + " ";
    				else
    					result += n.charAt(i);
    		}
    		return result;
    }

}
