import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class WordTest {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

]
