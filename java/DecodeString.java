public class DecodeString {
  // https://www.careercup.com/question?id=5692396030394368

  public static void main(String[] args){
    String encoded ="3[a2[bd]g4[ef]h]";
    System.out.println(new DecodeString().decode(encoded));
  }

  private String decode(String str){
    int nOpenBrackets = 0; String decoded = ""; String finalDecoded = "";
    for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == '[') nOpenBrackets ++;
    }
    int expandedBracketsCount = 1;
    for (int i = str.length()-1; i >= 0; i--){
      String temp = ""; String partialDecoded = "";

      if (str.charAt(i) == '[' && expandedBracketsCount < nOpenBrackets){
        expandedBracketsCount++;
        int nPrints = Integer.parseInt(String.valueOf(str.charAt(i-1)));
        for (int j = 0; j < nPrints; j++){
          temp += String.valueOf(str.charAt(i+1))+String.valueOf(str.charAt(i+2));
        }
        temp += String.valueOf(str.charAt(i+4));
        decoded = temp + decoded;
      }
      if (i == 0){
        int nTimes = Integer.parseInt(String.valueOf(str.charAt(i)));
        for (int k = 0; k < nTimes; k++){
          finalDecoded += String.valueOf(str.charAt(i+2)) + decoded;
        }
      }
    }
    return finalDecoded;
  }
}
