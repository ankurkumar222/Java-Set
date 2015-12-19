package Code;
//: holding/UniqueWords.java
import java.util.*;

import Util.TextFile;
import Util.*;

public class UniqueWords {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>( new TextFile("SetOperations.java", "\\W+"));
    System.out.println(words);
  }
} 
