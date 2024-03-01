class Fifth{
public static void main(String args[]){
int a[][]={{1,3},{2,4}};
int b[][]={{1,9},{2,4}};

int flag =1;
int n=2;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
  {
       if (a[i][j] != b[i][j])
      {
  flag =0;
      }
   }}

if(flag==1){
System.out.println("the matrix is same");
           }
else{
System.out.println("the matrix is different");
    }
}}
	     
    

