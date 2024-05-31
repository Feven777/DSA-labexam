package Question;
public class Stack {
    int[] numArray;
    int top;
    int size;

    public Stack(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    void push(int value) {
        if (top < numArray.length - 1) {
            numArray[++top] = value;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public int pop() {
        if (top >= 0) {
            int data = numArray[top--];
            size--;
            return data;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size: " + stack.getSize()); // Should print 3
        System.out.println("Popped: " + stack.pop()); // Should print 3
        System.out.println("Size: " + stack.getSize()); // Should print 2
    }
}

