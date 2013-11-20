import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queues<Item> implements Iterable<Item> {

	private int N; // number of elements on queue
	private Node<Item> first; // beginning of queue
	private Node<Item> last; // end of queue

	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}

	public Queues() {
		first = null;
		last = null;
		N = 0;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return N;
	}

	public Item peek() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		return first.item;
	}

	/**
	 * Enqueue, Hinzufügen in die Warteschlange
	 * 
	 * @param item
	 */
	public void enqueue(Item item) {
		Node<Item> oldlast = last;
		last = new Node<Item>();
		last.item = item;
		last.next = null;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
		N++;
	}

	/**
	 * Dequeue, Entfernen aus der Warteschlange
	 * 
	 * @return
	 */
	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue underflow");
		Item item = first.item;
		first = first.next;
		N--;
		if (isEmpty())
			last = null; // to avoid loitering
		return item;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Item item : this)
			s.append(item + " ");
		return s.toString();
	}

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator<Item>(first);
	}

	public static void main(String[] args) {
		Queues warteschl = new Queues<String>();
		warteschl.enqueue("firstelem");
		warteschl.enqueue("secondelem");
		warteschl.enqueue("thirdelem");
		warteschl.dequeue();
		System.out.println("Size: " + warteschl.size());

		System.out
				.println("Elemente in Warteschlange: " + warteschl.toString());

		System.out.println("Warteschlange ist leer: " + warteschl.isEmpty());
	}

	private class ListIterator<Item> implements Iterator<Item> {
		private Node<Item> current;

		public ListIterator(Node<Item> first) {
			current = first;
		}

		public boolean hasNext() {
			return current != null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}
