public class Stack {
    int[] info;
    int size;
    Stack(int capacity){
        this.info = new int[capacity];
    }
    public boolean isEmpty(){
        return  size == 0;
    }
    public void push(int el){
        this.info[size++] = el;
    }
    public int topEl(){
        return this.info[size-1];
    }
    public int pop(){
        return this.info[--size];
    }
    public void reverse1(){
        //use 2 stack
        Stack x = new Stack(this.size),y = new Stack(this.size);
        while(this.isEmpty() == false){
            x.push(this.pop());
        }
        while(x.isEmpty() == false){
            y.push(x.pop());
        }
        while(y.isEmpty() == false){
            this.push(y.pop());
        }
    }
    public void reverse2(){
        //use 1 queue
        Queue q = new Queue(this.size);
        while(this.isEmpty() == false){
            q.enqueue(this.pop());
        }
        while(q.isEmpty() == false){
            this.push(q.dequeue());
        }
    }
    public void reverse3(){
        //use 1 stack and ont int
    }
    public void print(){
        for(int i=size-1;i>=0;i--){
            System.out.print(this.info[i]+" ");
        }
        System.out.println();
    }
}
