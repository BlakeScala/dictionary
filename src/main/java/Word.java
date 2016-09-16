import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private int mId;
  // private List<Definition> mDefintions;
  private static List<Word> mDictionary = new ArrayList<Word>();

  public Word(String _word) {
    mWord = _word;
    // mDefinitions = new ArrayList<Definition>();
    mId = words.size();
    mDictionary.add(this);
  }

  public String getWord() {
    return mWord;
  }
}
