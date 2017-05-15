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
}