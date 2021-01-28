public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
       boolean sorted = false;
      int length=data.length-1;
      while (!sorted){
          sorted=true;
          for (int i=0; i<length; i++){
              if (data[i]>data[i+1]){
                  int temp=data[i];
                  data[i]=data[i+1];
                  data[i+1]=temp;
                  sorted =false;
                }
            }
            length--;
        }
  }
  public static void selectionSort(int[] data) {
    int length=data.length;
      for (int i=0; i<length-1; i++){
        int ind=i;

      for (int j=i+1; j<length;j++){
        if (data[j]<data[ind])
          ind=j;
      }

      int temp=data[ind];
      data[ind]=data[i];
      data[i]=temp;
   }
 }
  public static void insertionSortZ(int[] data){
   for(int i = 1; i < data.length; i ++){
     int j = i;
     while(j > 0 && data[j-1]>data[j]){
       int temp = data[j];
       data[j]=data[j-1];
       data[j-1] = temp;
       j -=1;
     }
   }
 }
 public static void insertionSort(int[]data){
   for (int i=1; i<data.length; i++){
     int temp=data[i];
     int j=i-1;
     while(j>=0&&data[j]>temp){
       data[j+1]=data[j];
       j--;
     }
     data[j+1]=temp;
   }
 }
}
