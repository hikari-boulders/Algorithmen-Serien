
public class ListenMenge extends EinfacheListe{
	

	    public ListenMenge() {
	    }

	    
	    public void merge(ListenMenge set) {
	    	ListenElement element = set.getFirstElement();
	            if (element == null){
	                    return;
	            }
	            while (element.getNext() != null) {
	                    if (this.doesExist(element) == false) {
	                            this.addFirst(new ListenElement(element.get()));
	                    }
	                    element = element.getNext();
	            }
	            if (this.doesExist(element) == false) {
	                    this.addFirst(new ListenElement(element.get()));
	            }
	    }

	    public void slice(ListenMenge set) {
	    	ListenElement element = getFirstElement();
	            if (element == null){
	                    return;
	            }
	            while (element.getNext() != null) {
	                    if (set.doesExist(element) == false) {
	                            this.removeElement(element);
	                    }
	                    element = element.getNext();
	            }
	            if (set.doesExist(element) == false) {
	                    this.removeElement(element);
	            }
	    }
	    
	    @Override
	    public int getSize(){
	            int size = 1;
	            ListenElement element = copyWithoutDuplicate().getFirstElement();
	            if (element == null) {
	                    return 0;
	            }
	            while (element.getNext() != null) {
	                    element = element.getNext();
	                    size++;
	            }
	            return size;
	    }
	    
	    @Override
	    public int hashCode(){
	    	ListenElement element = copyWithoutDuplicate().getFirstElement();
	            if (element == null) {
	                    return 0;
	            }
	            int hashCode = 0;
	            while (element.getNext() != null) {
	                    hashCode += element.get() * 17;
	                    element = element.getNext();
	            }
	            hashCode += element.get() * 17;
	            return hashCode;
	    }
	    
	    @Override
	    public boolean equals(Object obj){
	            if (obj instanceof ListenMenge == false) {
	                    return false;
	            }
	            if (hashCode() == ((ListenMenge) obj).hashCode()) {
	                    return true;
	            }
	            return false;
	    }

	    @Override
	    public String toString() {
	            if (getFirstElement() == null) {
	                    return "{}";
	            }
	            String string = "{";
	            ListenElement element = getFirstElement();
	            while (element.getNext() != null) {
	                    string += element.toString() + ";";
	                    element = element.getNext();
	            }
	            string += element.toString() + "}";
	            return string;
	    }
	    
	    
	    private EinfacheListe copyWithoutDuplicate(){
	            ListenMenge set = new ListenMenge();
	            ListenElement element = getFirstElement();
	            if (element == null) {
	                    return set;
	            }
	            while(element.getNext() != null){
	                    if (set.doesExist(element) == false){
	                            set.addFirst(new ListenElement(element.get()));
	                    }
	                    element = element.getNext();
	            }
	            if (set.doesExist(element) == false){
	                    set.addFirst(new ListenElement(element.get()));
	            }                
	            return set;
	    }
	}

