class Person{
    enum Gender{
        M,
        F;
    }
    String firstName;
    String lastName;
    int age;
    int weight;
    char gender;
    private long phoneNo;
    Person(){
        
    }
    Person( String firstName,String lastName,char gender,
    int age,
    int weight){
     this.firstName=firstName;
     this.lastName=lastName;
     this.gender=gender;
     this.age=age;
     this.weight=weight;
     System.out.println("Person Details");
    System.out.println("-----------------");
    System.out.println("First Name: "+firstName);
    System.out.println("Last Name: "+lastName);
    
    if(gender=='M'){
        Gender g=Gender.M;
        System.out.println("Gender: "+g);
    }else if(gender=='F'){
        Gender g=Gender.F;
        System.out.println("Gender: "+g);
    }else{
        System.out.println("Invalid gender input");
    }
    
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
public class PersonMainGender{
    public static void main(String args[]){
        Person person=new Person("Pavan","jain",'M',32,65);
        
    }
}