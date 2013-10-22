public class EinfachVerketteteListe {

	ListElement startElem = new ListElement("Kopf");
	public int listenLaenge;

	public EinfachVerketteteListe() {
	}

	public void addLast(Object o) {
		ListElement newElem = new ListElement(o);
		ListElement lastElem = getLastElem();
		lastElem.setNextElem(newElem);
	}

	public void addFirst(Object o) {
		ListElement newElem = new ListElement(o);

		ListElement firstElem = getFirstElem();

		newElem.setNextElem(firstElem.nextElem);
		newElem.setPreviouElem(firstElem);
		firstElem.setNextElem(newElem);

	}

	public void insertAfter(Object prevItem, Object newItem) {
		ListElement newElem, nextElem, pointerElem;
		pointerElem = startElem.getNextElem();
		while (pointerElem != null && !pointerElem.getObj().equals(prevItem)) {
			pointerElem = pointerElem.getNextElem();
		}
		newElem = new ListElement(newItem);
		nextElem = pointerElem.getNextElem();
		pointerElem.setNextElem(newElem);
		newElem.setNextElem(nextElem);
	}

	public void delete(Object o) {
		ListElement le = startElem;
		while (le.getNextElem() != null && !le.getObj().equals(o)) {
			if (le.getNextElem().getObj().equals(o)) {
				if (le.getNextElem().getNextElem() != null)
					le.setNextElem(le.getNextElem().getNextElem());
				else {
					le.setNextElem(null);
					break;
				}
			}
			le = le.getNextElem();
		}
	}

	public boolean find(Object o) {
		ListElement le = startElem;

		while (le != null) {
			if (le.getObj().equals(o))
				return true;
			le = le.nextElem;
		}
		return false;
	}

	public ListElement getFirstElem() {
		return startElem;
	}

	public ListElement getLastElem() {
		this.listenLaenge = 0;
		ListElement le = startElem;
		while (le.getNextElem() != null) {
			le = le.getNextElem();
			this.listenLaenge++;
		}
		return le;
	}

	public void writeList() {
		ListElement le = startElem;
		while (le != null) {
			System.out.println(le.getObj());
			le = le.getNextElem();
		}
	}

	public void isInMenge(ListElement listElem, EinfachVerketteteListe[] menge) {
		// durch die menge hindurchgehen und die find-methode aufrufen
		for (int i = 0; i < menge.length; i++) {
			boolean vorhanen = menge[i].findinMenge(listElem, this);
			System.out.println("das Objekt ist in der Menge vorhanden.....");
		}
		// wenn gefunden, dann return true
	}

	public boolean findinMenge(Object o, EinfachVerketteteListe liste) {

		ListElement le = liste.startElem;

		while (le != null) {
			if (le.getObj().equals(o))
				return true;
			le = le.nextElem;
		}
		return false;
	}

	public static void main(String[] args) {
		EinfachVerketteteListe list = new EinfachVerketteteListe();
		list.addLast("1");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.addLast("5");
		list.addFirst("firstelem");
		list.insertAfter("2", "neu");
		list.delete("3");
		list.writeList();
		System.out.println("erstes Element: " + list.getFirstElem().getObj());
		System.out.println("ist '3' enthalten? " + list.find("3"));
		System.out.println("ist '5' enthalten? " + list.find("5"));
		System.out.println("letztes Element: " + list.getLastElem().getObj());
		System.out.println("Anzahl Elemente: " + list.listenLaenge);
		
	}
}

class ListElement {

	ListElement previousElem;

	Object obj;

	ListElement nextElem;

	public ListElement(Object obj) {
		this.obj = obj;
		nextElem = null;
		previousElem = null;
	}

	public void setNextElem(ListElement nextElem) {
		this.nextElem = nextElem;
	}

	public void setPreviouElem(ListElement previousElem) {
		this.previousElem = previousElem;
	}

	public ListElement getNextElem() {

		return nextElem;
	}

	public ListElement getPreviousElem() {

		return previousElem;
	}

	public Object getObj() {
		return obj;
	}
}