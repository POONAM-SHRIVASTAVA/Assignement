import java.util.Scanner;
class Digits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=0;
int sum=0;
int num=sc.nextInt();
System.out.println("enter a any number:"+num);
do{
sum+=i;
i++;
}
while(i<=num);
System.out.println("the sum is"+sum);
}
}



