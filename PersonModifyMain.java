import java.time.*;
import java.util.*;
class Person{
    String firstName;
    String lastName;
    char gender;
    int age;
    int weight;
    private long phoneNo;
    public static int calculateAge(LocalDate dob){
        int age1=dob.getYear();
        LocalDate ld=LocalDate.now();
        int age2=ld.getYear();
        return age2-age1;
    }
    public  String getFullName(){
       return firstName+lastName;
    }
    Person(){
        
    }
    Person( String firstName,String lastName,char gender, int age, int weight){
     this.firstName=firstName;
     this.lastName=lastName;
     this.gender=gender;
     this.age=age;
     this.weight=weight;
     System.out.println("Person Details");
    System.out.println("-----------------");
    System.out.println("First Name: "+firstName);
    System.out.println("Last Name: "+lastName);
    System.out.println("Gender: "+gender);
    System.out.println("\nAge: "+age);
    System.out.println("\nWeight: "+weight);
    }
   }
public class PersonModifyMain{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter DOB YYYY-MM-DD");
        String date=scn.next();
        LocalDate mydate=LocalDate.parse(date);
       int personAge= Person.calculateAge(mydate);
       System.out.println("Person age "+personAge);
        
         Person person=new Person("Pavan","jain",'M',personAge,65);
         String fullName=person.getFullName();
        System.out.println("FullName: "+fullName);
         }
}