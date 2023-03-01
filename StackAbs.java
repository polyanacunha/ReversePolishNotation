package labtech;

public abstract class StackAbs {
	protected Node top;
	public StackAbs() {
		top = null;
	}
    public StackAbs(String value) {
		top = new Node(value);
	}
	public void push(String value){
		top = new Node(value, top);
	}
	public String pop() {
		//pop value
		String topValue = this.top.getValue();
		//update top
		this.top = this.top.before;
		return topValue;
	}
	public String peek() {
		if(!this.isEmpty())
			return this.top.getValue();
		return "";
	}
	public boolean isEmpty() {
		return top == null;
	}
	
	protected class Node{
		public Node before;
		private String value;
		public Node(String value) {
			this.value = value;	
		}
		
		public Node(String value, Node before) {
			this.value = value;
			this.before = before;
		}
		
		public String getValue() {
			return this.value;
		}
		
	}
}
