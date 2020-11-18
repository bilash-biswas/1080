import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    
    int i,max,index;
    int[] a=new int[101];
    for(i=0;i<100;i++)
    {
        a[i]=input.nextInt();
    }
    max=a[0];
    index=1;
    for(i=1;i<100;i++)
    {
     if(a[i]>max)
    {
       max=a[i];
       index=i+1;
    }
    }
        System.out.println(max);
        System.out.println(index);
    }
}
