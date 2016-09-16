import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private int mID;
  // private List<Definition> mDefinitions;
  private static List<Word> mDictionary = new ArrayList<Word>();

  public Word(String _word) {
    mWord = _word;
    // mDefinitions = new ArrayList<Definition>();
    mDictionary.add(this);
    mID = mDictionary.size();
  }

  public String getWord() {
    return mWord;
  }

  public int getID() {
    return mID;
  }
}
