package algo.cormen.javacode.src;

/**
 * This is an Interface Definition for Stack Data Structure
 * @author Rishu
 *
 */
public interface Stack {
	
	
	public int StackSize();  //returns the size of the stack
	
	public void StackPush(Object e); //Pushes an element to the Stack
	
	public Object StackPop(Object e); //Removes an element from the top of the Stack
	
	public boolean StackIsEmpty(); //Check if a stack is empty or not
	
	public Object StackTop(); // returns the Top of the Stack
	
}
