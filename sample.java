public class Student
{
 private String firstName;
 private String lastName;
 private int age;
 private long IDNumber;
 private int gender;
 private double firstGrade;
 private double secondGrade;
 private double thirdGrade;
 private double x;
 private double Average;
    
    public Student(String a, String b, int c, long d, int e, double f, double g, double h) 
    {
     firstName = a;
     lastName = b;
     age = c;
     IDNumber = d;
     gender = e;
     firstGrade = f;
     secondGrade = g;
     thirdGrade = h;
    }
    
    public String getfirstName()
    {
     return firstName;
    }
    
    public String getlastName()
    {
     return lastName;
    }
    
    public int getage()
    {
     return age;
    }
    
    public long getIDNumber()
    {
     return IDNumber;
    }
    
    public int getgender()
    {
     return gender;
    }
    
    public double getfirstGrade()
    {
     return firstGrade;
    }
    
    public double getsecondGrade()
    {
     return secondGrade;
    }
    
    public double getthirdGrade()
    {
     return thirdGrade;
    }
    
    public void setfirstGrade(double x)
    {
     firstGrade = x;
    }
    
    public void setsecondGrade(double x)
    {
     secondGrade = x;
    }
    
    public void setthirdGrade(double x)
    {
     thirdGrade = x;
    }
    
    public double calculateAverage()
    {
     Average = firstGrade + secondGrade + thirdGrade;
     return Average;
    }
    
    public String toString()
    {
     return "First Student: [First Name: " + firstName + "] [Last Name: " + lastName + "] [Age: " + age + "] [ID: " + IDNumber + "] [Gender: " + gender + "] [Grades : " + firstGrade + ", " +secondGrade + " and " + thirdGrade + "] [Average: " + Average + "]";
    }
    

}
