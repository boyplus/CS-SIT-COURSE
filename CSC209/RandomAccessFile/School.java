import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;
public class School {
    Vector<ClassRoom> c;
    public School(){
        this.c = new Vector<ClassRoom>();
    }
    public void addClassRoom(ClassRoom c1){
        this.c.add(c1);
        c1.writeToFile();
    }
    public void readFromFile(int index){
        try{
            RandomAccessFile raf = new RandomAccessFile("school.txt","rw");
            raf.seek(174*index);
            System.out.println("start : ");
            System.out.println(raf.getFilePointer());
            int n = raf.readInt();
            System.out.println(n);
            for(int i=0;i<10;i++){
                int id = raf.readInt();
                System.out.print(id+" ");
            }
            System.out.println();
            for(int i=0;i<10;i++){
                byte[] buffer = new byte[13];
                raf.read(buffer,0,13);
                String name = new String(buffer);
                System.out.print(name+" ");
            }
            System.out.println("end: ");
            System.out.println(raf.getFilePointer());
            System.out.println();
            raf.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void print(){
        for(ClassRoom nowC:this.c){
            nowC.toString();
        }
    }
}
