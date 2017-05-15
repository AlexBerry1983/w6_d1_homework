class Library {
  private String name;
  private Book[] pile;

  public Library(String name) {
    this.name = name;
    this.pile = new Book[5];
  }

  public String getName() {
    return this.name;
  }

  public int bookCount() {
    int count = 0;
    for (Book book : pile) {
      if (book != null) {
        count++;
      }
    }
  return count;
  }

  public void add(Book book) {
    int index = bookCount();
    pile[index] = book;
  }

}