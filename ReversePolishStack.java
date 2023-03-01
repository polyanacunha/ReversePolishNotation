package labtech;

public class ReversePolishStack extends labtech.StackAbs {
	
	public boolean ableToOperate(){
		try {
			Integer.parseInt(this.top.getValue());
			Integer.parseInt(this.top.before.getValue());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Integer operate(String operator) {
		
		if(this.ableToOperate())
			
			switch (operator) {
			case "+": {
				String secondOperator = this.pop();
				return ( Integer.parseInt(this.pop()) + Integer.parseInt(secondOperator) );
			}
			case "-": {
				String secondOperator = this.pop();
				return ( Integer.parseInt(this.pop()) - Integer.parseInt(secondOperator) );
			}
			case "/": {
				String secondOperator = this.pop();
				//TODO: handle division by zero
				return ( Integer.parseInt(this.pop()) / Integer.parseInt(secondOperator) );
			}
			case "*": {
				String secondOperator = this.pop();
				return ( Integer.parseInt(this.pop()) * Integer.parseInt(secondOperator) );
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + operator);
			}
		else {
			throw new Error("Fuck you dumb!");
		}
	}
}
