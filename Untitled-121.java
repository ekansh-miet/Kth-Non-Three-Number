import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        for(int i=1; ;i++){
           if(i%3!=0 && i%10!=3){
               count++;
               if(count==n){
                   System.out.println(i);
                   break;
               }
           }
          }
    }
}