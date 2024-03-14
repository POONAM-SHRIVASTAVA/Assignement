
import java.util.Scanner;
class P1{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
/*int i=1;
int fact=1;
while(i<=5){
fact =fact*i;
i++;
System.out.println(fact);
}
}
}
*/
System.out.println("enter any number:");
int n=sc.nextInt();
int i=1;
int fact=1;
while(i<=n){
fact=fact*i;
i++;
System.out.println(fact);
}
}
}

