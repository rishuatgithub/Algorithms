package algo.cormen.javacode.src;


public class StackOperation implements Stack {
	
	private final static int CAPACITY=1024; //default capacity of the stack
	public static int N; //maximum capacity of the stack (user defined)
	public int[] StackArray;
	public int top=-1; //top of the stack
	
	public static void main(String[] args)  {
		
		
		
		
	}
	
	// Calling Default constructor to assign the Maximum capacity of the Stack
	public StackOperation() {
		this(CAPACITY);
	}

	// Calling Parameterized constructor to initialize the stack with given capacity
	public StackOperation(int cap) {
		N=cap;
		StackArray=new int[N];
	}

	@Override
	public int StackSize() {
		return (top+1);
	}

	@Override
	public void StackPush(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object StackPop(Object e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean StackIsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object StackTop() {
		// TODO Auto-generated method stub
		return null;
	}
}


