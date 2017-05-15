class Library {
  private String name;
  private Book[] stock;

  public Library(String name) {
    this.name = name;
    this.stock = new Book[5];
  }

  public String getName() {
    return this.name;
  }

  public int bookCount() {
    int count = 0;
    for (Book book : stock) {
      if (book != null) {
        count++;
      }
    }
  return count;
  }

  public void add(Book book) {
    int index = bookCount();
    stock[index] = book;
  }

  public boolean isStockFull() {
    return bookCount() == stock.length;
  }
}