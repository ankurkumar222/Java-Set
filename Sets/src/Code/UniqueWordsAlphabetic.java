package Code;

// Producing an alphabetic listing.
import java.util.*;

import Util.TextFile;
import Util.*;

public class UniqueWordsAlphabetic {
  public static void main(String[] args) {
    Set<String> words =  new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    words.addAll( new TextFile("SetOperations.java", "\\W+"));
    System.out.println(words);
  }
}