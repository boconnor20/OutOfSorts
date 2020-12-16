public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
      for (int i=0; i<data.length; i++){
          for (int j=0; j<data.length-1-i; j++){
              if (data[j]<data[j+1]){
                  j++;
              }
              else {
                  int temp=data[j];
                  data[j]=data[j+1];
                  data[j+1]=temp;
                }
            }
        }
  }

}
