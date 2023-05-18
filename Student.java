import java.io.*;
import java.io.FileOutputStream;

class Student implements Serializable{
  public int id;
  public String name;
  public int age;
  public int classroom;

    public Student(int id, String name, int age, int classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return  "Mã sinh viên : " + id + " ; Tên sinh viên : "  + name +  " ; Tên lớp : " +   age + " ; Tên lớp học : " + classroom + " ; ";
    }
}

class StudentProcess {
    public static boolean writeStudent(Student [] students){
        File file = new File("QuanLySV.dat");
        try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            return true;
            } catch (IOException e) {
               return false;
            }
        }
        public static Student[] readStudent(){
            File file = new File("QuanLySV.dat");
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                Student[] students = (Student[]) objectInputStream.readObject();
                for (Student student : students) {
                    System.out.println(student.toString());
                }
                objectInputStream.close();
                return new Student[]{};
        }catch (IOException | ClassNotFoundException e){
               return null;
            }
        }
}
class StudentApp{
    public static void main(String[] args) throws IOException{
         File file = new File("QuanLySV.dat");

         Student[] students = new Student[5];

         students[0] = new Student(1,"A", 5 , 10);
         students[1] = new Student(2,"B", 10 , 11);
         students[2] = new Student(3,"C", 15 , 12);
         students[3] = new Student(4,"D", 20 , 10);
         students[4] = new Student(5,"E", 25 , 11);


            StudentProcess.writeStudent(students);
            StudentProcess.readStudent();

    }
}