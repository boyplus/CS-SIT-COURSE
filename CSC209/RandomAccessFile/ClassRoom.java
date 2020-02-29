import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
public class ClassRoom {
    int ID_SIZE = 10;
    int NAME_SIZE = 10;
    int NAME_LENGTH = 13;

    int nStudent;
    int[] id;
    String[] names;
    /*
    calculate the total bytes
    nStudent = 4 bytes
    id = 10*4 = 40 bytes
    names = 10*13 = 130 bytes
    total = 4+40+130 = 174
    */
    ClassRoom(int nStudent,int[] id,String[] names){
        this.nStudent = nStudent;
        this.id = id;
        this.names = names;
    }

    public void writeToFile(){
        try{
            RandomAccessFile raf = new RandomAccessFile("school.txt","rw");
            raf.seek(raf.length());
            //write n of student
            raf.writeInt(nStudent);

            //write actual array od if
            for(int i=0;i<id.length;i++){
                raf.writeInt(id[i]);
            }
            //write empty array of id
            for(int i=id.length;i<ID_SIZE;i++){
                raf.writeInt(-1);
            }

            //write actual array of names
            for(int i=0;i<names.length;i++){
                String newName = names[i]+"             ";
                raf.writeBytes(newName.substring(0,NAME_LENGTH));
            }


            //write empty array of names;
            for(int i=names.length;i<NAME_SIZE;i++){
                String emptyName = "             ";
                raf.writeBytes(emptyName.substring(0,NAME_LENGTH));
            }
            raf.close();

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        return "ClassRoom{" +
                "nStudent=" + nStudent +
                ", id=" + Arrays.toString(id) +
                ", names=" + Arrays.toString(names) +
                '}';
    }

    public int getnStudent() {
        return nStudent;
    }

    public void setnStudent(int nStudent) {
        this.nStudent = nStudent;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
