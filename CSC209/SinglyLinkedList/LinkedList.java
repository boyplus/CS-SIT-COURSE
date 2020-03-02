public class LinkedList {
    //head, tail -> address of node
    Node head,tail;
    int size;
    LinkedList(){
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addToHead(int info){
        //1. linked list ว่าง (head == null, isEmpty() = true)
        if(isEmpty() == true){
            head = tail = new Node(info);
        }
        //2. linked list ไม่ว่าง
        else{
            head = new Node(info,head);
        }
        size++;
    }
    public void addToTail(int info){
        if(isEmpty()){
            head = tail = new Node(info);
        }
        else{
            tail.next = new Node(info);
            //update the tail to the new Node that we have just create
            tail = tail.next;
        }
        size++;
    }
    public void removeHead(){
        if(isEmpty()){
            System.out.println("Your linked list is empty");
        }
        else{
            head = head.next;
            size--;
        }
    }
    public void removeTail(){
        if(isEmpty()){
            System.out.println("Your linked list is empty");
        }
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
    }
    public void insert(int idx,int info){
        if(idx == 0){
            addToHead(info);
        }
        else if(idx == size){
            addToTail(info);
        }
        else{
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = new Node(info,temp.next);
        }
    }
    public void remove(int idx){
        Node temp = head;
        if(idx == 0){
            removeHead();
        }
        if(idx >= size){
            removeTail();
        }
        else{
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    public void removeTailAnother(){
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    public int search(int want){
        Node temp = head;
        int cnt = 0;
        while(temp != null && temp.info != want){
            temp = temp.next;
            cnt++;
        }
        if(temp.info == want){
            return cnt;
        }
        return -1;
    }
    public void print(){
        Node nowNode = head;
        while(nowNode != null){
            System.out.print(nowNode.info+" ");
            nowNode = nowNode.next;
        }
        System.out.println();
    }
}
