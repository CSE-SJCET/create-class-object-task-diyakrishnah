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
        Student.student1=new Student();
           student1.name ="Diya";
           student1.rollNumber =33;
           student1.grade ='A';
           student1.displayDetails();
    }
}
