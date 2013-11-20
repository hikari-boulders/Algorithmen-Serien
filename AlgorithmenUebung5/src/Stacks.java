import java.util.Stack;

public class Stacks {

	public Stack stack;

	public Stacks() {
		stack = new Stack();

	}

	private void addElementToStack(String elem) {
		stack.push(elem);
	}

	private void delElementFromStack() {
		if(!stack.isEmpty())
		stack.pop();
	}

	private void getLength() {
		System.out.println("Groesse des Stacks: " + stack.size());
	}

	private void getElementeFromStack() {
		System.out.println("stack = " + stack);
	}
	
	private boolean isEmpty()
	{
		return stack.empty();
	}

	public static void main(String[] args) {

		Stacks stackKlasse = new Stacks();
		stackKlasse.addElementToStack("firstElem");
		stackKlasse.addElementToStack("secondElem");
		stackKlasse.addElementToStack("thirdElem");
		stackKlasse.addElementToStack("fourthElem");
		stackKlasse.getElementeFromStack();
		stackKlasse.getLength();
		
		stackKlasse.delElementFromStack();
		
		stackKlasse.getElementeFromStack();
		stackKlasse.getLength();
		System.out.println("Stack leer: " +stackKlasse.isEmpty());
	}

}
