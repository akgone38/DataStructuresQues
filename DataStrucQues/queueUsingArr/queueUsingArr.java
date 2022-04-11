public class stack{
    //class variables
    private int[] arr;
    private int front = 0, back = 0;
    private int sizeOfArray = 0;
    private int sizeOfQueue = 0;

    public queue(){
        this.initialize(5);
    }

    public queue(int size){
        this.intialize(size);
    }

    public void initialize(int size){
        this.arr = new int[size];
        this.front = this.back = 0;
        this.sizeOfArray= size;
        this.sizeOfStack = 0;
    }

    //exception
    private void queueIsFullException() throws Exception{
        if(this.sizeOfQueue == this.sizeOfArray){
            throw new Exception("Stack is full rightnow!");
        }
    }
    
    private void queueIsEmptyException() throws Exception{
        if(this.sizeOfQueue == 0){
            throw new Exception("Stack is empty!");
        }
    }

    public boolean isEmpty(){
        return this.sizeOfQueue==0;
    }
    public int size(){
        return this.sizeOfQueue;
    }
    public void display(){
        for(int i=0;i<this.sizeOfQueue;i++){
            int idx = (this.front+i)%this.sizeOfArray;
            System.out.print(this.arr[this.idx]+" ");
        }
    }

    //functions
    public void push(int val) throws Exception{
        queueIsFullException();
        this.arr[this.back] = val;
        this.sizeOfQueue++;
        this.back = (this.back+1)%this.sizeOfArray;
    }

    public int pop() throws Exception{
        int val = this.front();
        this.arr[this.front]= 0;
        this.sizeOfQueue--;
        this.front = (this.front+1)%this.sizeOfArray;

        return val;
    }
    public int front() throws Exception{
        queueIsEmptyException();
        return this.arr[this.tos];
    }
} 