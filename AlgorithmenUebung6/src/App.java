public class App {

  public static void main(String[] args){
    // hier den auf Palindrom zu testenden String eingeben
    String w = "TESTTSET";
    System.out.println(Palindrom.isPalindrom(w));
    
    // hier die Anzahl Scheiben f�r die L�sung der T�rme von Hanoi eingeben
    int n = 3;
    System.out.println(Hanoi.solveHanoi(n, Hanoi.A, Hanoi.C));
  }
}