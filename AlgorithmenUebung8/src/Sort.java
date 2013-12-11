public class Sort {
  
  
  
  public static long shellSort(int[] array, String complexity){
    long startTime = System.currentTimeMillis();
    int i;
    int j;
    int h = decrementH(array.length, complexity);
    int e;
    while (h > 0){
      for (i = 0; i < (array.length - h);i++){
        e = array[i + h];
        j = i;
        while (j >= 0 && e < array[j]){
          array[j + h] = array[j];
          j = j - h;
        }
        array[j + h] = e;
      }
      h = decrementH(h, complexity);
    }
    return System.currentTimeMillis() - startTime;
  }
  
  private static int decrementH(int h, String complexity){
    if("knuth".equals(complexity)){
      return (h - 1) / 3;
    }
    if("hibbard".equals(complexity)){
      return (h / 2) - 1;
    }
    if("shell".equals(complexity)){
      return h / 3;
    }
    return 0;
  }
  
  public static int[] quicksort(int[] array, int first, int last){
    if (first < last){
    int x = array[(first + last)/2];
    int i = first;
    int j = last;
    int e;
      do {
        while(array[i] < x){
          i ++;
        }
        while (x < array[j]){
          j --;
        }
        if (i <= j){
          e = array[i];
          array[i] = array[j];
          array[j] = e;
          i ++;
          j --;
        }
      } while (i <= j);
      quicksort(array, first, j);
      quicksort(array, i, last);
    }
      return array;
  }
}