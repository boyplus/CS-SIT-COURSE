public class Node {
    int info;
    Node next; //-> เก็บ address ของ node ตัวต่อไป
    Node(int info){
        this.info = info;
        this.next = null;
    }
    Node(int info,Node next){
        this.info = info;
        this.next = next;
    }
}
