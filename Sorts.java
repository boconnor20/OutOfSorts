public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
      for (int i=0; i<data.length; i++){
          for (int j=0; j<data.length-1-i; j++){

              if (data[j]>data[j+1]){
                  int temp=data[j];
                  data[j]=data[j+1];
                  data[j+1]=temp;
                }
            }
        }
  }
  public static void selectionSort(int[] data) {
   for(int i = 0; i < data.length -1; i++){
     int startingInd = i;

     for(int j = i + 1; j < data.length; j ++){
       if(data[j]<data[startingInd]){
         startingInd = j;
       }
     }

     int temp = data[startingInd];
     data[startingInd] = data[i];
     data[i] = temp;
   }
  }
  public static void insertionSort(int[] data){
    for (int i=1; i<data.length;i++){
      int temp = data[i];
      int j= i-1;
      while (j>=0&& data[j]>temp){
        data[j+1]=data[j];
        j--;
      }
      data[j+1]=temp;
    }
  }
}
