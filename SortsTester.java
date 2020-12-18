import java.util.Random;
import java.util.Arrays;
public class SortsTester{
  public static void main(String[] args){
    int size=2;
    int[] arr = new int[size];
    int b = (int)(Math.random()*1000);
    Random rng = new Random(b);
    for(int i =  0; i < size; i++ ){
      arr[i] = (rng.nextInt() % 1000);
    }
    Sorts tester = new Sorts();
    System.out.println("For seed #" + b ) ;
    System.out.println("Before: " + Arrays.toString(arr));
    tester.bubbleSort(arr);
    System.out.println("After: " +  Arrays.toString(arr));
  }
}
