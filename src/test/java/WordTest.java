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
}
