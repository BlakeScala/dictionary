import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class DefinitionTest {
  
  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("a critical examination, observation, or evaluation");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void Definition_returnsDefinition_String() {
    Definition testDefinition = new Definition("a critical examination, observation, or evaluation");
    assertEquals("a critical examination, observation, or evaluation", testDefinition.getDefinition());
  }
}
