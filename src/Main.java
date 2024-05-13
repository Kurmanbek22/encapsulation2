public class Main {
    public static void main(String[] args) {
       Student[] students = new Student[]{
                           new Student(10,"Asan",20,"java-12"),
                           new Student(11,"Uson",18,"JS"),
                           new Student(12, "Batma",32,"python"),
                           new Student(13,"Zuura",27,"C++")};

       StudenManager studenManager= new StudenManager(students);
       Student student1=new Student(14,"emil",43,"C#");
//       studenManager.addStudent(student1);
//       studenManager.searchById(12);
       studenManager.deleteById(11);
        studenManager.allStudent();

    }
}