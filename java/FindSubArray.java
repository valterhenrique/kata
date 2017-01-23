public class FindSubArray {
  public static void main(String[] args){

    int[] original = new int[]{1,2,3,4,5,9,8,7,6};
    int[] sub = new int[]{4,5,9};
    int iFound = new FindSubArray().find(original,sub);
    // expected 3
    System.out.println(iFound);

    original = new int[]{1,2,3,4,5,9,8,7,6};
    sub = new int[]{4,5,8};
    iFound = new FindSubArray().find(original,sub);
    // expected -1
    System.out.println(iFound);

    original = new int[]{1,1,1,2};
    sub = new int[]{1,1,2};
    iFound = new FindSubArray().find(original,sub);
    // expected 1
    System.out.println(iFound);

    original = new int[]{59,65,23,25,45,98,58,1,6,8,7,54,1,1,1,2,3,5,9,8,7,65,65,65,98,7,8,5,5,3,2,1,6,56,598,98,765,465,43,216,5498,765,432,15,4,545,47,1,2,2};
    sub = new int[]{1,1,2};
    iFound = new FindSubArray().find(original,sub);
    // expected 13
    System.out.println(iFound);

    original = new int[]{59,65,23,25,45,98,58,1,6,8,7,54,1,1,1,2,3,5,9,8,7,65,65,65,98,7,8,5,5,3,2,1,6,56,598,98,765,465,43,216,5498,765,432,15,4,545,47,1,2,2};
    sub = new int[]{65,65,65,98};
    iFound = new FindSubArray().find(original,sub);
    // expected 21
    System.out.println(iFound);
  }

  private int find(int[] original, int[] sub){
    int j = 0; int iFound = -1;
    findLoop:
    for (int i = 0; i < original.length; i++){
      if (original[i] == sub[0]){
        // System.out.println(i);
        if (contains(original, sub, i)){
          iFound = i;
          break findLoop;
        }
      }
    }
    return iFound;
  }

  private boolean contains(int[] original, int[] sub, int start){
    int j = 0;
    for (int a = start; a < (start+sub.length); a++){
      if (original[a] != sub[j]){
        return false;
      }else{
        j++;
      }
    }
    return j == sub.length;
  }
}
