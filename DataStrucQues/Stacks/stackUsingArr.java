public class stack{
    //class variables
    private int[] arr;
    private int sizeOfArray = 0;
    private int sizeOfStack = 0;
    private int top = -1;

    public stack(){
        initialize(5);
    }

    public stack(int size){
        intialize(size);
    }

    public void initialize(int size){
        this.arr = new int[size];
        this.sizeOfArray= size;
        this.sizeOfStack = 0;
        this.top = -1;
    }

    //exception
    private void stackIsFullException() throws Exception{
        if(this.sizeOfStack == this.sizeOfArray){
            throw new Exception("Stack is full rightnow!");
        }
    }
    
    private void stackIsEmptyException() throws Exception{
        if(this.sizeOfStack == 0){
            throw new Exception("Stack is empty!");
        }
    }

    public boolean isEmpty(){
        return this.sizeOfStack==0;
    }
    public int size(){
        return this.sizeOfStack;
    }

    //functions
    public void push(int val) throws Exception{
        stackIsFullException();
        this.tos++;
        this.arr[this.tos]= val;
        this.sizeOfStack++;
    }
    public int pop() throws Exception{
        stackIsEmptyException();
        int val = this.top();
        this.arr[this.tos]=0;
        this.sizeOfStack--;
        this.tos--;
        
        return val;
    }
    public int top() throws Exception{
        stackIsEmptyException();
        return this.arr[this.tos];
    }
} 