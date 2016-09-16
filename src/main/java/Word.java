import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private int mID;
  private List<Definition> mDefinitions;
  private static List<Word> mDictionary = new ArrayList<Word>();

  public Word(String _word) {
    mWord = _word;
    mDefinitions = new ArrayList<Definition>();
    mDictionary.add(this);
    mID = mDictionary.size();
  }

  public static void clear() {
    mDictionary.clear();
  }

  public String getWord() {
    return mWord;
  }

  public int getID() {
    return mID;
  }

  public static List<Word> all() {
    return mDictionary;
  }

  public static Word find(int id) {
    return mDictionary.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }
}
