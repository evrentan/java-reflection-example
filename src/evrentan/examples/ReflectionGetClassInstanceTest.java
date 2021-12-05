package evrentan.examples;

public class ReflectionGetClassInstanceTest {

  public static void main(String[] args) throws ClassNotFoundException {

    //Get class instance by using forName() method
    Class reflectionTestClassWithForName = Class.forName("evrentan.examples.ReflectionGetClassInstanceTest");
    System.out.println(reflectionTestClassWithForName.getName());

    //Get class instance by using getClass() method
    ReflectionGetClassInstanceTest reflectionGetClassInstanceTest = new ReflectionGetClassInstanceTest();
    Class reflectionTestClassWithGetClass = reflectionGetClassInstanceTest.getClass();
    System.out.println(reflectionTestClassWithGetClass.getName());

    //Get class instance by class syntax
    Class reflectionTestClassWithClass = ReflectionGetClassInstanceTest.class;
    System.out.println(reflectionTestClassWithClass.getName());
  }
}