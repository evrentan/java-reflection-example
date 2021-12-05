package evrentan.examples;

public class PrintHello {
  private String value;

  public PrintHello() {}

  public String getValue() {return value;}

  public void setValue(String value) {this.value = value;}

  private void printHello() {
    System.out.println(this.value);
  }
}
