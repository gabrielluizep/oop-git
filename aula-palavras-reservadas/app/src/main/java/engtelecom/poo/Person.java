package engtelecom.poo;

public class Person {
  private static int idCounter = 0;

  private int id;
  private String name;

  public Person(String name) {
    this.id = ++idCounter;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + "]";
  }

}
