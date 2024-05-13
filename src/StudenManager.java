import java.util.Arrays;

public class StudenManager {
//    private int id;
//    private  String name;
//    private  int age;
//    private int course;
    private Student[] students;

    public StudenManager(){
    }
    public StudenManager(Student[] students){
        this.students=students;
    }
    public void setStudents(Student[] students){
        this.students=students;
    }
    public Student[]students(){
        return students;
    }
    public void addStudent (Student newStudeent){
        students= Arrays.copyOf(students, students.length+1);
        students[students.length-1]=newStudeent;
    }
    public void searchById(int exId){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId()==exId){
                System.out.println(students[i].getId()+" "+students[i].getName()+" "+students[i].getAge()+" "+students[i].getCourse());

            }
        }
    }
    public void deleteById(int deleteId){
        int exId=0;

        for (int i = 0; i < students.length; i++) {

            if (students[i].getId()==deleteId) {
                exId=i;
            }
        }
        Student[] newStudent= new Student[students.length-1];
        int newId=0;
        for (int i = 0; i < students.length; i++) {
            if (i!=exId){
                newStudent[newId]=students[i];
                newId++;
            }


        }
         students=newStudent;
    }
    public void allStudent (){
        for (Student student:students){
            System.out.println(student.getId()+" "+student.getName()+" "+student.getAge()+" "+student.getCourse());
        }
    }

}
