public class Q2StackOfIntegers {  
    int size;
    int[] elements;

    public Q2StackOfIntegers(){
        this(16);
    }

    public Q2StackOfIntegers(int capacity){
        this.elements = new int[capacity];
    }

    public boolean empty(){
        return size == 0;
    }

    public int peek(){
        return this.elements[size-1];
    }

    public int getSize(){
        return size;
    }
    
    public void push(int i){
        this.elements[size++]=i;
    }

    public int pop(){
        return this.elements[--size];
    }

    public static void main(String[] args) 
    {
        Q2StackOfIntegers stack = new Q2StackOfIntegers();

        for (int i=0; i<10;i++)
            stack.push(i);
        
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
