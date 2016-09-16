import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mName;
  private int mId;
  private List<Definition> mDefintions;
  private static List<Word> words = new ArrayList<Word>();

  public Word(String word) {
    mWord = word;
    words.add(this);
    mId = words.size();
    mDefinitions = new ArrayList<Definition>();
  }
}
