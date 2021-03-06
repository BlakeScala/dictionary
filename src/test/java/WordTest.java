import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class WordTest {

  @After
  public void wordClear() {
    Word.clear();
  }

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word test = new Word("test");
    assertEquals(true, test instanceof Word);
  }

  @Test
  public void Word_returnsWord_String() {
    Word test = new Word("test");
    assertEquals("test", test.getWord());
  }

  @Test
  public void Word_assignsUniqueID_int() {
    Word test = new Word("test");
    Word phrase = new Word("Hey there");
    assertEquals(1, test.getID());
    assertEquals(2, phrase.getID());
  }

  @Test
  public void Word_includesAllInstances_true() {
    Word test = new Word("test");
    Word phrase = new Word("Hey there");
    assertEquals(true, Word.all().contains(test));
    assertEquals(true, Word.all().contains(phrase));
  }

  @Test
  public void Word_findReturnsSameWord_String() {
    Word test = new Word("test");
    Word phrase = new Word("Hey there");
    assertEquals(phrase, Word.find(phrase.getID()));
  }

  @Test
  public void getDefinitions_initiallyReturnsEmpty_true() {
    Word test = new Word("test");
    assertEquals(test.getDefinitions().size(), 0);
  }

  @Test
  public void Word_addsDefinitionToWord_true() {
    Word test = new Word("test");
    Definition testDefinition = new Definition("a critical examination, observation, or evaluation");
    test.define(testDefinition);
    assertEquals(true, test.getDefinitions().contains(testDefinition));
  }

  @Test
  public void Word_addsMultipleDefinitionToWord_true() {
    Word test = new Word("test");
    Definition testDefinition = new Definition("a critical examination, observation, or evaluation");
    Definition testDefinitionTwo = new Definition("a means of testing");
    test.define(testDefinition);
    test.define(testDefinitionTwo);
    assertEquals(true, test.getDefinitions().contains(testDefinition));
    assertEquals(true, test.getDefinitions().contains(testDefinitionTwo));
  }
}
