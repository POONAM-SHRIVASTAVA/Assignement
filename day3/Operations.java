//quest18

import java.util.Scanner;
class Operations{
public static void main(){
Scanner sc =new Scanner(System.in);
int a=nextInt();
int b=nextInt();
char operator;
int Result;
operator=input.next().charAt(0);
System.out.println("enter the value one :");
System.out.println("enter the value two:");
 switch(operator){
case'+':
       Result= a+b;
       break;
case'-':
        Result=a-b;
         break;
 case'*': 
         Result=a*b;
         break;
case'/':
         Result=a/b;
          break;
}
System.out.println("Result:"+" "+Result);
}
}
         
         
