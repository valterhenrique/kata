import java.util.Random;

public class BubbleSort {

  public static void main(String[] args){
    // initialize array with N elements with random values
    int sizeArray = Integer.parseInt(args[0]);
    int[] unsortedArray = new int[sizeArray];
    for (int r = 0; r < unsortedArray.length; r++){
      unsortedArray[r] = new Random().nextInt();
    }

    long startTime = System.currentTimeMillis();
    int[] sortedArray = new BubbleSort().sort(unsortedArray);
    long endTime = System.currentTimeMillis();

    System.out.println("Result: " + (endTime - startTime) + " milliseconds");
  }

  private int[] sort(int[] array){
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array.length-1; j++){
        if (array[j] > array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    return array;
  }

}
