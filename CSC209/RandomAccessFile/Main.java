import java.io.*;
public class Main{
    public static void main(String[] args) {
        School boy = new School();
        int[] ids = {2,3,4,2,4,12};
        String[] names = {"boy","hello","note","turot","z","james"};
        ClassRoom c1 = new ClassRoom(6,ids,names);

        boy.addClassRoom(c1);
        boy.readFromFile(0);

        int[] ids2 = {1,2,3,4,5};
        String[] names2 = {"sad","wer","hello","1234","llll"};
        ClassRoom c2 = new ClassRoom(5,ids2,names2);
        boy.addClassRoom(c2);
        boy.readFromFile(1);
    }
}
