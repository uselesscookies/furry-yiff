public class StackArray<E> {

	private int top = -1;
	private static final int MAX_ITEMS = 10;
	private E items[];

	@SuppressWarnings("unchecked")
	public StackArray() {
		items = (E[]) new Object[MAX_ITEMS];
		System.out.println("Stack Created!");
	}

	public void push(E e) {
		if (isFull() == true) {
			System.out.println("Stack Full!");
		} else {
			top = top + 1;
			items[top] = e;
		}
	}

	public E pop() {
		if (isEmpty() == true) {
			System.out.println("Stack Empty!");
		} else {

			E e = (E) items[top];
			items[top] = null;
			top = top - 1;
			return e;
		}
		return null;
	}

	public boolean isFull() {
		if (top == items.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		System.out.println("Array:");
		System.out.print("{");
		for (int i = 0; i < items.length; i++) {
			System.out.print(items[i] + " ");
		}
		System.out.print("}");
		return "";
	}

	public static void main(String[] args) {

		// Code reference for countPosNeg method
		StackArray<Integer> intStack = new StackArray<Integer>();
		intStack.push(10);
		intStack.push(10);
		intStack.push(30);
		intStack.push(-40);
		
		/*This function counts and displays the number of positive integers
		 * and number of negative integers in IntStack. IntStack must be returned
		 * to its original state after counting.
		 */
		public void countPosNeg() { //gives errors. why?
			int countPos = 0;
			int countNeg = 0;
			while(!intStack.isEmpty()) {
				if(intStack.top > 0) { //read positive numbers
					countPos++;
				}
				else if(intStack.top < 0) { //read negative numbers
					countNeg++;
				}
				intStack.pop();
			}				
			System.out.println("The number of positive integers is " + countPos + " and the number of negative integers is " + countNeg);
			
		}
		System.out.println("intStack before counting");
		System.out.println(intStack);

		System.out.println("intStack after counting");
		System.out.println(intStack);
		
		/*Recursive method to test whether two stacks contain the same elements. 
		*The elements stored in the stack are integers. 
		Method called at the very end of the program.*/
		public Boolean sameStack(StackArray<E> s2) { //the method header should be correct according to my homework instructions. what could be wrong?
			while(!s2.isEmpty()) {
				if(s2.top == stack.top) {
					s2.pop();
				}else {
					return false;
				}
			}
			return true;
		}
		StackArray<Integer> stack = new StackArray<Integer>();
		StackArray<Integer> stack2 = new StackArray<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.push(40);

		System.out.println(stack);
		System.out.println(stack2);

		// Calling comparison method
		//stack.sameStack(stack2);
	}

}
