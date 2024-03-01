//quest16
import java.util.Scanner;
class Prime{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter a prime number:");
int n=sc.nextInt();
if((n==0)||(n==1)){
System.out.println("it is prime");
}
else if(n%2==0){
System.out.println("it is not prime");
}
else{
System.out.println("it is not a prime");
}
}
}

