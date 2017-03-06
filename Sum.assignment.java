class Sum {
public static void main(String args[]){
   int x=15,y=20;
    int temp;
while(y!=0){
  temp=x&y;
   x=x^y;
   y=temp<<1;
}
System.out.println(x);
}
}
