
public class AccessModifer {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("AnjaliTomar");
    


        b1.setPassword("1234anj");
        b1.display();
    }
    
}

class BankAccount {
    public String name ;
   private String Password ;

 BankAccount(String name){
    this.name = name;


   }
        public void setPassword(String pwd ){
            Password = pwd;
        }

        public void display(){
            System.out.println(name);
            System.out.println(Password);
        }
}