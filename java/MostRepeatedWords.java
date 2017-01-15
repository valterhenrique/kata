public class MostRepeatedWords {

  // Take a paragraph as Input and output the top three most repeated words
  public static void main(String[] args){
    final String paragraph = "Curabitur sem erat, sodales eget maximus ut, volutpat quis quam. Cras et accumsan tortor. Proin ultrices nisi vitae fermentum porta. Curabitur egestas bibendum nunc sit amet semper. In vulputate tortor et orci faucibus, vel rhoncus risus aliquet. Quisque faucibus, justo vitae fringilla imperdiet, tortor nisi fermentum metus, vel commodo nisl enim a sapien. Suspendisse dictum est ac sodales feugiat. Fusce aliquam, metus nec malesuada interdum, dui neque commodo nunc, vel interdum dui erat sed sem. Proin gravida molestie purus et tincidunt. Vivamus sed varius purus. Suspendisse potenti. Aliquam lobortis eget urna quis sagittis. Praesent est elit, bibendum sed egestas placerat, scelerisque sed felis. Quisque in pharetra mi, nec iaculis enim. Nullam vitae urna a felis porta pharetra id vitae est.";
    final String[] words = paragraph.split(" ");

    String[] topWords = new String[]{"", "", ""};
    topWords[0]=countWords(words, topWords);
    topWords[1]=countWords(words, topWords);
    topWords[2]=countWords(words, topWords);

    for (int i =0; i < topWords.length; i++){
      System.out.println("Word " + topWords[i] + "has apperead " + manyTimes(topWords[i], words) + " times");
    }

  }

  private static String countWords(String[] words, String[] excludeWords){
    String topWord = "";
    int topWordCount = 0;
    for (int i = 0; i < words.length; i++){
      if (!words[i].equals(excludeWords[0])){
        if (!words[i].equals(excludeWords[1])){
         int countResult = manyTimes(words[i], words);
         if (countResult > topWordCount){
           topWordCount = countResult;
           topWord = words[i];
         }
        }
      }
    }

    return topWord;
  }

  private static int manyTimes(String word, String[] words){
    int count = 0;
    for (int i = 0; i < words.length; i++){
      if (words[i].equals(word)){
        count++;
      }
    }
    return count;
  }

}
