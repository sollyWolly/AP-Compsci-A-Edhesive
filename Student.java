public class Student
{
  private String firstName;
  private String lastName;
  private int gradeLevel;
  private double gpa;
  private static int studentID = 0;
  private String sent = "";
  
  public Student(){
    Student x = new Student();
    firstName = "none";
    lastName = "none";
    gradeLevel = 0;
    gpa = 0.0;
    Student.studentID++;
    
  }
  public Student(String first, String last, int grade, double gpa1){
    firstName = first;
    lastName = last;
    if(grade >= 0 && grade <= 12){
      gradeLevel = grade;
    }
    if(grade < 0 && grade > 0){
      gradeLevel = 0;
    }
    if(gpa1 >= 0.0 && gpa1 <= 4.5){
      gpa = gpa1;
    }
    if(gpa1 < 0.0 && gpa1 > 4.5){
      gpa = 0.0;
    }
    Student.studentID++;
  }
  public String toString(){
    sent = sent + lastName + ", " + firstName + "\n" + "GPA: " + gpa + "\n" + "Grade Level: " + gradeLevel + "id #" + studentID;
    return sent;
  }
}
