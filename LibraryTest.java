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

  @Test
  public void pileStartsEmpty() {
    assertEquals(0, library.bookCount());
  }

  @Test
  public void canAdd() {
    library.add(book);
    assertEquals(1, library.bookCount());
  }

  @Test
  public void isPileFull() {
    for (int i = 0; i < 5; i++) {
      library.add(book);
    }
    assertEquals(true, library.isPileFull());
  }

}