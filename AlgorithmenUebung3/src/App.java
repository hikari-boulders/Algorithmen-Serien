public class App {

	public static void main(String[] args) {
		EinfacheListe liste = new EinfacheListe();

		
		
		liste.addFirst(new ListenElement(1));
		liste.addLast(new ListenElement(2));
		liste.addLast(new ListenElement(3));
		liste.addLast(new ListenElement(4));
		liste.addLast(new ListenElement(5));
		liste.addLast(new ListenElement(6));
		liste.addFirst(new ListenElement(7));
		
		System.out.println("In der Liste ist das Element 5 vorhanden: " + liste.doesExist(new ListenElement(5)));
		
		System.out.println("Das letzte Element ist: " +liste.getLastElement());
		
		
		System.out.println("Die Liste hat " + liste.getSize() + " Elemente.");

		((EinfacheListe) liste).writeList();
		
		System.out.println(".......Menge......");
		
		ListenMenge menge = new ListenMenge();
		
		menge.addFirst(new ListenElement(1));
		menge.addLast(new ListenElement(2));
		menge.addLast(new ListenElement(3));
		menge.addLast(new ListenElement(4));
		menge.addLast(new ListenElement(5));
		menge.addLast(new ListenElement(6));
		menge.addFirst(new ListenElement(7));
		
ListenMenge menge2 = new ListenMenge();
		
		menge2.addFirst(new ListenElement(21));
		menge2.addLast(new ListenElement(22));
		menge2.addLast(new ListenElement(23));
		menge2.addLast(new ListenElement(24));
		menge2.addLast(new ListenElement(25));
		menge2.addLast(new ListenElement(26));
		menge2.addFirst(new ListenElement(27));
		
		System.out.println("In der Menge ist das Element 5 vorhanden: " + menge.doesExist(new ListenElement(5)));
		
		System.out.println("Das letzte Element ist: " +menge.getLastElement());
		
		
		System.out.println("Die Menge hat " + menge.getSize() + " Elemente.");

		((EinfacheListe) menge).writeList();
		
		
		System.out.println("Liste wird zusammengemerged");
		
		menge.merge(menge2);
		((EinfacheListe) menge).writeList();
		

	}
}