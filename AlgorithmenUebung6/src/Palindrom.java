
public class Palindrom {
  
  public Palindrom() {}
  
  public static boolean isPalindrom(String string){
    if (string.length() < 2){
      return true;
    }
    if (string.charAt(0) == string.charAt(string.length()-1)){
      return isPalindrom(string.substring(1, string.length()-1));
    }
    return false;
  }
}