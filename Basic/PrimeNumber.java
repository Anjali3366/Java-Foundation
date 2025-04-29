import java.util.Scanner;

public class PrimeNumber {

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");

int num = sc.nextInt();
int div =2;
int count =0;

while(div<Math.sqrt(num)){
if(num%div == 0  ){

    count++;
    break;

}
else{
    div +=1;
} 

}

if(count==0){
    System.out.println("Given number is prime");
}else{
    System.out.println("Given number is  not prime");
}

}
    
}
