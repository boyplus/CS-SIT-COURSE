public class Main{
    public static void main(String[] args) {
        Stack boy = new Stack(20);
        boy.push(3);
        boy.push(2);
        boy.push(12);
        boy.print();

        boy.reverse1();
        boy.print();

        boy.reverse2();
        boy.print();
    }
}
