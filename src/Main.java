class Student{
     String name;
     int rollNumber;
     char grade;
     public void displayDetails(){
          System.out.println("Name:\t"+name);
          System.out.println("rollnumber:\t"+rollNumber);
          System.out.println("grade:\t"+grade);
public class Main {
      public static void main(String[] args) {
        Student.student=new Student();
           student.displayDetails();
    }
}
