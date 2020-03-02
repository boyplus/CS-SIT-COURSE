public class Queue {
    int first,last;
    int[] info;
    Queue(int capacity){
        this.info = new int[capacity];
        this.first = -1;
        this.last = -1;
    }
    public boolean isEmpty(){
        return first > last;
    }
    public void enqueue(int el){
        if(first == -1){
            this.first = 0;
            this.last = 0;
            this.info[0] = el;
        }
        else{
            this.info[++last] = el;
        }
    }
    public int dequeue(){
        return this.info[first++];
    }
    public int firstEl(){
        return this.info[first];
    }
    public void print(){
        for(int i=first;i<=last;i++){
            System.out.print(this.info[i]+" ");
        }
        System.out.println();
    }

}
