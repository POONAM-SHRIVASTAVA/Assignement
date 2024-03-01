import java.util.Scanner;
class Run{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter any value:");
int j=sc.nextInt();
for(int i=j;i!=0;i++)
{
System.out.println(i);
j=sc.nextInt();
if(j==0){
break;
}
}
}
}
 