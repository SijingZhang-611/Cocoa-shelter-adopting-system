import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * A generic stack implementation using an ArrayList as the underlying data structure
 * @param <T> the type of elements in this stack
 */
public class MyStack<T> {

  private ArrayList<T> stack;

  /**
   * Constructs an empty stack.
   */
  public MyStack() {
    this.stack = new ArrayList<>();
  }

  /**
   * Pushes an element in the stack.
   *
   * @param x the element need to push into the stack.
   */
  public void push(T x) {
    this.stack.add(x);
  }

  /**
   * Pop and return the last element in the stack.
   *
   * @return the last element in the stack.
   * @throws throw the EmptyStackException if the stack is empty.
   */
  public T pop() {
    if (this.stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return this.stack.remove(this.stack.size() - 1);
  }

  /**
   * Check and return the last element of the stack.
   *
   * @return the last element of the stack.
   * @throws throw the EmptyStackException if the stack is empty.
   */
  public T top() {
    if (this.stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return this.stack.get(this.stack.size() - 1);
  }

  /**
   * Checks if the stack is empty.
   *
   * @return true if the stack is empty, false otherwise
   */
  public boolean empty() {
    return this.stack.isEmpty();
  }

  /**
   * Returns a string representation of the stack.
   *
   * @return a string representation of the stack
   */
  @Override
  public String toString() {
    String result = "Stack: ";
    for (T element : this.stack) {
      result += element + " ";
    }
    return result.trim();
  }
}
