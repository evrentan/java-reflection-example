package evrentan.examples;

public class PrintHelloClass {
  private String value;

  public PrintHelloClass() {}

  public String getValue() {return value;}

  public void setValue(String value) {this.value = value;}

  private void printHello() {
    System.out.println(this.value);
  }
}
