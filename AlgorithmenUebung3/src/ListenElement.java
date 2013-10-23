public class ListenElement{

        private Integer wert;
        private ListenElement next;
        
        public ListenElement(){
                this.wert = 0;
        }
        
        public ListenElement(int wert){
                this.wert = wert;
        }
        
        public ListenElement(int wert, ListenElement next){
                this.wert = wert;
                this.next = next;
        }
        
        
        
        public void set(int wert){
                this.wert = wert;
        }
        
        public int get(){
                return this.wert;
        }
        
        public void setNext(ListenElement next){
                this.next = next;
        }
        
        public ListenElement getNext(){
                return this.next;
        }
        
        public void changeNext(ListenElement element){
                this.next = element;
        }
        
        @Override
        public String toString(){
                return wert.toString();
        }
        
        @Override
        public int hashCode(){
                return wert;
        }
        
        @Override
        public boolean equals(Object obj){
                if (obj instanceof ListenElement == false){
                        return false;
                }
                if (this.hashCode() == ((ListenElement)obj).hashCode()){
                        return true;
                }
                return false;
        }
}