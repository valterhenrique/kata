import java.util.Random;

public class FindSumInArray {
  // https://www.careercup.com/question?id=6285101383024640
  
  public static void main(String[] args){
    int[] array = new int[]{1,-10,18,29,75,12,3};
    int k = 15;
    boolean wasFound = new FindSumInArray().isFound(array, k);

    if (wasFound){
      System.out.println("K was found in the array");
    }else{
      System.out.println("K was NOT found");
    }
  }

  private boolean isFound(int[] array, int k){
    for (int i = 0; i < array.length -1; i++){
      for (int j = 1; j < array.length; j++){
        if ((array[i]+array[j]) == k){
          return true;
        }
      }
    }
    return false;
  }
}
