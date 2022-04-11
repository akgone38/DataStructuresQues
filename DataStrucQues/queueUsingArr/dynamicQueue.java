public class dynamicQueue extends queue{
    public dynamicQueue(int size){
        super(size);
    }
    @Override
    public void push(int val) throws Exception{
        if(super.sizeOfQueue == super.sizeOfArray){
            int[] temp = new int[super.size()];
            int idx= 0
            while(super.size()!=0){
                temp[idx++] = super.pop();
            }
            super.initialize(super.sizeOfArray()*2);
            for(int i=0;i<temp.length;i++){
                super.push(temp[i]);
            }
        }
        super.push(val);
    }
}