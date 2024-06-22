import java.util.Scanner;

public class Search_in_array {
    public  static  void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        Scanner sc=new Scanner(System.in);
        int searched=sc.nextInt();
        boolean found=false;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]==searched)
           {
               System.out.print("element fount at index-->"+i);
               found=true;
               break;
           }
       }
       if(found==false)
       {
           System.out.print("element is not in the array");
       }

    }
}
