public class App {
  
  public static void main(String[] args){
//    testShellsort("shell");
    testQuickSort();
  }
  
  public static void testShellsort(String complexity){
    for (int i = 0; i < 8; i++){
      int[] array = createRandomArray(new Double(Math.pow(new Double(10), new Double(i))).intValue());
      System.out.println(Sort.shellSort(array, complexity));
    }
  }
  
  public static void testQuickSort(){
    long start;
    for (int i = 0; i < 8; i++){
      start = System.currentTimeMillis();
      int[] array = createRandomArray(new Double(Math.pow(new Double(10), new Double(i))).intValue());
      
      Sort.quicksort(array, 0, array.length-1);
      System.out.println(System.currentTimeMillis() - start);
    }
  }
  
  
  public static int[] createRandomArray(int length){
    int[] array = new int[length];
    for (int i = 0; i < length; i++){
      array[i] = new Double(Math.random()*1000).intValue();
     
    }
    return array;
  }
  
  
  public static String arrayToString(int[] array){
    String s = "{";
    for (int i = 0; i < array.length; i++){
      s = s + array[i] + ",";
    }
    s = s.substring(0, s.length()-1);
    s = s + "}";
    return s;
  }

}