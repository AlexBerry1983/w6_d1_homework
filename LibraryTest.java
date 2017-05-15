import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest {
  Library library;
  Book book;

  @Before
  public void before() {
    library = new Library("Alexandria");
    book = new Book();
  }

  @Test
  public void hasName() {
    assertEquals("Alexandria", library.getName());
  }
}