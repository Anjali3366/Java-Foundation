import java.util.*;

public class PrintPrime {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Starting range : ");
        int lowRange = scn.nextInt();
        System.out.println("Enter the high range : ");
        int highRange = scn.nextInt();

 for(int i = lowRange;i<=highRange;i++){
int count =0;
for(int div =2;div<=Math.sqrt(i);div++){
if(i%div ==0){
    count++;
    break;
}
}
if(count == 0){
    System.out.println(i);
}


 }}}
    


