import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the MyStack class.
 */
public class MyStackTest {

  @Test
  public void testPushAndToString() {
    MyStack<String> stack = new MyStack<>();
    stack.push("Hello");
    stack.push("World");
    assertEquals("Stack: Hello World", stack.toString());

    MyStack<Integer> intStack = new MyStack<>();
    intStack.push(1);
    intStack.push(2);
    assertEquals("Stack: 1 2", intStack.toString());

    MyStack<String> Stack = new MyStack<>();
    Stack.push("Hi");
    Stack.push("Sijing");
    assertEquals("Stack: Hi Sijing", Stack.toString());
  }

  @Test
  public void testPopAndEmpty() {
    MyStack<Integer> stack = new MyStack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    assertEquals(30, stack.pop());
    assertEquals(20, stack.pop());
    assertFalse(stack.empty());
    assertEquals(10, stack.pop());
    assertTrue(stack.empty());
  }

  @Test
  public void testPopEmptyStackThrowsException() {
    MyStack<String> stack = new MyStack<>();
    assertThrows(EmptyStackException.class, stack::pop);
  }

  @Test
  public void testTopWithStringType() {
    MyStack<String> stack = new MyStack<>();
    stack.push("abs");
    stack.push("bbs");
    stack.push("ccc");
    assertEquals("ccc", stack.top());
    stack.pop();
    assertEquals("bbs", stack.top());
    stack.pop();
    assertEquals("abs", stack.top());
    assertFalse(stack.empty());
  }

  @Test
  public void testTopEmptyStackThrowsException() {
    MyStack<Double> stack = new MyStack<>();
    assertThrows(EmptyStackException.class, stack::top);
  }

  @Test
  public void testEmptyWithBookType() {
    MyStack<Book> stack = new MyStack<>();
    assertTrue(stack.empty());
    Person author= new Person("Paul","Tobin",1983);
    stack.push(new Book("The Witcher",author,35.0f));
    assertFalse(stack.empty());
  }
}
