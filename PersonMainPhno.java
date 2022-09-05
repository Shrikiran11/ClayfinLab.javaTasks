class Person{
    String firstName;
    String lastName;
    char gender;
    int age;
    int weight;
    private long phoneNo;
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
    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
}
public class PersonMainPhno{
    public static void main(String args[]){
        Person person=new Person("Pavan","jain",'M',32,65);
        person.setPhoneNo(1234567890);
        System.out.println("\nPhone Number: "+person.getPhoneNo());
    }