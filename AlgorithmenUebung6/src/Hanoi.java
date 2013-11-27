import java.util.HashSet;
import java.util.Set;

public class Hanoi {
  public static String A = "A";
  public static String B = "B";
  public static String C = "C";

  public Hanoi() {
  }

  /**
   * @param n
   *          Anzahl Scheiben
   * @return Lšsung als String der Art "AB - BC - .. - AC"
   */
  public static String solveHanoi(int n, String getLinks, String getRechts) {
    if (n < 1) {
      return "";
    }
    return solveHanoi(n - 1, getLinks, getMitte(getLinks, getRechts)) + " " + getLinks + getRechts + " " + solveHanoi(n - 1, getMitte(getLinks, getRechts), getRechts);
  }
  
  

  private static String getMitte(String leftBar, String rightBar) {
    Set<String> bars = new HashSet<String>();
    bars.add(leftBar);
    bars.add(rightBar);
    if (!bars.contains(A)){
      return A;
    } else if (!bars.contains(B)){
      return B;
    } else {
      return C;
    }
  }

}