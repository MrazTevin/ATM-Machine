public class AccountOwner {
    String user_name;
    int age;
    String account_designation;
     
    public AccountOwner(String name) {
        this.user_name = name;
    }
    
    public void userAge(int userAge) {
        age = userAge;
    }
    
    public void userJobDescription(String userJob) {
        account_designation = userJob;
    }
    
    public void printAccountDetails() {
        System.out.println("Name : " + user_name);
        System.out.println("Age : " + age);
        System.out.println("Designation : " + account_designation);
    }
 }
