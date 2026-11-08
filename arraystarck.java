package assigment;

import java.util.Arrays;
import java.util.EmptyStackException;


public class arraystarck<T> {

    private static final int DEFAULT_CAPACITY = 2;

    private int top;
    private T[] stack;

    // Constructor
    public arraystarck() {
        this(DEFAULT_CAPACITY);
    }

    public arraystarck(int initialCapacity) {
        top = 0;
        stack = (T[]) new Object[initialCapacity];
    }

    // Push method
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    // Expand Capacity method
    public void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    // Size method
    public int size() {
        return top;
    }

    // IsEmpty method
    public boolean isEmpty() {
        return top == 0;
    }

    // Pop method
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        top--;

        T result = stack[top];
        stack[top] = null;

        return result;
    }

    // Peek method
    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    // Display method
    public void display() {
        System.out.println("Stack Elements:");

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}


