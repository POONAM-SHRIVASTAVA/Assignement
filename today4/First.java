class First{
   public static void main(String args[]){
int array[]={5,4,3,9,1,7,9};
int arraySize=array.length;
double sum=0;
double avg;
for(int i=0;i<=arraySize;i++){
sum=sum+array[i];
avg=sum/arraySize;
System.out.println("avg is:"+avg);
}
}
}
