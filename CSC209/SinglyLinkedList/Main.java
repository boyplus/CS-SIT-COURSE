public class Main{
    public static void main(String[] args) {
        LinkedList boy = new LinkedList();
        boy.addToHead(5); //5
        boy.addToHead(3); //3 5
        boy.addToHead(12); // 12 3 5
        boy.addToTail(20); // 12 3 5 20
        boy.removeHead(); //3 5 20
        boy.removeTail(); //3 5
        boy.removeTailAnother(); // 3


        boy.insert(1,20); //3 20
        boy.insert(1,12); //3 12 20
        boy.insert(0,4); //4 3 12 20
        boy.print();
        boy.remove(2); //4 3 20
        boy.print();

        System.out.println(boy.search(20));

    }
}
